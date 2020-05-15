package com.company;

public class OperatingFactory {

    public MyRecipes getInstance(String type) {

        if (type.equals("Healty"))
        return new VeganRecepies();

        else if(type.equals("Sweet"))
            return new DessertRecepies();

        else if(type.equals("Easy"))
            return new DinnerRecepies();
        return null;
    }

}
