package mkn;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping(path = "/pizzas")
public class PizzaController {
	private final PizzaRepository repository;
	private final PizzaService service;
	
	@GetMapping
	public List<Pizza> listAll() {
		return repository.findAll();
	}
	
	@GetMapping(path = "/{id}")
	public Pizza get(@PathVariable final Long id) {
		return repository.findById(id).get();
	}
	
	@PostMapping
	public Pizza create(@RequestBody @Valid final CreatePizzaRequest request) {
		return service.create(request);
	}
	
	@PutMapping
	public Pizza update(@RequestBody @Valid final UpdatePizzaRequest request) {
		return service.update(request);
	}
	
	@DeleteMapping(path = "/{id}")
	public void delete(@PathVariable final Long id) {
		repository.deleteById(id);
	}
	
}
