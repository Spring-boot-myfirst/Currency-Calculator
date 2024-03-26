package com.Currency.Calc.controller;

import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.Currency.Calc.bean.CurrencyCalcBean;
import com.Currency.Calc.service.CurrencyCalcService;



@RestController
public class CurrencyCalcController {
	
	@Autowired
	private CurrencyCalcService response;
	@GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyCalcBean getresult(@PathVariable("from") String from, @PathVariable("to") String to,@PathVariable("quantity") BigDecimal quantity) {
		
		return response.getConvertedDetails(from, to, quantity);
			
		
	}

}
