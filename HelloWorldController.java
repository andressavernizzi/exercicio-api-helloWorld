package com.example.helloworld2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helloWorld")

public class HelloWorldController {

	@GetMapping
	public String helloworld() {
		return "Hello world!";
	}

	@GetMapping("/bsm")
	public String bsm() {
		return "-Persistência\n-Mentalidade de Crescimento\n-Responsabilidade Pessoal"
				+ "\n-Orientação ao Futuro\n-Orientação ao Detalhe"
				+ "\n-Trabalho em Equipe\n-Comunicação\n-Proatividade";
	}

	@GetMapping("/objetivos")
	public String objetivos() {
		return "Meu objetivo dessa semana é focar no aprendizado de api e ser proativa sempre.";
	}
}
