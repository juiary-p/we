package com.juhee.we.config;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@RequiredArgsConstructor
@Configuration
@PropertySource("classpath:application.properties")
public class WebConfig implements WebMvcConfigurer {
    private final Environment environment;

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/files/**")
                .addResourceLocations("file://D:/");
        // linux - root에서 시작하는 폴더 경로 set : .addResourceLocations("file:/DATA/files");
    }

    /**
     * application.properties 설정 조회
     *
     * @param key
     * @return
     */
    public String getProperty(String key) {
        return environment.getProperty(key);
    }
}
