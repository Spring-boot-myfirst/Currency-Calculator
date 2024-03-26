package com.Currency.Calc.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Currency.Calc.bean.CurrencyCalcBean;
import com.Currency.Calc.feign.CurrencyConverterClient;

@Service
public class CurrencyCalcService {

    @Autowired
    private CurrencyConverterClient currencyConverterClient;

    public CurrencyCalcBean getConvertedDetails(String from, String to, BigDecimal quantity) {
        try {
            CurrencyCalcBean response = currencyConverterClient.convertCurrency(from, to);
            return new CurrencyCalcBean(response.getId(), from, to, quantity.multiply(response.getConversionRate()),
                    response.getConversionRate());
        } catch (Exception e) {
            e.printStackTrace();
            return new CurrencyCalcBean(); // Return a default response
        }
    }
}
