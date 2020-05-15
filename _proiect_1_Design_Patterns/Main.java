package com.company;
import com.company.MyRecipes;
import com.company.VeganRecepies;
import com.company.DessertRecepies;
import com.company.DinnerRecepies;
import com.company.OperatingFactory;

class Main {
    public static void main(String[] args) {

        OperatingFactory op = new OperatingFactory();
        MyRecipes MR = op.getInstance("Sweet");
        MR.steps();

        // program that shows you sweet/healthy/easy recepies based on what key word is used

    }
}
