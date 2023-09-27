package com.practicespring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:compractice.properties")
@ComponentScan(basePackages = "com.practicespring")
public class StudentConfig {

}
