package mkn;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@FeignClient(name = "pizzaClient", url = "http://localhost:${server.port}/pizzas")
public interface PizzaClient {
	
	@GetMapping
	public List<Pizza> listAll();
	
	@GetMapping(path = "/{id}")
	public Pizza get(@PathVariable Long id);
	
	@PostMapping
	public Pizza create(CreatePizzaRequest request);
	
	@PutMapping
	public Pizza update(UpdatePizzaRequest request) ;
	
	@DeleteMapping(path = "/{id}")
	public void delete(@PathVariable Long id);
	
}