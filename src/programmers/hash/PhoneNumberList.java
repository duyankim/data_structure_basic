package programmers.hash;

import java.util.HashMap;

public class PhoneNumberList {
    public static void main(String[] args) {
        String[] phone_book = {"119", "97674223", "1195524421"};
        solution(phone_book);
    }

    public static boolean solution(String[] phone_book) {
        boolean answer = true;

        HashMap<String, Integer> phoneMap = new HashMap<>();
        int i = 0;
        for (String p : phone_book) phoneMap.put(p, i++);

        for (int j = 0; j < phone_book.length; j++) {
            for (int k = 1; k < phone_book[j].length(); k++) {
                if (phoneMap.containsKey(phone_book[j].substring(0,k))) {
                    answer = false;
                    return answer;
                }
            }
        }
        return answer;
    }
}
