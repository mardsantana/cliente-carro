package br.com.m7detail.clientecarro.cliente.application.api;

import java.util.List;
import java.util.UUID;

import br.com.m7detail.clientecarro.cliente.domain.Cliente;

public class ClienteListResponse {
	private UUID idCliente;
	private String nomeCompleto;
	private String email;
	private String celular;
	private String cpf;
	
	public static List<ClienteListResponse> converte(List<Cliente> clientes) {
		return null;
	}

}
