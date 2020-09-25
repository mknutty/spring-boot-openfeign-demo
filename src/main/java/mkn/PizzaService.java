package mkn;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PizzaService {
	private PizzaRepository repository;

	@Transactional
	public Pizza create(CreatePizzaRequest request) {
		return repository.save(new Pizza().setOrderedBy(request.getOrderedBy()).setType(request.getType()));
	}
	
	@Transactional
	public Pizza update(UpdatePizzaRequest request) {
		Pizza pizza = repository.findById(request.getId()).get();
		return repository.save(pizza.setType(request.getType()));
	}

}
