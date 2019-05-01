/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dsc.cbi.apirest.config;

import java.util.HashMap;
import java.util.Map;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.flyway.FlywayDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 *
 * @author Tiago
 */
@Configuration
@FlywayDataSource
@EnableTransactionManagement
@EnableJpaRepositories(
        entityManagerFactoryRef = "derbyEntityManagerFactory",
        basePackages = "br.com.sres.rest.api.derby.repositories"
)
public class DerbyDataSourceConfig {

    @Bean(name = "derbyDataSource")
    @ConfigurationProperties(prefix = "derby.datasource")
    public DataSource derbyDataSource() {
        return DataSourceBuilder.create()
                .driverClassName("org.apache.derby.jdbc.ClientDriver")
                .url("jdbc:derby://localhost:1527/CBI/DB")
                .username("root")
                .password("Pedro1714@#$")
                .build();
    }

    @Bean(name = "derbyEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean derbyEntityManagerFactory(
            EntityManagerFactoryBuilder builder,
            @Qualifier("derbyDataSource") DataSource dataSource) {
        return builder.dataSource(dataSource)
                .packages("br.com.sres.enumerates",
                        "br.com.sres.rest.api.derby.entities")
                .properties(getProperties())
                .persistenceUnit("derbyPU")
                .build();
    }

    @Bean(name = "derbyTransactionManager")
    public PlatformTransactionManager derbyTransactionManager(
            @Qualifier("derbyEntityManagerFactory") LocalContainerEntityManagerFactoryBean entityManagerFactory) {
        return new JpaTransactionManager(entityManagerFactory.getObject());
    }

    public Map<String, String> getProperties() {
        Map<String, String> map = new HashMap();
        map.put("hibernate.hbm2ddl.auto", "none");
        map.put("hibernate.dialect", "org.hibernate.dialect.DerbyDialect");
        
        return map;
    }

}
