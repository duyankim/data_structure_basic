package Algorithm.recurison.backTracking;

import java.util.*;

public class Permutation {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
        arr.add("a");
        arr.add("b");
        arr.add("c");

        int r = 2; // 뽑을 개수
        String[] result = new String[r];
        permutation(arr, result, 0, arr.size(), r);
    }

    /**
     * 순열 구하기
     * @param arr : 입력 리스트
     * @param result : 결과 리스트
     * @param depth : 배열을 채워 넣을 순서 (ex. result[depth])
     * @param n : 전체 개수
     * @param r : 뽑을 개수
     */
    private static void permutation(List<String> arr, String[] result, int depth, int n, int r) {

        if (depth == r) {
            System.out.println(Arrays.toString(result));
            return;
        }

        for (int i = 0; i < n - depth; i++) {

            // arr.remove(i)는 삭제되는 arr의 인덱스 i번째 값을 반환한다.
            result[depth] = arr.remove(i);

            // 재귀호출 depth를 1 늘려 result의 다음 인덱스 값을 구한다.
            permutation(arr, result, depth + 1, n, r);

            // 다시 원본 배열에 지웠던 값을 넣는다.
            arr.add(i, result[depth]);
        }
    }
}
