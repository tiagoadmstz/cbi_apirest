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

    public static void main(String[] args) {
        //new ConnectionManager().writeQuery();
        //new ConnectionManager().jsonInsert();
    }

    public void jsonInsert(MongoRepository mongo) {
        try {
            File file = new File("C:\\Users\\Tiago\\Documents\\NetBeansProjects\\cbi_apirest\\src\\main\\resources\\db\\migration\\V2_insert_initial_values.json");
            //FileInputStream input = new FileInputStream(file);
            String json = new String(Files.readAllBytes(file.toPath()), Charset.forName("UTF-8"));
            ObjectMapper mapper = new ObjectMapper();
            mapper.addHandler(new DeserializationProblemHandler() {
            });
            List<Marca> lista = mapper.readValue(json, new TypeReference<List<Marca>>() {
            });
            lista.forEach(marca -> mongo.save(marca));
        } catch (Exception e) {
        }
    }

    public void writeQuery() {
        try {
            ResultSet rst = new ConnectionOdbc().getSimpleResultSet("SELECT * FROM Marcas");
            String sql = "INSERT INTO CAD_MARCAS (MARCA, NOME) VALUES (%s, '%s');";
            String json = "{\n\t\"nome\":\"%s\"\n},";
            while (rst.next()) {
                //System.out.println(String.format(sql, rst.getString(1), rst.getString(2)));
                System.out.println(String.format(json, rst.getString(2)));
            }
        } catch (Exception e) {
        }
    }

}
