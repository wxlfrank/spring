package org.learn.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(basePackages = { "org.learn" }, excludeFilters = {
		@Filter(type = FilterType.ANNOTATION, value = EnableWebMvc.class) })
public class AppConfig {
}
