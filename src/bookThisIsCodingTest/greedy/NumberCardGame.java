package bookThisIsCodingTest.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NumberCardGame {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st1.nextToken());
        int m = Integer.parseInt(st1.nextToken());

        int[] minInEachMArr = new int[n];

        StringTokenizer st2;
        for (int i = 0; i < n; i++) {
            st2 = new StringTokenizer(br.readLine());

            for (int j = 0; j < m; j++) {
                int nextNum = Integer.parseInt(st2.nextToken());

                if (j == 0) {
                    minInEachMArr[i] = nextNum;
                } else if (nextNum < minInEachMArr[i]){
                    minInEachMArr[i] = nextNum;
                }
            }
        }

        int maxInArr = Arrays.stream(minInEachMArr).max().getAsInt();

        System.out.println(maxInArr);
    }
}
