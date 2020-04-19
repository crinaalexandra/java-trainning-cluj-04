package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("length=");
        int n = scan.nextInt();
        int x[] = new int[n];
        Write(n, x);
        Sir(n,x);

    }
    public static void Write(int n, int x[]){
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i <n; i++){
            x[i] = scan.nextInt();
        }
    }
    public static void PrintArray(int n, int x[]){
        for (int i = 0; i <n; i++){
            System.out.print(x[i]);
            System.out.print(" ");

        }
    }
    public static void Sir(int n, int x[]){
        int j;
        int c = 0;
        for (int i = 0; i <n; i++){
            for (j = i+1; j <n; j++)
            if (x[i] + x[j] == 0){
                c++;
            }

        }
        System.out.print(c);
    }
}
