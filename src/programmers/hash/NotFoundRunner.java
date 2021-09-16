package programmers.hash;

import java.util.Arrays;
import java.util.HashMap;

public class NotFoundRunner {

    public static void main(String[] args) {
        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"josipa", "filipa", "marina", "nikola"};
        solution2(participant, completion);
    }

    public static String solution1(String[] participant, String[] completion) {
        String answer = "";

        Arrays.sort(participant);
        Arrays.sort(completion);

        for (int i = 0; i < completion.length; i++) {

            if (!participant[i].equals(completion[i])) {
                answer = participant[i];
                break;
            }
        }

        if (answer.equals("")) {
            answer = participant[participant.length-1];
        }

        return answer;
    }

    public static String solution2(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> runners = new HashMap<>();
        for (String p : participant) runners.put(p, runners.getOrDefault(p, 0) + 1);
        for (String c : completion) runners.put(c, runners.get(c) -1);

        for (String key : runners.keySet()) {
            if (runners.get(key) != 0) {
                answer = key;
            }
        }

        return answer;
    }
}
