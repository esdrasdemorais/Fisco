
package com.esdrasmorais.cashflow.domain.model;

public class Product extends IdentifiedDomainObject {
    private Integer code;
    private String description;
    private Integer quantity;
    private Unity unity;
    private Float price;
    private Integer selledQuantity;
    private Short rating;

    public Integer getCode() {
        return this.code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setDescription(String description) {
        if (description.trim().length() < 3)
            throw new IllegalArgumentException("Descricao Invalida.");
        this.description = description.trim();
    }

    public String getDescription() {
        return this.description;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public Unity getUnity() {
        return this.unity;
    }

    public void setUnity(Unity unity) {
        this.unity = unity;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getPrice() {
        return this.price;
    }

    public void setSelledQuantity(Integer selledQuantity) {
        this.selledQuantity = selledQuantity;
    }

    public Integer getSelledQuantity() {
        return this.selledQuantity;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }
}
