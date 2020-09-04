package fr.ipst.webcand.v2.webcand.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.datatables.repository.DataTablesRepositoryFactoryBean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@ComponentScan(basePackages= {"fr.ipst.webcand.v2.webcand.backend", "fr.ipst.webcand.v2.webcand.controller",
        "fr.ipst.webcand.v2.webcand.dto", "fr.ipst.webcand.v2.webcand.mapper", "fr.ipst.webcand.v2.webcand.services"})
@EntityScan("fr.ipst.webcand.v2.webcand.entities")
@EnableJpaRepositories(repositoryFactoryBeanClass = DataTablesRepositoryFactoryBean.class,
        basePackages= "fr.ipst.webcand.v2.webcand.repository")
@SpringBootApplication
public class WebcandApplication {

    public static void main(String[] args) {

        SpringApplication.run(WebcandApplication.class, args);
    }

}
