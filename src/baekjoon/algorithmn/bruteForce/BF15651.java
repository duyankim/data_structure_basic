package baekjoon.algorithmn.bruteForce;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BF15651 {
    
    static StringBuilder sb = new StringBuilder();
    static int N, M;
    static int[] selected;
    
    static void input() {
        FastReader scan = new FastReader();
        N = scan.nextInt();
        M = scan.nextInt();
        selected = new int[M + 1];
    }
    
    static void loop(int k) {
        if (k == M + 1) {
            // M개를 전부 다 골랐을 경우
            for (int i = 1; i <= M; i++) {
                sb.append(selected[i]).append(' ');
            }
            sb.append("\n");
        } else {
            // 아직 M개를 전부 고르지 않아서 
            // k번째부터 M번째 원소를 조건에 맞게 고르는 모든 방법을 시도
            for (int j = 1; j <= N; j++) {
                // k번째에 j가 올 수 있으면
                selected[k] = j;
                
                // k+1번부터 M번까지 채워주는 함수를 호출
                loop(k+1);
                selected[k] = 0;
            }
        }
    }

    public static void main(String[] args) {
        input();
        // 1부터 M번째 원소까지 조건에 맞는 모든 수 찾기
        loop(1);
        System.out.println(sb.toString());
        
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
        
        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        
        public FastReader(String s) throws FileNotFoundException {
            br = new BufferedReader(new FileReader(new File(s)));
        }
        
        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        
        int nextInt() {
            return Integer.parseInt(next());
        }
        
        long nextLong() {
            return Long.parseLong(next());
        }
        
        double nextDouble() {
            return Double.parseDouble(next());
        }
        
        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
