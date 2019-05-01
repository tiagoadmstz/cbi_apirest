/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dsc.cbi.apirest.config;

import org.flywaydb.core.Flyway;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Tiago
 */
@Configuration
public class FlywayConfig {

    public FlywayConfig() {
        //Flyway flyway = Flyway.configure().dataSource("jdbc:derby://localhost:1527/CBI/DB", "root", "Pedro1714@#$").load();
        Flyway flyway = Flyway.configure().dataSource(new DerbyDataSourceConfig().derbyDataSource()).load();
        flyway.migrate();
    }

}
