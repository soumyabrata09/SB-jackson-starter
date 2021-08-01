package com.sam09.lib.sbjacksonstarter.jackson.serializer;

import java.math.BigDecimal;

public class JsonMoney {
    private String currency;
    private BigDecimal amount;

    private JsonMoney(){}

    public JsonMoney(String currency,BigDecimal amount){
        this.currency = currency;
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public BigDecimal getAmount() {
        return amount;
    }
}
