package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter any integer n = ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        System.out.print("Enter any integer m = ");
        int m = scan.nextInt();

        Square mn = new Square(n, m);
        mn.nOfSquare();

    }
}
