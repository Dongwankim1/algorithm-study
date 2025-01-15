package org.example.search;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * packageName    : org.example.search
 * fileName       : P11724_dfs
 * author         : mac
 * date           : 10/23/24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 10/23/24        mac       최초 생성
 *
 *
 첫째 줄에 연결 요소의 개수를 출력한다.
6 8
1 2
2 5
5 1
3 4
4 6
5 4
2 4
2 3
 *
 */
public class P11724_연결요소의개수_dfs {
    static boolean visited[];
    static ArrayList<Integer>[] dfsList;
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bufferedReader.readLine());
        //노드 개수
        int nodeCnt = Integer.parseInt(st.nextToken());
        //엣지 개수
        int edgeCnt = Integer.parseInt(st.nextToken());
        //방문 배열
        visited = new boolean [nodeCnt+1];
        //dfs 리스트
        dfsList = new ArrayList[nodeCnt+1];
        for(int i=1;i<nodeCnt+1;i++){
            //dfs 리스트에 노드를 초기화시켜준다.
            dfsList[i] = new ArrayList<Integer>();
        }

        //엣지 갯수만큼 for문을 돌려준다.
        for(int i=0;i<edgeCnt;i++){
            //연결요소를 readline으로 불러와 넣어준다
            StringTokenizer st2 = new StringTokenizer(bufferedReader.readLine());
            //1번 노드와
            int s = Integer.valueOf(st2.nextToken());
            //2번 노드가 연결되어있음.
            int e = Integer.valueOf(st2.nextToken());
            //양방향 그래프일수도있으니 양족방향으로 넣어주자
            dfsList[s].add(e); //
            dfsList[e].add(s);
        }
        int count = 0 ;
        //전체 노드를 실행한다 그러면서 DFS를 실행
        for(int i=1;i<nodeCnt+1;i++){
            if(!visited[i]){
                count++;
                dfs(i);

            }
        }

        System.out.println(count);

    }

    private static void dfs(int v) {
        if(visited[v]){
            return;
        }
        visited[v] = true;
        for(int i : dfsList[v]){
            if(!visited[i]){
                dfs(i);
            }
        }


    }
}
