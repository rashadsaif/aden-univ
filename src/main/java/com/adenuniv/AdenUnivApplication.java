package com.adenuniv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.adenuniv.conf.SwaggerConfig;

@SpringBootApplication
@Import(SwaggerConfig.class)
public class AdenUnivApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdenUnivApplication.class, args);
	}
}
