package one.digitalinnovation.gof.controller;

import one.digitalinnovation.gof.model.Cliente;
import one.digitalinnovation.gof.model.Empresa;
import one.digitalinnovation.gof.service.BrasilApiService;
import one.digitalinnovation.gof.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("empresa")
public class EmpresaRestController {

	@Autowired
	private BrasilApiService brasilApiService;

	@GetMapping("/{cnpj}")
	public ResponseEntity<Empresa> buscarPorCnpj(@PathVariable String cnpj) {
		return ResponseEntity.ok(brasilApiService.consultarCnpj(cnpj));
	}

}
