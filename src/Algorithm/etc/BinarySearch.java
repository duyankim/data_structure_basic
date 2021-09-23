package Algorithm.etc;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        // 이진탐색 수행
        int result = binarySearch(arr, target, 0, n-1);
        if (result == -1) System.out.println("원소가 존재하지 않습니다");
        else System.out.println(result + 1);
    }

    public static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = (start + end) / 2;

            // 중간점이 찾는 값과 같으면 바로 인덱스 반환
            if (arr[mid] == target) return mid;

            // 중간점의 값보다 타겟 값이 작으면 왼쪽 확인
            else if (arr[mid] > target) end = mid - 1;

            // 중간점의 값보다 타겟 값이 클 경우 오른쪽 확인
            else start = mid - 1;
        }
        return -1;
    }
}
