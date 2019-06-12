/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dsc.cbi.apirest.odbc;

import br.com.dsc.cbi.apirest.entities.Marca;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.DeserializationProblemHandler;
import java.io.File;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.sql.ResultSet;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Tiago
 */
public class ConnectionManager {

    private final String basePath = "C:\\Users\\Tiago\\Documents\\NetBeansProjects\\cbi_apirest\\src\\main\\resources\\db\\migration\\";

    public static void main(String[] args) {
        new ConnectionManager().writeQuery();
    }

    public String fileToJson(String fileName) {
        try {
            File file = new File(basePath.concat(fileName));
            return new String(Files.readAllBytes(file.toPath()), Charset.forName("UTF-8"));
        } catch (Exception e) {
        }
        return "";
    }

    public void jsonInsert(MongoRepository mongo, String json, TypeReference type) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.addHandler(new DeserializationProblemHandler() {
            });
            ((List<Object>) mapper.readValue(json, type)).forEach(ob -> mongo.save(ob));
        } catch (Exception e) {
        }
    }

    public void writeQuery() {
        try {
            ResultSet rst = new ConnectionOdbc().getSimpleResultSet("SELECT * FROM categoriaEquipamento");
            String sql = "INSERT INTO CAD_CATEGORIAS (CATEGORIA, NOME) VALUES (%s, '%s');";
            String json = "{\n\t\"nome\":\"%s\"\n},";
            int cont = 1;
            while (rst.next()) {
                //System.out.println(String.format(sql, cont++, rst.getString(1)));
                System.out.println(String.format(json, rst.getString(1)));
            }
        } catch (Exception e) {
        }
    }

}
