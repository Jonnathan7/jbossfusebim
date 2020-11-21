package com.compartamos.bim.providers;

import java.io.IOException;
import java.util.Date;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdScalarSerializer;

@SuppressWarnings("serial")
public class DateSerializer extends StdScalarSerializer<Date> {

    public DateSerializer() {
        super(Date.class);
    }

    @Override
    public void serialize(Date dateTime,
                          JsonGenerator jsonGenerator,
                          SerializerProvider provider) throws IOException {    	
        String dateTimeAsString = dateTime.toString();
        jsonGenerator.writeString(dateTimeAsString);
    }
}
