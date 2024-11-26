package org.example.backtracking;

/**
 * packageName    : org.example.backtracking
 * fileName       : N과M
 * author         : mac
 * date           : 10/29/24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 10/29/24        mac       최초 생성
 */
public class BOJ15649_N과M {
    static int N = 4;
    static int M = 2;
    static int[] arr;
    static boolean[] visited;
    //M은 총 찾아야하는 수
    public static void main(String[] args) {

        arr = new int[10];
        visited = new boolean[10];
        func(0);
    }

    /**
     * 1. k에는 0이 들어감
     * 2. for문이 돌고 i = 1,visit처리후 arr[0] =1;
     * 3. 현재 arr[0]에는 1이 존재
     * 4. 재귀 함수를 탄뒤 k+1를 해줌. 즉, 한번더 함수를 바로 돌도록함.
     * 5. 다시 for문을 돌게됨. 이때 k=1, i부터 돌기시작함. 하지만 i=1일때 이미 방문 중이므로, i=2부터 돌게됨.
     * 6. arr[1] = 2 들어가짐. visited[2]는 방문처리, 다시 func k+1로 재귀함수를 호출
     * 7. k=2이기에 arr[0] , arr[1]이 프린트 되고 리턴됨.
     * 8. k=1로 돌아가고, 다시 visited[2]가 false가 되고 i가 3부터 다시 돌고 visited[3] true및 함수 호출을 하게됨.
     * 9. 마찬가지로 k=2가되고 arr[0],arr[1]을 호출함.
     */

    static void func(int k){
        if(k == M){//0일경우 타지 않는다. ->
            for(int i = 0;i<M;i++){
                System.out.print(arr[i]);
            }
            System.out.println();
            return;
        }

        for(int i=1;i<=N;i++){
            if(!visited[i]){
                System.out.println("k ==  "+k);
                System.out.println("i ==  "+i);
                arr[k] = i; //arr[0]=1
                visited[i] = true;
                func(k+1);
                visited[i] = false;
            }
        }
    }
}
