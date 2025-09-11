package com.brunosoft.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;

import com.brunosoft.spring.utils.SenhaUtils;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class MeuPrimeiroProjetoRealApplication {

	@Value("${paginacao.qtd_por_pagina}")
	private int qtdPorPagina;
	
	public static void main(String[] args) {
		SpringApplication.run(MeuPrimeiroProjetoRealApplication.class, args);
	}

    @Bean
    CommandLineRunner commandLineRunner() {
		return args -> {
			String senhaEncoded = SenhaUtils.gerarBCrypt("123456");
			System.out.println("Senha Encoded " + senhaEncoded);
			
			senhaEncoded = SenhaUtils.gerarBCrypt("123456");
			
			System.out.println("Senha Encoded novamente: " + senhaEncoded);
			
			System.out.println("senha valida: " + SenhaUtils.senhaValida("123456", senhaEncoded));
		};
	}

}
