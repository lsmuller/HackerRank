package com.leticia;
import java.util.*;

public class JavaEOF {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();
        String s = "";
        while (in.hasNextLine() && !(s = in.nextLine()).equals("")) {
            words.add(s);
        }
        in.close();
        for (int i = 0; i < words.size(); i++)
            System.out.println(i+1 + " " + words.get(i));
    }

}
