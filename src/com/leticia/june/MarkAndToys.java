package com.leticia.june;

import java.util.Arrays;

public class MarkAndToys {

	public static int maximumToys(int[] prices, int k) {
		Arrays.sort(prices);
		int totalPrice = 0;
		int i;
		for (i = 0; i < prices.length; i++) {
			totalPrice += prices[i];
			if (totalPrice >= k) break;
		}
		return totalPrice > 0 ? i : 0;
	}

	public static void main(String[] args) {
		int[] arr = {1, 12, 5, 111, 200, 1000, 10};
		System.out.println(maximumToys(arr, 50));
	}

}
