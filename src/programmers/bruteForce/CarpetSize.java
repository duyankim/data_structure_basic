package programmers.bruteForce;

import java.util.*;

public class CarpetSize {
    public static void main(String[] args) {
        solution(10, 2);
    }

    public static int[] solution(int brown, int yellow) {
        int width = 0;
        int height = 0;

        for (int i = 1; i <= yellow / 2 + 1; i++) {
            width = i;
            height = yellow % i == 0 ? yellow / i : yellow / i + 1;

            if (width * 2 + height * 2 + 4 == brown) break;
        }
        width += 2;
        height += 2;

        int[] answer = {Math.max(width, height), Math.min(width, height)};

        return answer;
    }
}
