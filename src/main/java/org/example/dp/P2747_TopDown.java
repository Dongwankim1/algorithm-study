package org.example.dp;

import java.util.Scanner;

/**
 * packageName    : org.example.dp
 * fileName       : P2747_TopDown
 * author         : mac
 * date           : 11/3/24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 11/3/24        mac       최초 생성
 */
public class P2747_TopDown {
    static int[] D;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        D = new int[n+1];
        for(int i=0;i<=n;i++){
            D[i] = -1;
        }

        D[0] = 0;
        D[1] = 1;
        fibo(n);

    }

    private static int fibo(int n) {
        if(D[n]!= -1) return D[n];

        return D[n] = fibo(n-2)+fibo(n-1);
    }


}
