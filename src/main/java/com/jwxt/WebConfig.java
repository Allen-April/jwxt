package com.jwxt;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @version 1.0111gjhghj
 * @ClassName WebConfighjk
 * @Descript
 * @Author Allen
 * @Date 9/7/2024 上午11:08
 **/
//设置跨源资源共享（CORS）策略

//标记这个类为Spring的配置类。
@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // 应用于所有请求
                .allowedOrigins("http://localhost:7000") // 使用模式匹配允许的源
                .allowedMethods("GET", "POST", "PUT", "DELETE") // 允许的方法
                .allowedHeaders("*") // 允许的头
                .allowCredentials(true); // 是否允许证书
    }
}