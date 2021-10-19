package programmers.dynamicProgramming;

public class Tile2xn {
    int[] histories;

    public int Solution(int n) {
        histories = new int[60_000];
        return dp(n);
    }

    private int dp(int width) {
        if (width == 1) return 1;
        if (width == 2) return 2;
        if (histories[width] != 0) return histories[width];
        return histories[width] = (dp(width - 1) + dp(width - 2)) % 1_000_000_007;
    }
}
