package com.petromirdzhunev.spring.boot.json;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;

import com.petromirdzhunev.json.conversion.api.JsonConverter;
import com.petromirdzhunev.json.converter.jackson.JacksonJsonConverter;

import tools.jackson.databind.json.JsonMapper;

@AutoConfiguration
@ConditionalOnBean(JsonConverter.class)
class SpringBootJsonAutoConfiguration {

	@Bean
	JsonConverter jacksonJsonConverter(final JsonMapper jsonMapper) {
		return new JacksonJsonConverter(jsonMapper);
	}
}
