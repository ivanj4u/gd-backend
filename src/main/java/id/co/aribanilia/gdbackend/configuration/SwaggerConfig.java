package id.co.aribanilia.gdbackend.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by ivan_j4u on 2/22/2017.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .apiInfo(appInfo());
    }

    private ApiInfo appInfo() {
        ApiInfo apiInfo = new ApiInfo(
                "API Gadai Online",
                "API untuk Pegadaian Digital",
                "0.1",
                "",
                getContact(),
                "Copyright PT Pegadaian (Persero)",
                "https://www.pegadaian.co.id"
        );
        return apiInfo;
    }

    private Contact getContact() {
        return new Contact("Ivan Aribanilia","https://www.faceboook.com","ivan.aribanilia@pegadaian.co.id");
    }
}