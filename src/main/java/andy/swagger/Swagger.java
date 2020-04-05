package andy.swagger;

import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

/**
 * SWAGGER_2 API接口文档配置文件
 * 访问地址：http://localhost:8082/swagger-ui.html
 * @author crg
 */
@Configuration
@EnableSwagger2
public class Swagger {

    @Bean
    public Docket createRestApi() {
        ParameterBuilder parameterBuilder = new ParameterBuilder();
        List<Parameter> pars = new ArrayList<Parameter>();
        parameterBuilder.name("token").description("令牌：用户登陆成功后需传").modelRef(new ModelRef("string")).
                parameterType("header").required(true).build();
        pars.add(parameterBuilder.build());

        ParameterBuilder parameterBuilder1 = new ParameterBuilder();
        parameterBuilder1.name("accessKey").description("accessKey").modelRef(new ModelRef("string")).
                parameterType("header").required(false).build();
        pars.add(parameterBuilder1.build());

        ParameterBuilder parameterBuilder2 = new ParameterBuilder();
        parameterBuilder2.name("reqTime").description("reqTime").modelRef(new ModelRef("string")).
                parameterType("header").required(false).build();
        pars.add(parameterBuilder2.build());

        ParameterBuilder parameterBuilder3 = new ParameterBuilder();
        parameterBuilder3.name("sign").description("sign").modelRef(new ModelRef("string")).
                parameterType("header").required(false).build();
        pars.add(parameterBuilder3.build());

        return new Docket(DocumentationType.SWAGGER_2)
                //当前环境是否可访问swagger
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                .paths(PathSelectors.any())
                .build()
                .globalOperationParameters(pars);
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Andy - api文档")
                .description("")
                .termsOfServiceUrl("")
                .version("1.0.0")
                .build();
    }
}
