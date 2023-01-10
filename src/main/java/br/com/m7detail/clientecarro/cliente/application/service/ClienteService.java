package br.com.m7detail.clientecarro.cliente.application.service;

import java.util.List;
import java.util.UUID;

import br.com.m7detail.clientecarro.cliente.application.api.ClienteAlteracaoRequest;
import br.com.m7detail.clientecarro.cliente.application.api.ClienteDetalhadoResponse;
import br.com.m7detail.clientecarro.cliente.application.api.ClienteListResponse;
import br.com.m7detail.clientecarro.cliente.application.api.ClienteRequest;
import br.com.m7detail.clientecarro.cliente.application.api.ClienteResponse;

public interface ClienteService {
	ClienteResponse criaCliente(ClienteRequest clienteRequest);
	List<ClienteListResponse> buscaTodosClientes();
	ClienteDetalhadoResponse buscaClienteAtravesId(UUID idCliente);
	void deletaClienteAtravesId(UUID idCliente);
	void patchAlteraCliente(UUID idCliente, ClienteAlteracaoRequest clienteAlteracaoRequest);

}
