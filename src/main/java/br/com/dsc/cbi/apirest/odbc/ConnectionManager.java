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
            ResultSet rst = new ConnectionOdbc().getSimpleResultSet("SELECT * FROM [Dados de Bobinagem]");
            String sql = "INSERT INTO DADOS_BOBINAGEM ("
                    + "ID, OS, DATA_REALIZACAO, NOME_CLIENTE, PRAZO_FINALIZACAO, PRAZO_REBOBINAMENTO, PRAZO_MONTAGEM,"
                    + "PLACA, CATEGORIA, NUMERO_SERIE, MARCA, POTENCIA, MODELO, DATA_FABRICACAO, RPM,"
                    + "TENSAO, CORRENTE, ENROLAMENTO_FABRICA, PATRIMONIO, FORMA_CONSTRUTIVA, CAIXA_LIGACAO, ACOPLAMENTO,"
                    + "CABOS, FECHAMENTO, COMPRIMENTO, DIAMETRO, RANHURAS, CAMADA, PASSO, ESPIRAS,"
                    + "FIO, SECCAO, PASSO_AUX, ESPIRAS_AUX, FIO_AUX, SECCAOAUX, PESO, LIGACAO,"
                    + "INFORCOES_ADICIONAIS, CAUSA_QUEIMA, OBSERVACOES, NOTA_FISCAL, NUMERO_FORMA, CALCO, ANEXOS,"
                    + "FECHADO, VIBRACAO, PALETE"
                    + ") VALUES (%s, '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s')";
            //+ ", '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s'"
            //+ ", '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s', '%s'"
            //+ ");";
            String json = "{\n\t\"nome\":\"%s\"\n},";
            int cont = 1;
            while (rst.next()) {
                System.out.println(String.format(sql, rst.getString(1), rst.getString(3), rst.getString(4), rst.getString(5), rst.getString(6), rst.getString(7), rst.getString(8), rst.getString(9), rst.getString(10), rst.getString(11), rst.getString(12), rst.getString(13), rst.getString(14), rst.getString(15), rst.getString(16)));
                //System.out.println(String.format(json, rst.getString(1)));
                //System.out.println(rst.getString(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
