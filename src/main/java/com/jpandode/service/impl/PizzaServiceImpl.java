package com.jpandode.service.impl;

import java.time.LocalDate;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.jpandode.model.PizzaRequest;
import com.jpandode.model.PizzaResponse;
import com.jpandode.service.PizzaService;

@Service
public class PizzaServiceImpl implements PizzaService {

	@Override
	public PizzaResponse createPizza(PizzaRequest pizzaRequest) {
		final String pizzaDeliveryId = generateId();
		final String pizzaName = getPizzaName(pizzaRequest.getPizzaName());

		return PizzaResponse.builder().id(pizzaDeliveryId).pizzaName(pizzaName).deliveryDate(LocalDate.now()).build();

	}

	private String generateId() {
		return UUID.randomUUID().toString();
	}

	private String getPizzaName(final String pizzaName) {
		return pizzaName.toUpperCase();
	}

}
