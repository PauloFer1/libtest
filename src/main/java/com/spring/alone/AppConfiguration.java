package com.spring.alone;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.spring.alone")
@PropertySource("classpath:application.properties")
public class AppConfiguration {

}
