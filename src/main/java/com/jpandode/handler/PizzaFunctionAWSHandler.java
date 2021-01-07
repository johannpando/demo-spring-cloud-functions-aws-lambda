package com.jpandode.handler;

import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

import com.jpandode.model.PizzaRequest;
import com.jpandode.model.PizzaResponse;

public class PizzaFunctionAWSHandler extends SpringBootRequestHandler<PizzaRequest, PizzaResponse> {

}
