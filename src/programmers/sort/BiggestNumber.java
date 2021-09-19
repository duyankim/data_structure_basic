package programmers.sort;

import java.util.Arrays;

public class BiggestNumber {
    public static void main(String[] args) {
        int[] numbers = {3, 30, 34, 5, 9};
        solution(numbers);
    }

    public static String solution(int[] numbers) {
        String answer = "";

        // 정수 배열 -> 문자 배열
        String[] result = Arrays.stream(numbers).mapToObj(String::valueOf).toArray(String[]::new);

        // 정렬
        Arrays.sort(result, ((o1, o2) -> (o2 + o1).compareTo(o1 + o2)));

        // 0만 여러 개 있는 배열의 경우 0만 리턴
        if (result[0].equals("0")) return "0";

        // 정렬된 문자 하나로 합치기
        for (String r: result) answer += r;

        return answer;
    }
}
