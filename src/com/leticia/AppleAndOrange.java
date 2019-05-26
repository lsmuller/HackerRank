package com.leticia;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

//https://www.hackerrank.com/challenges/apple-and-orange/
public class AppleAndOrange {
	static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
		int applesInTheHouse = 0;
		for (int applePos : apples) {
			applesInTheHouse = isHouseRange(s, t, a + applePos) ? ++applesInTheHouse : applesInTheHouse;
		}
		int orangesInTheHouse = 0;
		for (int orangesPos : oranges) {
			orangesInTheHouse = isHouseRange(s, t, b + orangesPos) ? ++orangesInTheHouse : orangesInTheHouse;
		}
		System.out.println(applesInTheHouse);
		System.out.println(orangesInTheHouse);
	}

	/*
7 11
5 15
-2 2 1
5 -6
	 */
	public static void main(String[] args) {
		AppleAndOrange.countApplesAndOranges(7, 11, 5, 15, new int[]{-2, 2, 1}, new int[]{5, -6});
	}

	private static boolean isHouseRange(int s, int t, int pos) {
		return pos >= s && pos <= t;
	}
}
