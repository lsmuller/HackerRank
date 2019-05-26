package com.leticia;

public class GradingStudents {

	public static int[] gradingStudents(int[] grades) {
		for (int i = 0; i < grades.length; i++) {
			if (grades[i] < 38) continue;
			int nextMultipleOfFive = getNextMultipleOfFive(grades[i]);
			grades[i] = nextMultipleOfFive - grades[i] < 3 ? nextMultipleOfFive : grades[i];
		}
		return grades;
	}

	public static void main(String[] args) {
		int[] test1 = {73, 67, 38, 33};
		int[] output = gradingStudents(test1);
		for (int value : output)
			System.out.println(value);
	}

	private static int getNextMultipleOfFive(int val) {
		for (int i = 0; i < 5; i++) {
			if (val % 5 == 0) {
				break;
			}
			++val;
		}
		return val;
	}
}
