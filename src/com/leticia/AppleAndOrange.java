package com.leticia;

//https://www.hackerrank.com/challenges/apple-and-orange/
public class AppleAndOrange {
	static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
		System.out.println(countFruitsInHouse(s, t, a, apples));
		System.out.println(countFruitsInHouse(s, t, b, oranges));
	}

	private static int countFruitsInHouse(int houseStart, int houseEnd, int treePos, int[] fruit) {
		int fruitsInTheHouse = 0;
		for (int applePos : fruit) {
			fruitsInTheHouse = isHouseRange(houseStart, houseEnd, treePos + applePos) ? ++fruitsInTheHouse : fruitsInTheHouse;
		}
		return fruitsInTheHouse;
	}

	private static boolean isHouseRange(int s, int t, int pos) {
		return pos >= s && pos <= t;
	}
	public static void main(String[] args) {
		AppleAndOrange.countApplesAndOranges(7, 11, 5, 15, new int[]{-2, 2, 1}, new int[]{5, -6});
	}

}
