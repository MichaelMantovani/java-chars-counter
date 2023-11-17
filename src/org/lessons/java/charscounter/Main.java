package org.lessons.java.charscounter;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Scrivi una parola");
		String word = in.nextLine();
		in.close();
		Map<Character, Integer> charFrequency = new HashMap<>();

		for (Character c : word.toCharArray()) {
			if (charFrequency.containsKey(c))
				charFrequency.put(c, charFrequency.get(c) + 1);
			else
				charFrequency.put(c, 1);
		}
		
		System.out.println(charFrequency);
	}
}
