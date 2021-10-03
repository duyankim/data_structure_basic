package programmers.bruteForce;

public class HarshadNumber {

    public boolean solution(int x) {
        int sum = 0;
        int copyX = x;

        for (int i = 0; i < String.valueOf(copyX).length(); i++) {
            sum += x % 10;
            x = x / 10;
        }

        return copyX % sum == 0;
    }
}
