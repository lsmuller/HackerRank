package com.leticia.old;
import java.util.*;

public class StaticInitializerBlock {
    static boolean flag = false;
    static int B = 0;
    static int H = 0;

    static {
        Scanner in = new Scanner(System.in);
        B = in.nextInt();
        H = in.nextInt();
        in.close();
        if (B < 0 || H < 0)
            System.out.print("java.lang.Exception: Breadth and height must be positive");
        else flag = true;
    }

    public static void main(String[] args){

        if(flag){
            int area=B*H;
            System.out.print(area);
        }
    }//end of main
}
