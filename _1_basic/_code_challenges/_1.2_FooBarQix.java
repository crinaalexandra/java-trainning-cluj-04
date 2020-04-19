package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String s;
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        s = compute (x);
        System.out.println(s);


    }
    private static String compute (int x){
        String s;
        s = "1";
        if (x % 3 == 0)
            s = "Foo";
        if (x % 5 == 0)
            s = "Bar";
        if (x % 7 ==0)
            s = "Qix";
        return s;


          }

    }

