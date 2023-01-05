package br.com.m7detail.clientecarro.cliente.application.api;

import java.time.LocalDateTime;
import java.util.UUID;

import br.com.m7detail.clientecarro.cliente.domain.Cliente;
import lombok.Value;

@Value
public class ClienteDetalhadoResponse {
	private UUID idCliente;
	private String nomeCompleto;
	private String email;
	private String celular;
	private String cpf;
	private LocalDateTime dataHoraDoCadastro;
	
	public ClienteDetalhadoResponse(Cliente cliente) {
		this.idCliente = cliente.getIdCliente();
		this.nomeCompleto = cliente.getNomeCompleto();
		this.email = cliente.getEmail();
		this.celular = cliente.getCelular();
		this.cpf = cliente.getCpf();
		this.dataHoraDoCadastro = cliente.getDataHoraDoCadastro();
		
	}


}
