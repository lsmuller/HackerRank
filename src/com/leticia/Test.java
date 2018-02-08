package com.leticia;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.*;


public class Test {

    static int budgetShopping(int n, int[] bundleQuantities, int[] bundleCosts) {
        int val = n;
        int price = bundleCosts[0];
        int notebooks = 0;
        for(int i = 0; i < bundleQuantities.length; i++){
            while(val - price > 0){
                if (bundleQuantities[i] == 0) break;
                if(bundleQuantities[i] > 0){
                    price = bundleCosts[i];
                    notebooks += bundleQuantities[i];
                    bundleQuantities[i] = 0;
                }
            }
        }
        return notebooks;
    }

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = null;
        if (fileName != null) {
            bw = new BufferedWriter(new FileWriter(fileName));
        }
        else {
            bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        int res;
        int n;
        n = Integer.parseInt(in.nextLine().trim());

        int bundleQuantities_size = 0;
        bundleQuantities_size = Integer.parseInt(in.nextLine().trim());

        int[] bundleQuantities = new int[bundleQuantities_size];
        for(int i = 0; i < bundleQuantities_size; i++) {
            int bundleQuantities_item;
            bundleQuantities_item = Integer.parseInt(in.nextLine().trim());
            bundleQuantities[i] = bundleQuantities_item;
        }

        int bundleCosts_size = 0;
        bundleCosts_size = Integer.parseInt(in.nextLine().trim());

        int[] bundleCosts = new int[bundleCosts_size];
        for(int i = 0; i < bundleCosts_size; i++) {
            int bundleCosts_item;
            bundleCosts_item = Integer.parseInt(in.nextLine().trim());
            bundleCosts[i] = bundleCosts_item;
        }

        res = budgetShopping(n, bundleQuantities, bundleCosts);
        bw.write(String.valueOf(res));
        bw.newLine();

        bw.close();
    }
}

