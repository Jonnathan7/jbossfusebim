package com.compartamos.bim.providers;

import java.util.Date;

import com.fasterxml.jackson.databind.module.SimpleModule;

import com.compartamos.bim.providers.DateDeserializer;
import com.compartamos.bim.providers.DateSerializer;

@SuppressWarnings("serial")
public class DateModule extends SimpleModule {

    public DateModule() {
        super();
        addSerializer(Date.class, new DateSerializer());
        addDeserializer(Date.class, new DateDeserializer());
    }
}