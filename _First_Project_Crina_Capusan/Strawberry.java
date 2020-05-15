package com.company;

import com.company.IceCream;
import com.company.ToppingDecorator;

public class Strawberry extends ToppingDecorator {

    public Strawberry(IceCream newIceCream) {
        super(newIceCream);

        System.out.println("Fruit pieces added");
    }

    public String getDescription(){
        return tempIceCream.getDescription() + ", Fruit pieces";
    }

    public double getPrice(){
        return tempIceCream.getPrice() + 2;
    }


}