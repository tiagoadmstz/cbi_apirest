/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dsc.cbi.apirest.config;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

/**
 *
 * @author Tiago
 */
@Configuration
public class MongoDbConfiguration extends AbstractMongoConfiguration {

    @Override
    protected String getDatabaseName() {
        return "CBI_DB";
    }

    @Override
    public MongoClient mongoClient() {
        return new MongoClient(new MongoClientURI("mongodb+srv://root:Pedro1714%40%23%24@cluster0-j2bue.mongodb.net/test?retryWrites=true&w=majority"));
    }

    @Override
    protected String getMappingBasePackage() {
        return "br.com.dsc.cbi.apirest.entities";
    }

}
