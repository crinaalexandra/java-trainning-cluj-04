package com.company;

public class Chocolate extends ToppingDecorator {

    public Chocolate(IceCream newIceCream) {
        super(newIceCream);

        System.out.println("Chocolate chips added");
    }

    public String getDescription(){
        return tempIceCream.getDescription() + ", Chocolate chips";
    }

    public double getPrice(){
        return tempIceCream.getPrice() + 1;
    }

}
