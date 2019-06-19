package com.leticia.old;
import java.util.*;
import java.util.stream.IntStream;

public class JavaLoopsII {

    public static int[] calculate(int a, int b, int n){
        int[] result = new int[n];
        int calc = a;
        for (int i = 0; i < n; i++){
            calc += (int)Math.pow(2, i) * b;
            result[i] = calc;
        }
        return result;
    }

    public static void printResult(int a, int b, int n){
        int[] arr = calculate(a, b, n);
        StringJoiner sj = new StringJoiner(" ");
        IntStream.of(arr).forEach(x -> sj.add(String.valueOf(x)));
        System.out.println(sj.toString());
    }

    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            printResult(a, b, n);
        }
        in.close();
    }
}
