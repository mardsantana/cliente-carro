package br.com.m7detail.clientecarro.cliente.domain;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.validator.constraints.br.CPF;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, unique = true, nullable = false)
	private UUID idCliente;
	@NotBlank
	private String nomeCompleto;
	@NotBlank
	@Email
	private String email;
	@NotBlank
	private String celular;
	private Sexo sexo;
	@CPF
	private String cpf;
	
	private LocalDateTime dataHoraDoCadastro;
	private LocalDateTime dataHoraDaUltimaAlteracao;
	
	public Cliente(@NotBlank String nomeCompleto,
			@NotBlank @Email String email, 
			@NotBlank String celular, Sexo sexo,
			@CPF String cpf) {
		this.nomeCompleto = nomeCompleto;
		this.email = email;
		this.celular = celular;
		this.sexo = sexo;
		this.cpf = cpf;
		this.dataHoraDoCadastro = LocalDateTime.now();
	}
	

}
