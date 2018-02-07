package com.leticia;
import java.util.*;

public class RansomNote {

    private static Hashtable<String, Integer> getHashFromArray(String[] arr){
        Hashtable<String, Integer> hash = new Hashtable<>();
        for (int i = 0; i < arr.length; i++){
            Integer v = hash.get(arr[i]);
            if (v == null){
                hash.put(arr[i], 1);
            } else hash.put(arr[i], v + 1);
        }
        return hash;
    }

    public static boolean replicate(String[] magazine, String[] ramson){
        if (ramson.length > magazine.length) return false;

        Hashtable<String, Integer> hashMagazine = getHashFromArray(magazine);
        for (int i = 0; i < ramson.length; i++){
            Integer v = hashMagazine.get(ramson[i]);
            if (v == null){
                return false;
            } else {
                hashMagazine.put(ramson[i], --v);
                if (v == 0) hashMagazine.remove(ramson[i]);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        String magazine[] = new String[m];
        for(int magazine_i=0; magazine_i < m; magazine_i++){
            magazine[magazine_i] = in.next();
        }
        String ransom[] = new String[n];
        for(int ransom_i=0; ransom_i < n; ransom_i++){
            ransom[ransom_i] = in.next();
        }
        System.out.println((replicate(magazine, ransom)) ? "Yes" : "No" );
    }
}
