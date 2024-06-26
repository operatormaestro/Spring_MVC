package ru.netology.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

@Configuration
public class WebConfiguration {
    @Bean
    public RequestMappingHandlerAdapter requestMappingHandlerAdapter() {
        RequestMappingHandlerAdapter bean = new RequestMappingHandlerAdapter();
        bean.getMessageConverters().add(new GsonHttpMessageConverter());
        return bean;
    }
}