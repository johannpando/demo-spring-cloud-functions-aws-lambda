package com.jpandode.service.supplier;

import java.util.function.Supplier;

import org.springframework.stereotype.Component;

import com.jpandode.model.PizzaRequest;
import com.jpandode.model.PizzaResponse;
import com.jpandode.service.PizzaService;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class PizzaSupplier implements Supplier<PizzaResponse> {

	private PizzaService pizzaService;

    @Override
    public PizzaResponse get() {

    	PizzaRequest companyRq = new PizzaRequest();
		companyRq.setPizzaName("American Pizza");
		return pizzaService.createPizza(companyRq);
    }
}
