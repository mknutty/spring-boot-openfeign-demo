package mkn;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Component
@AllArgsConstructor
@Slf4j
public class OpenFeignCommandLineRunner implements CommandLineRunner {
	private PizzaClient pizzaClient;
	
	@Override
	public void run(String... args) throws Exception {
		log.info("*** No pizzas yet");
		pizzaClient.listAll().forEach(pizza -> log.info("*** List Pizzas - " + pizza));
		
		log.info("*** Creating pizzas");
		pizzaClient.create(new CreatePizzaRequest().setOrderedBy("Mark").setType("Supreme"));
		pizzaClient.create(new CreatePizzaRequest().setOrderedBy("Robin").setType("Margarita"));
		
		pizzaClient.listAll().forEach(pizza -> log.info("*** List Pizzas - " + pizza));
		
		log.info("*** Get Pizza 1 - " + pizzaClient.get(1L));

		log.info("*** Updating pizzas");
		pizzaClient.update(new UpdatePizzaRequest().setId(1l).setType("Meat Lovers"));
		
		pizzaClient.listAll().forEach(pizza -> log.info("*** List Pizzas - " + pizza));
		
		log.info("*** Deleting Pizzas");
		pizzaClient.delete(2L);
		
		pizzaClient.listAll().forEach(pizza -> log.info("*** List Pizzas - " + pizza));
		
		log.info("Pizza out!");
		
		System.exit(0);
		
	}

}
