package br.com.m7detail.clientecarro.cliente.application.service;

import java.util.List;

import br.com.m7detail.clientecarro.cliente.application.api.ClienteListResponse;
import br.com.m7detail.clientecarro.cliente.application.api.ClienteRequest;
import br.com.m7detail.clientecarro.cliente.application.api.ClienteResponse;

public interface ClienteService {
	ClienteResponse criaCliente(ClienteRequest clienteRequest);

	List<ClienteListResponse> buscaTodosClientes();

}
