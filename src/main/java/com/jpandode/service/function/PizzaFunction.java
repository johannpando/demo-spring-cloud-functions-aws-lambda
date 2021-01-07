package com.jpandode.service.function;

import java.util.function.Function;

import org.springframework.stereotype.Component;

import com.jpandode.model.PizzaRequest;
import com.jpandode.model.PizzaResponse;
import com.jpandode.service.PizzaService;

import lombok.AllArgsConstructor;

@Component(value = "pizza")
@AllArgsConstructor
public class PizzaFunction implements Function<PizzaRequest, PizzaResponse> {

	private PizzaService pizzaService;

	@Override
	public PizzaResponse apply(PizzaRequest pizzaRequest) {
		return pizzaService.createPizza(pizzaRequest);
	}
	
	
}
