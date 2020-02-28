package com.es2.factorymethod;

public class Computer implements Product {
    private String brand;

    protected Computer() {
    }


    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public void setBrand(String _brand) {
        this.brand = _brand;
    }
}
