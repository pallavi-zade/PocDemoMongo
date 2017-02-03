package com.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 
 * @author Silicus Technologies, 2016 ApplicationConfiguration :: Configuration
 *         class for spring MVC configurations
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com")

public class ApplicationConfiguration extends WebMvcConfigurerAdapter {

	/**
	 * addResourceHandlers : Method to handle the static and AngularJS resources
	 */
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/static/**").addResourceLocations("/static/");

	}

	/**
	 * propertySourcesPlaceholderConfigurer : Method to return a bean for
	 * reading .proerties file
	 * 
	 * @return
	 */
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {

		return new PropertySourcesPlaceholderConfigurer();
	}

}
