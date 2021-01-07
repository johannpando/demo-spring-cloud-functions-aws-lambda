package com.jpandode.model;

import java.time.LocalDate;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PizzaResponse {
	
	private String id;
	private String pizzaName;
	private LocalDate deliveryDate;
	
}
