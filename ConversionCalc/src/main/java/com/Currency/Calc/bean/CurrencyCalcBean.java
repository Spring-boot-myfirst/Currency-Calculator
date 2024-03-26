package com.Currency.Calc.bean;

import java.math.BigDecimal;

public class CurrencyCalcBean {
	
	private Integer id;
	private String currencyfrom;
	private String currencyto;
	private BigDecimal calculatedamount;
	private BigDecimal conversionRate;
	
	public CurrencyCalcBean() {

	}
	public CurrencyCalcBean(Integer id, String currencyfrom, String currencyto, BigDecimal calculatedamount,
			BigDecimal conversionRate) {
		super();
		this.id = id;
		this.currencyfrom = currencyfrom;
		this.currencyto = currencyto;
		this.calculatedamount = calculatedamount;
		this.conversionRate = conversionRate;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCurrencyfrom() {
		return currencyfrom;
	}
	public void setCurrencyfrom(String currencyfrom) {
		this.currencyfrom = currencyfrom;
	}
	public String getCurrencyto() {
		return currencyto;
	}
	public void setCurrencyto(String currencyto) {
		this.currencyto = currencyto;
	}
	public BigDecimal getCalculatedamount() {
		return calculatedamount;
	}
	public void setCalculatedamount(BigDecimal calculatedamount) {
		this.calculatedamount = calculatedamount;
	}
	public BigDecimal getConversionRate() {
		return conversionRate;
	}
	public void setConversionRate(BigDecimal conversionRate) {
		this.conversionRate = conversionRate;
	}
	
	


}
