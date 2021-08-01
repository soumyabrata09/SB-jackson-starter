package com.sam09.lib.sbjacksonstarter.jackson.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import org.joda.money.BigMoney;

import java.io.IOException;

public class BigMoneySerializer extends StdSerializer<BigMoney> {
    public BigMoneySerializer(){
        super(BigMoney.class);
    }

    @Override
    public void serialize(BigMoney bigMoney, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        JsonMoney money = new JsonMoney(bigMoney.getCurrencyUnit().toString(),bigMoney.getAmount());
        jsonGenerator.writeObject(money);
    }
}
