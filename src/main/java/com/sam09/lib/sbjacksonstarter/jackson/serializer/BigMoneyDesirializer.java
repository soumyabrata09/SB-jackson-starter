package com.sam09.lib.sbjacksonstarter.jackson.serializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import org.joda.money.BigMoney;
import org.joda.money.CurrencyUnit;

import java.io.IOException;
import java.math.BigDecimal;

import static org.joda.money.CurrencyUnit.USD;

public class BigMoneyDesirializer extends StdDeserializer<BigMoney> {
    public BigMoneyDesirializer(){
        super(BigMoney.class);
    }

    @Override
    public BigMoney deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        try{
            JsonMoney money = jsonParser.readValueAs(JsonMoney.class);
            if (money.getCurrency() == null || money.getAmount() == null){
                return null;
            }
            return BigMoney.of(CurrencyUnit.of(money.getCurrency()),money.getAmount());
        }
        catch (JsonMappingException ex){
            return BigMoney.of(USD,jsonParser.readValueAs(BigDecimal.class));
        }
    }
}
