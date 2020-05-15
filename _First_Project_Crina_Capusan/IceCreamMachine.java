package com.company;

public class IceCreamMachine {

    public static void main(String[] args) {

        IceCreamFactory icf = new IceCreamFactory();
        IceCreamBaseMenu icbm = icf.getInstance();
        icbm.chooseBase();

        IceCream basicIceCream = new Strawberry(new Chocolate(new PlainIceCream()));

        System.out.println("Ingrediants:" + basicIceCream.getDescription());

        System.out.println("Price:" + basicIceCream.getPrice());

    }

}

