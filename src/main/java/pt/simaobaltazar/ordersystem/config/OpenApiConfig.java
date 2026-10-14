package pt.simaobaltazar.ordersystem.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI orderSystemOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Order System")
                        .description("REST API for managing an online store: users, products, categories and orders.")
                        .version("1.0.0"));
    }
}
