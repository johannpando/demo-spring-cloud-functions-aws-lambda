package com.jpandode.service;

import com.jpandode.model.PizzaRequest;
import com.jpandode.model.PizzaResponse;

public interface PizzaService {

	PizzaResponse createPizza(PizzaRequest pizzaRequest);
}
