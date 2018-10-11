package com.company;

public class Main {

    public static void main(String[] args) {
        int M = 1000; //Левый предел позже переделать в сканер
        int K = 3000; // Правый предел позже переделать в сканер
        int N = 92;
	    long F;
        int n = N/2;
        F = (long) ((Math.pow((1 + Math.sqrt(5))/2,n)-Math.pow((1 - Math.sqrt(5))/2,n))/Math.sqrt(5));
        for (int i =0; i < 5; i++){
            if (M > F){
                n = (int)(n + (N/2)/(Math.pow(2, i+1)));
                F = (long) ((Math.pow((1 + Math.sqrt(5))/2,n)-Math.pow((1 - Math.sqrt(5))/2,n))/Math.sqrt(5));
            } else {
                n = (int)(n - (N/2)/(Math.pow(2, i+1)));
                F = (long) ((Math.pow((1 + Math.sqrt(5))/2,n)-Math.pow((1 - Math.sqrt(5))/2,n))/Math.sqrt(5));
            }

        //F = (long) ((long)(Math.pow((1 + Math.sqrt(5))/2,n)-(long)Math.pow((1 - Math.sqrt(5))/2,n))/Math.sqrt(5));
            //System.out.println(n);
            //System.out.print(n + "n: " + F + ", ");
    }
        //System.out.println(n);

        for (int i = n+2; i < N; i++){
            F = (long) ((Math.pow((1 + Math.sqrt(5))/2,i)-Math.pow((1 - Math.sqrt(5))/2,i))/Math.sqrt(5));
            System.out.print(F + ", ");
            if(F > K) break;
        }

    }
}
