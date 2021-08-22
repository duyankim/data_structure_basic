package baekjoon.algorithmn.bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BF15649 {
    
    static int N, M;
    static boolean[] isVisited;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        
        isVisited = new boolean[N];
        arr = new int[M];
        
        dfs(0);
        System.out.println(sb);
    }
    
    public static void dfs(int depth) {
        //재귀 깊이가 M과 같아지면 탐색과정에서 담았던 배열을 출력
        if (depth == M) {
            for (int val : arr) {
                System.out.println(val + " ");
            }
            System.out.println();
            return;
        }
        
        for (int i = 0; i < N; i++) {
            //만약 해당 노드를 방문하지 않았다면
            if (isVisited[i] == false) {
                //해당 노드를 방문 상태로 변경
                isVisited[i] = true;
                
                //해당 깊이를 index로 하여 i+1값 저장
                arr[depth] = i + 1;
                
                //다음 자식 노드 방문을 위해 depth를 1씩 증가시키면서 재귀 호출
                dfs(depth + 1);
                
                //자식노드 방문이 끝나고 돌아오면 방문노드를 방문하지 않은 상태로 변경
                isVisited[i] = false;
            }
        }
        return;
    }
}
