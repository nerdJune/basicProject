package io.jh.main.component;

import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class SwaggerComponent {
    @Bean
    public OpenAPI openAPI() {
        Info info = new Info()
                            .title("JH TEST API")
                            .version("3.0.0")
                            .description("Spring Boot를 이용한 Demo 웹 애플리케이션 API입니다.")
                            .contact(new Contact().name("jini").url("https://blog.jiniworld.me/").email("jini@jiniworld.me"));

        return new OpenAPI()
                .components(new Components())
                .info(info);
    }
}
