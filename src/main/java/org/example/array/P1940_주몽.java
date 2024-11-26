package org.example.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * packageName    : org.example.array
 * fileName       : P1940_주몽
 * author         : mac
 * date           : 10/17/24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 10/17/24        mac       최초 생성
 */
public class P1940_주몽 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);

        int count = 0;
        int i=0;        //A[0]  -> Min value
        int j=N-1;      //A[N-1]  -> Max value

        while(i<j){
            if(A[i]+A[j]<M){
                i++;
            }else if(A[i]+A[j]>M){
                j--;
            }else{
                count++;
                i++;
                j--;
            }
        }


    }
}
