package org.example.search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * packageName    : org.example.search
 * fileName       : P1278_미로탐색
 * author         : mac
 * date           : 10/23/24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 10/23/24        mac       최초 생성
 */
public class P1278_미로탐색 {
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    static boolean[][] visited;
    static int[][] A;
    static int N,M;

    static int result = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        A = new int[N][M];
        visited = new boolean[N][M];
        Arrays.fill(visited,0);

        for(int i=0;i<N;i++){
            char[] line = br.readLine().toCharArray();
            for(int j=0;j<M;j++){
                A[i][j] = Integer.parseInt(String.valueOf(line[j]));
            }
        }
        bfs(0,0);
        /**
         * awerawer
         */

    }

    private static void bfs(int i, int j) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {i,j});
        while(!queue.isEmpty()){
            int[] poll = queue.poll();
            visited[i][j] = true;
            for(int k=0;k<4;k++){ //상하좌우로 탐색
                int x = poll[0] + dx[k];
                int y = poll[1] + dy[k];
                if(x >= 0 && y >=0 && x<N && y<M){ //배열을 넘어가면 안됨
                    if(A[x][y]!=0&&!visited[x][y]){ //0이여서 갈수없거나 기방문한 곳이면 안됨
                        visited[x][y]=true;
                        A[x][y] = A[poll[0]][poll[1]]+1;
                        queue.add(new int[] {x,y});
                    }
                }
            }
            result++;
        }
    }
}
