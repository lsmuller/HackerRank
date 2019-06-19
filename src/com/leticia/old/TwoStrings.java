package com.leticia.old;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TwoStrings {
	static String twoStrings(String s1, String s2) {
		ArrayList<String> s1List = new ArrayList<>(Arrays.asList(s1.split("")));
		ArrayList<String> s2List = new ArrayList<>(Arrays.asList(s2.split("")));

		List<String> substring = s1List
				.parallelStream()
				.filter(s1Entry -> s2List.parallelStream().anyMatch(s2Entry ->s1Entry.equals(s2Entry)))
				.collect(Collectors.toList());

		return substring.size() > 0 ? "YES" : "NO";
	}

	public static void main(String[] args) {
		System.out.println(twoStrings("world", "hello"));
	}
}
