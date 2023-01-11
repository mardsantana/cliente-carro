package br.com.m7detail.clientecarro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class ClienteCarroApplication {

	@GetMapping
	public String getHomeTeste() {
		return "Cliente Carro - API Home";
	}

	public static void main(String[] args) {
		SpringApplication.run(ClienteCarroApplication.class, args);
	}

}
