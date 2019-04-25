package com.springboot.example.demo.config;

import javax.validation.constraints.NotBlank;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(value="classpath:mail.properties",ignoreUnknownFields = false,prefix = "mail")
public class MailProperties {
	@NotBlank
	private int port;
	private float version;
	private String address;
	private String type;

}
