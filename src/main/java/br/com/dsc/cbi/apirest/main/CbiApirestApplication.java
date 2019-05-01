package br.com.dsc.cbi.apirest.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@ComponentScan(basePackages = {
    "br.com.desc.cbi.apirest"
})
@SpringBootApplication
public class CbiApirestApplication {

    public static void main(String[] args) {
        SpringApplication.run(CbiApirestApplication.class, args);
    }

}
