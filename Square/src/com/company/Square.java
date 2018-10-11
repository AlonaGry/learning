package com.company;

public class Square {
    int n;
    int m;
    public Square (int n, int m) {
        this.n = n;
        this.m = m;
    }
    public void nOfSquare() {
        double a = Math.sqrt(m);
        if (a == (int) a) {
            for (int i = (int)a; i <= (int) a + n - 1; i++) {
                System.out.print(i * i + ", ");
            }
        } else {
            for (int i = (int) a + 1; i <= (int) a + n; i++) {
                System.out.print(i * i + ", ");
            }

        }
    }
}
