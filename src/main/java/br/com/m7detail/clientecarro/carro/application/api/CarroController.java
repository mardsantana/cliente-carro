package br.com.m7detail.clientecarro.carro.application.api;

import java.util.UUID;

import org.springframework.web.bind.annotation.RestController;

import br.com.m7detail.clientecarro.carro.application.service.CarroService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@RestController
@Log4j2
@RequiredArgsConstructor
public class CarroController implements CarroAPI {
	private final CarroService carroService;

	@Override
	public CarroResponse postCarro(UUID idCliente, @Valid CarroRequest carroRequest) {
		log.info("[inicia] CarroController - postCarro");
		log.info("[idCliente] {}", idCliente);
		CarroResponse carro = carroService.criaCarro(idCliente, carroRequest);
		log.info("[finaliza] CarroController - postCarro");
		return carro;
	}

}
