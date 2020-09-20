package fr.ipst.webcand.v2.webcand.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.datatables.repository.DataTablesRepositoryFactoryBean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@ComponentScan(basePackages= {"fr.ipst.webcand.v2.webcand.backend", "fr.ipst.webcand.v2.webcand.controller",
        "fr.ipst.webcand.v2.webcand.dto", "fr.ipst.webcand.v2.webcand.dto.mapper", "fr.ipst.webcand.v2.webcand.services"})
@EntityScan("fr.ipst.webcand.v2.webcand.entities")
@EnableJpaRepositories(repositoryFactoryBeanClass = DataTablesRepositoryFactoryBean.class,
        basePackages= "fr.ipst.webcand.v2.webcand.repository")
@SpringBootApplication
public class WebcandApplication {

    public static void main(String[] args) {

        SpringApplication.run(WebcandApplication.class, args);
    }

    /*// Fix the CORS errors
    @Value("${cors.allowedOrigins}")
    private String allowedOrigins;

    @Bean
    public FilterRegistrationBean simpleCorsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        config.setAllowCredentials(true);

        // *** URL below needs to match the Vue client URL and port ***
        config.setAllowedOrigins(Collections.singletonList(allowedOrigins));
        config.setAllowedMethods(Collections.singletonList("*"));
        config.setAllowedHeaders(Collections.singletonList("*"));

        source.registerCorsConfiguration("/**", config);
        FilterRegistrationBean bean = new FilterRegistrationBean<>(new CorsFilter(source));
        bean.setOrder(Ordered.HIGHEST_PRECEDENCE);
        return bean;
    }*/

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")
                        .allowedOrigins("http://localhost:8080");
            }
        };
    }
}
