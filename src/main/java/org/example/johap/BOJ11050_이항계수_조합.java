package org.example.johap;

/**
 * packageName    : org.example.johap
 * fileName       : BOJ11050_이항계수_조합
 * author         : mac
 * date           : 10/29/24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 10/29/24        mac       최초 생성
 */
public class BOJ11050_이항계수_조합 {

    static int D[][];
    public static void main(String[] args) {
        int M = 5;
        int N = 2;
        D = new int[11][11];
        //초기화
        for(int i = 0;i<=M;i++){
            D[i][i] = 1;
            D[i][0] = 1;
            D[i][1] = i;
        }

        //점화식으로 배열 완성하기
        for(int i=2;i<=M;i++){
            for(int j=1;j<i;j++){
                D[i][j] = D[i-1][j]+D[i-1][j-1];
            }
        }
        System.out.println(D[M][N]);

    }
}
