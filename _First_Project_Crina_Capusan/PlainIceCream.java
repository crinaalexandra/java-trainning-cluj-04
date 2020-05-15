package com.company;

public class PlainIceCream implements IceCream {

    public PlainIceCream() {
        super();

        System.out.println("IceCream base added");
    }

    public String getDescription() {
        return "IceCream base";
    }

    public double getPrice() {
        return 5.00;
    }
}
