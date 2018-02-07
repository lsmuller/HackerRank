package com.leticia;

import java.util.*;

public class MakingAnagrams {

    private static Hashtable<String, Integer> hashFirst;
    private static Hashtable<String, Integer> hashSecond;

    private static Hashtable <String, Integer> createHash(String s){
        StringBuilder sb = new StringBuilder(s);
        Hashtable<String, Integer> counter = new Hashtable<>();
        for (int i = 0; i < sb.length(); i++){
            String c = Character.toString(sb.charAt(i));
            String replaced = sb.toString().replaceAll(c, "");
            int count = sb.toString().length() - replaced.length();
            sb = new StringBuilder(replaced);
            counter.put(c, count);
            i--;
        }

        return counter;
    }

    private static int countFirst(){
        int count = 0;
        for(Map.Entry mFirst:hashFirst.entrySet()){
            Integer mValue = hashSecond.get(mFirst.getKey());
            if (mValue == null){
                count += (int) mFirst.getValue();
            } else {
                count += Math.abs((int)mFirst.getValue() - mValue);
                hashSecond.remove(mFirst.getKey());
            }
        }
        return count;
    }

    private static int countSecond(){
        int count = 0;
        for(Map.Entry msSecond:hashSecond.entrySet()){
            count += (int) msSecond.getValue();
        }
        return count;
    }

    public static int numberNeeded(String first, String second) {
        hashFirst = createHash(first);
        hashSecond = createHash(second);
        return countFirst() + countSecond();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
