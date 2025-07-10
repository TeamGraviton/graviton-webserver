package com.graviton.webserver;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/home").setViewName("abc");
		registry.addViewController("/").setViewName("abc");
		registry.addViewController("/hello").setViewName("abc");
		registry.addViewController("/login").setViewName("abc");
	}

}