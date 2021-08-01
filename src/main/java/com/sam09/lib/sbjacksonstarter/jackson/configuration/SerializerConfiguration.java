package com.sam09.lib.sbjacksonstarter.jackson.configuration;

import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.ANY;
import static com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE;
import static com.fasterxml.jackson.annotation.PropertyAccessor.*;
import static com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES;
import static com.fasterxml.jackson.databind.SerializationFeature.FAIL_ON_EMPTY_BEANS;
import static com.fasterxml.jackson.databind.SerializationFeature.WRITE_DATES_AS_TIMESTAMPS;

@Configuration("jackson")
@ConditionalOnClass
public class SerializerConfiguration {
    @Bean
    @Primary
    @ConditionalOnMissingBean
    public ObjectMapper objectMapper(){
        return new ObjectMapper()
                .configure(MapperFeature.DEFAULT_VIEW_INCLUSION,false)
                .setVisibility(FIELD,ANY)
                .setVisibility(GETTER,NONE)
                .setVisibility(IS_GETTER,NONE)
                .disable(WRITE_DATES_AS_TIMESTAMPS)
                .disable(FAIL_ON_EMPTY_BEANS)
                .disable(FAIL_ON_UNKNOWN_PROPERTIES)
                .registerModule(new JavaTimeModule())
                .findAndRegisterModules();
    }
}
