package com.Currency.Calc.feign;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.Currency.Calc.bean.CurrencyCalcBean;

@FeignClient("CURRENCYHQ")
public interface CurrencyConverterClient {
    @GetMapping("/currency-rate/from/{from}/to/{to}")
    CurrencyCalcBean convertCurrency(@PathVariable("from") String from, @PathVariable("to") String to);
}
