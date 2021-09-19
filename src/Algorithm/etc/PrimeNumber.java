package Algorithm.etc;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeNumber {

    // 소수를 체크할 배열
    public static boolean[] prime;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        make_prime(N);
    }

    public static void make_prime(int N) {

        // 0 ~ N
        prime = new boolean[N + 1];

        // 처음엔 모든 수가 소수 (true)인 것으로 초기화 (0, 1제외)
        Arrays.fill(prime, true);

        // 에라토스테네스의 체 알고리즘 수행
        // 2부터 n의 제곱근까지 모든 수 확인하기
        for (int i = 2; i <= Math.sqrt(N); i++) {
            // i가 소수인 경우 (남은 수인 경우)
            if (prime[i] == true) {
                // i를 제외한 i의 모든 배수 지우기
                int j = 2;
                while (i * j <= N) {
                    prime[i * j] = false;
                    j += 1;
                }
            }
        }

        // 모든 소수 출력하기
        for (int i = 2; i <= N; i++) {
            if (prime[i]) System.out.print(i + " ");
        }
    }
}
