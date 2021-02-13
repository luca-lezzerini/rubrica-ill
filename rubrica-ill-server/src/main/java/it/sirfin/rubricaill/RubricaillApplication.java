package it.sirfin.rubricaill;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"it.sirfin.rubricaill"})
@EnableJpaRepositories(basePackages = {"it.sirfin.rubricaill.repository"})
@EntityScan(basePackages = {"it.sirfin.rubricaill.model"})
public class RubricaillApplication {

    public static void main(String[] args) {
        SpringApplication.run(RubricaillApplication.class, args);
    }

}
