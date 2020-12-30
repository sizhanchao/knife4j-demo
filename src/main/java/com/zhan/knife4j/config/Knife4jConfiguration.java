package com.zhan.knife4j.config;

import com.github.xiaoymin.knife4j.spring.extension.OpenApiExtensionResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

/**
 * @author zhan
 * @since 2020-12-30 15:22
 *
 * swagger2.x中启动swagger是使用 @EnableSwagger2注解
 * 在swagger3.x中拆分为 @EnableSwagger2WebMvc(传统servlet模式) @EnableSwagger2WebFlux(webflux模式) 分别适配不同模式
 */
@Configuration
@EnableSwagger2WebMvc
public class Knife4jConfiguration {
    private final OpenApiExtensionResolver openApiExtensionResolver;

    @Autowired
    public Knife4jConfiguration(OpenApiExtensionResolver openApiExtensionResolver) {
        this.openApiExtensionResolver = openApiExtensionResolver;
    }

    @Bean(value = "defaultApi2")
    public Docket defaultApi2() {
        Docket docket = new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(new ApiInfoBuilder()
                        .title("成者为王ABO")
                        .description("# knife4j-demo RESTful APIs")
                        .termsOfServiceUrl("http://www.dogedoge.com/")
                        .contact("1056491839@qq.com")
                        .version("1.0")
                        .build())
                //分组名称
                .groupName("alpha")
                .select()
                //这里指定Controller扫描包路径
                .apis(RequestHandlerSelectors.basePackage("com.zhan.knife4j.controller"))
                .paths(PathSelectors.any())
                .build()
                .extensions(openApiExtensionResolver.buildExtensions("alpha"));
        return docket;
    }
}
