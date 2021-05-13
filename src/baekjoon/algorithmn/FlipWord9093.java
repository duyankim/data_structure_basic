package baekjoon.algorithmn;

import java.util.Scanner;

public class FlipWord9093 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int lines = sc.nextInt();
		int i = 0;
		String[] words;
		
		for (i = 0; i < lines; ++i) {
			String line = sc.nextLine();
			words = line.split(" ");
			for (String word : words) {
				printReverseWord(word);
				System.out.print(" ");
			}
			System.out.println();
		} 
	}
	
	public static void printReverseWord(String word) {
		int i = word.length()-1;
		while (i > -1) {
			System.out.print(word.charAt(i));
			i--;
		}
	}
}
