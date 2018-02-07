package com.leticia;

import java.util.*;

public class DiagonalDifference {
    static int diagonalDifference(int[][] a) {
        int n = a.length;
        int sumD1 = 0;
        int sumD2 = 0;

        for(int i=0; i<n; i++){
            sumD1 += a[i][i];
        }

        for(int i=0; i<a.length; i++){
            n--;
            sumD2 += a[i][n];
        }
        System.out.println("segunda soma:" + sumD2);

        int soma = sumD1-sumD2;

        System.out.println("soma final(sem abs):"+  soma);

        return Math.abs(soma);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        for(int a_i = 0; a_i < n; a_i++){
            for(int a_j = 0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        int result = diagonalDifference(a);
        System.out.println(result);
        in.close();
    }
}
