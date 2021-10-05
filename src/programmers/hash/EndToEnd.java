package programmers.hash;

import java.util.*;

public class EndToEnd {

    class Solution {
        public int[] solution(int n, String[] words) {
            int[] answer = {0,0};
            String lastWord = "";
            String firstWord = "";

            for (int i = 0; i < words.length; i++) {
                if (i != 0 ) {
                    lastWord = words[i-1].substring(words[i-1].length()-1);
                    firstWord = words[i].substring(0,1);
                }

                if (!lastWord.equals(firstWord)) {
                    answer[0] = i % n + 1;
                    answer[1] = Math.round(i / n) + 1;
                    return answer;
                } else if (Arrays.stream(words,0,i).anyMatch(words[i]::equals)) {
                    answer[0] = i % n + 1;
                    answer[1] = Math.round(i / n) + 1;
                    return answer;
                }
            }
            return answer;
        }
    }
}
