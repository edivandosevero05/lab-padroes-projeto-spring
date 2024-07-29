package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.model.Empresa;
import one.digitalinnovation.gof.model.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "brasilapi", url = "https://brasilapi.com.br/api")
public interface BrasilApiService {

	@GetMapping("/cnpj/v1/{cnpj}")
	Empresa consultarCnpj(@PathVariable("cnpj") String cnpj);
}
