package br.com.m7detail.clientecarro.cliente.application.service;

import br.com.m7detail.clientecarro.cliente.application.api.ClienteRequest;
import br.com.m7detail.clientecarro.cliente.application.api.ClienteResponse;

public interface ClienteService {
	ClienteResponse criaCliente(ClienteRequest clienteRequest);

}
