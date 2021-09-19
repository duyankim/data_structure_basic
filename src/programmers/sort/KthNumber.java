package programmers.sort;

import java.util.Arrays;

public class KthNumber {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3},{4, 4, 1},{1, 7, 3}};
        solution(array, commands);
    }

    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int[] part;

        for (int i = 0; i < commands.length; i++) {
            part = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            Arrays.sort(part);
            answer[i] = part[commands[i][2] - 1];
        }

        return answer;
    }
}
