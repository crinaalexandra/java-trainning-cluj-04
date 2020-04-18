package com.company;


class Main {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 100) {
            if (i % 3 == 0)
                System.out.println("Buzz");
            if (i % 5 == 0)
                System.out.println("Fizz");
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println("FizzBuzz");
            else
                System.out.println(i);
            if (i % 7 == 0)
                System.out.println("Rizz");
            if (i % 11 == 0)
                System.out.println("Jazz");
            i++;
        }
    }
}