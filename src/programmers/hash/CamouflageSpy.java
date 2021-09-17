package programmers.hash;

import java.util.HashMap;

public class CamouflageSpy {
    public static void main(String[] args) {
        String[][] clothes = {{"crowmask", "face"}, {"bluesunglasses", "face"},{"smoky_makeup", "face"}};
        System.out.println(solution(clothes));
    }

    public static int solution(String[][] clothes) {
        int answer = 1;

        HashMap<String, Integer> clothesMap = new HashMap<>();

        for (String[] sort : clothes) {
            clothesMap.put(sort[1], clothesMap.getOrDefault(sort[1],0) + 1);
        }

        for (Integer value : clothesMap.values()) {
            answer *= value + 1;
        }

        return answer - 1;
    }
}
