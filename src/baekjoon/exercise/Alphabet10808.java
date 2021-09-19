package baekjoon.exercise;

import java.util.Scanner;

public class Alphabet10808 {

	public static void main(String[] args) {
		int[] alphabet = new int[26];	
		Scanner sc = new Scanner(System.in);
		String input = sc.next();

		for (int i = 0; i < input.length(); i++) {
			alphabet[(int)(input.charAt(i))-97] += 1;
		}
		for (int n : alphabet) {
			System.out.print(n + " ");
		}
	}
}
