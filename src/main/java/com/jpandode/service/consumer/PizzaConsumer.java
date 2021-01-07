package com.jpandode.service.consumer;

import java.util.function.Consumer;

import org.springframework.stereotype.Component;

import com.jpandode.model.PizzaRequest;
import com.jpandode.service.PizzaService;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Component
@AllArgsConstructor
@Slf4j
public class PizzaConsumer implements Consumer<PizzaRequest> {
	
	private PizzaService pizzaService;

	@Override
	public void accept(PizzaRequest pizzaRequest) {
		log.info("Pizza Delivery Information: {}", pizzaService.createPizza(pizzaRequest).toString());
	}
}
