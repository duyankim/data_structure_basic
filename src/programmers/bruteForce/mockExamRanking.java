package programmers.bruteForce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mockExamRanking {

    public static void main(String[] args) {
        int[] answers = {1,2,3,4,5};
    solution(answers);
}

    public static int[] solution(int[] answers) {
        int[] answer = {};

        int[][] patterns = {
                {1,2,3,4,5},
                {2,1,2,3,2,4,2,5},
                {3,3,1,1,2,2,4,4,5,5}
        };

        int[] correct = new int[3];

        for (int i = 0; i < answers.length; i++) {
            for (int j = 0; j < correct.length; j++) {
                if (patterns[j][i % patterns[j].length] == answers[i]) {
                    correct[j] += 1;
                }
            }
        }

        List<Integer> answerList = new ArrayList<>();

        for (int k = 0; k < correct.length; k++) {
            if (Arrays.stream(correct).max().getAsInt() == correct[k]) {
                answerList.add(k+1);
            }
        }
        answer = answerList.stream().mapToInt(i -> i.intValue()).toArray();
        return answer;
    }
}
