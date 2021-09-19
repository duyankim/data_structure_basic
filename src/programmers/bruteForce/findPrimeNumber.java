package programmers.bruteForce;

import java.util.*;

public class findPrimeNumber {

    private static TreeSet<String> set = new TreeSet<>();
    private static int answer = 0;

    public static void main(String[] args) {
        String numbers = "17";
        solution(numbers);
    }

    public static int solution(String numbers) {

        int size = numbers.length();

        // char 리스트에 담아준다
        List<Character> arr = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arr.add(numbers.charAt(i));
        }

        // 결과를 저장할 리스트를 만든다
        List<Character> result = new ArrayList<>();

        // nPr에서 r을 반복해서 늘리면서 순열 알고리즘 수행
        for (int j = 0; j < size; j++) {
            permutation(arr, result, size, j + 1);
        }
        System.out.println(answer);
        return answer;
    }

    private static void permutation(List<Character> arr, List<Character> result, int n, int r) {
        StringBuilder sb = new StringBuilder();

        // 숫자를 다 골랐는데, 앞 자리가 0이 아니라면 결과에 포함시킨다.
        if (r == 0 && result.get(0) != '0') {
            sb.replace(0, sb.length(), "");
            for (Character c : result) sb.append(String.valueOf(c));
        }

        // 기존 조합과 중복 발생 여부 확인 후, 소수 갯수 카운트를 한다.
        countPrimeNumbers(String.valueOf(sb));

        for (int i = 0; i < n; i++) {
            result.add(arr.remove(i));
            permutation(arr, result, n-1, r-1);
            arr.add(i, result.remove(result.size() - 1));
        }
    }

    private static void countPrimeNumbers(String num) {
        // 이미 나온 숫자 조합이 아니라면
        if (!set.contains(num) && !num.equals("")) {
            set.add(num);

            // 소수 판별
            if (isPrime(Integer.parseInt(num))) answer++;
        }
    }

    private static boolean isPrime(int n) {

        // 2는 유일하게 짝수이면서 소수인 수
        if (n == 2) return true;

        // 짝수와 1은 소수에서 제외
        if (n % 2 == 0 || n == 1) return false;

        // 제곱근까지의 수를 홀수로 나누어본다.
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
