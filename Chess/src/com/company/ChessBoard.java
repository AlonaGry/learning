package com.company;

public class ChessBoard {
    private int rows;
    private int columns;

    public ChessBoard (int rows, int columns){
        this.rows = rows;
        this.columns = columns;
    }
    public void printBoard(){
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++){
                if ((i%2==0)^(j%2==0)){
                    System.out.print((" "));
                } else {
                    System.out.print(("*"));
                }
            }
            System.out.println(" ");
        }
    }
}
