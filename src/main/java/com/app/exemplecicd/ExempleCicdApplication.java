package com.app.exemplecicd;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@OpenAPIDefinition(info = @Info(title = "API Exemple CI-CD", version = "3.0"))
public class ExempleCicdApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExempleCicdApplication.class, args);
    }

}
