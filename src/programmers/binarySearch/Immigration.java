package programmers.binarySearch;

import java.util.Arrays;

public class Immigration {
    public static void main(String[] args) {
        int n = 6;
        int[] times = {7, 10};
        solution(n, times);
    }

    public static long solution(int n, int[] times) {

        // 모든 사람이 심사를 받는데 걸리는 시간의 최댓값
        long answer = Long.MAX_VALUE;
        Arrays.sort(times);
        answer = binarySearch(n, times, answer);
        return answer;
    }

    private static long binarySearch(int n, int[] times, long answer) {
        long start = 0;
        long mid; // 심사를 받는데 주어진 시간
        long end = Long.MAX_VALUE;
        long sum; // 주어진 시간 mid 동안 심사 받을 수 있는 사람 수

        while (start <= end) {
            mid = (start + end) / 2;
            sum = 0;

            // 주어진 시간동안 몇 명 검사 가능한지 누적으로 구함
            for (int time : times) {
                sum += mid / time;
                if (sum >= n) break;
            }

            // 시간이 부족할 때
            if (n > sum) start = mid - 1;

            // 시간이 남을 때
            else {
                end = mid - 1;
                answer = Math.min(answer, mid);
            }
        }
        return answer;
    }
}
