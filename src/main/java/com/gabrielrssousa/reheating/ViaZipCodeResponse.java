package com.gabrielrssousa.reheating;

import lombok.Getter;
import lombok.Setter;

public class ViaZipCodeResponse {

    @Getter
    @Setter
    private String zipCode;
    private String publicArea;
    private String locality;

    @Override
    public String toString() {
        return "ViaZipCodeResponse{" +
                "Zip Code:'" + zipCode + '\'' +
                ", logradouro:'" + publicArea + '\'' +
                ", localidade:'" + locality + '\'' +
                '}';
    }
}
