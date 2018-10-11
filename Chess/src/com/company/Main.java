package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        System.out.print("Enter any integer number of rows = ");
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();

        System.out.print("Enter any integer number of columns = ");
        int columns = scan.nextInt();

        ChessBoard cb = new ChessBoard (rows,columns);
        cb.printBoard();

    }
}
