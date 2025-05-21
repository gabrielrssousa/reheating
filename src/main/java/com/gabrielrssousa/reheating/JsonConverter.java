package com.gabrielrssousa.reheating;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JsonConverter {
    @Autowired
    private Gson gson;
    public ViaZipCodeResponse convert(String json){
        ViaZipCodeResponse response = gson.fromJson(json, ViaZipCodeResponse.class);
        return response;
    }
}
