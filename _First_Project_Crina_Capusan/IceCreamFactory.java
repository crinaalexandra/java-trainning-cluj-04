package com.company;

import java.util.Scanner;

public class IceCreamFactory {

    public IceCreamBaseMenu getInstance() {

        System.out.println("What type of icecream base do you want?");
        Scanner scan = new Scanner(System.in);
        String choice = scan.nextLine();

        switch (choice) {
            case "Vanilla":
                return new VanillaBase();
            case "Chocolate":
                return new ChocolateBase();
            case "DairyFree":
                return new DairyFreeBase();
            default:
                throw new IllegalArgumentException("This icecream base is not available!");
        }

    }
}
