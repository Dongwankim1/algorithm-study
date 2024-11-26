package org.example.greedy;

import java.util.Scanner;

/**
 * packageName    : org.example.greedy
 * fileName       : 동전개수의최솟값_그리디
 * author         : mac
 * date           : 10/24/24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 10/24/24        mac       최초 생성
 */
public class 동전개수의최솟값_그리디 {

    public static void main(String[] args) {
        int coinCnt = 10;
        int targetValue = 4200;
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int A[] = new int[N];

        for(int i=0;i<N;i++){
            A[i] = sc.nextInt();
        }
        //그리디 알고리즘 -> 최대한 큰 동전 먼저 사용하기
        int count = 0;
        for(int i = N-1; i>=0;i--){
            if(A[i] <= K){
                count += (K/A[i]);
                K = K % A[i];
            }
        }


    }
}
