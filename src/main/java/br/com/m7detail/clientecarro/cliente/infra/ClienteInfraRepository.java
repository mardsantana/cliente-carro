package br.com.m7detail.clientecarro.cliente.infra;

import org.springframework.stereotype.Repository;

import br.com.m7detail.clientecarro.cliente.application.repository.ClienteRepository;
import br.com.m7detail.clientecarro.cliente.domain.Cliente;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
public class ClienteInfraRepository implements ClienteRepository {

	@Override
	public Cliente salva(Cliente cliente) {
		log.info("[inicia] ClienteInfraRepository - salva");
		log.info("[finaliza] ClienteInfraRepository - salva");
		return cliente;
	}

}
