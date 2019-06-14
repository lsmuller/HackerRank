package com.leticia;

import java.util.HashSet;
import java.util.Set;

public class DayOfTheProgrammer {
	private static int DAY_OF_PROGRAMMER = 256;
	private static final int JAN = 31;
	private static final int FEB = 28;
	private static final int MAR = 31;
	private static final int APR = 30;
	private static final int MAY = 31;
	private static final int JUN = 30;
	private static final int JUL = 31;
	private static final int AUG = 31;
	private static final int SEP = 30;

	public static String dayOfProgrammer(int year) {
		if  (year == 1918) {
			return "26.09.1918";
		} else {
			int february = isLeapYear(year) ? FEB + 1 : FEB;
			int total = JAN + february + MAR + APR + MAY + JUN + JUL + AUG;
			int day = DAY_OF_PROGRAMMER - total;
			return day + ".09." + year;
		}
	}

	private static boolean isLeapYear(int year) {
		return year % 4 == 0 &&
				((isGregorianCalendar(year) && (year % 100 != 0 || year % 400 == 0)) ||
						isJulianCalendar(year));
	}

	private static boolean isJulianCalendar(int year) {
		return year < 1918;
	}

	private static boolean isGregorianCalendar(int year) {
		return year > 1918;
	}

	public static void main(String[] args) {
		System.out.println(dayOfProgrammer(2017));
		System.out.println(dayOfProgrammer(2016));
		System.out.println(dayOfProgrammer(1918));

		int[] a = {1, 4, 8 ,5 ,8 };


	}
}
