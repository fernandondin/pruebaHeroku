package com.axolotlsolutions.sistemaolimpiadas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.templatemode.TemplateMode;

@SpringBootApplication
public class SistemaolimpiadasApplication {
	@Autowired
		ApplicationContext applicationContext;
	@Bean
	public SpringResourceTemplateResolver templateResolver() {
		SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
		templateResolver.setApplicationContext(this.applicationContext);
		templateResolver.setPrefix("classpath:/templates/");
		templateResolver.setSuffix(".html");
		templateResolver.setTemplateMode(TemplateMode.HTML);
		//We need change to true when we put the system into production
		templateResolver.setCacheable(false);
		return templateResolver;
	}
	public static void main(String[] args) {
		SpringApplication.run(SistemaolimpiadasApplication.class, args);
	}

}
