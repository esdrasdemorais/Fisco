
package com.esdrasmorais.cashflow.domain.model;

//import org.springframework.data.annotation.Id;

public class PhoneNumber {
    //@Id
    private Long id;
    private Short code;
    private Short ddd;
    private Integer number;

    public PhoneNumber(Short code, Short ddd, Integer number) {
        this.code = code;
        this.ddd = ddd;
        this.number = number;
    }
}
