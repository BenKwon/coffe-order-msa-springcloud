package com.example.orderserviceapi.domain;
import javax.validation.constraints.Size;

public class Menu {
    private String name;
    private Integer price;

    public Menu(String name, Integer price) {
        this.name = name;
        this.price = price;
    }
    public Menu() {
    }


    @Size(min=2)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }


}
