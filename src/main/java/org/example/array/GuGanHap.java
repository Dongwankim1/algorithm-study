package org.example.array;

/**
 * packageName    : org.example.array
 * fileName       : GuGanHap
 * author         : mac
 * date           : 10/16/24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 10/16/24        mac       최초 생성
 */

import java.util.Arrays;
import java.util.Scanner;

/**
 * 합 배열을이용하여 시간 복잡도를 줄여야한다.
 * S[i] = A[0] + A[1] + A[2] +... A[i-1] + A[i]
 */
public class GuGanHap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] k = scanner.nextLine().split(" ");
        String dataCount = k[0];
        String qnaCount = k[1];

        String[] g = scanner.nextLine().split(" ");
        int[] arr = new int[Integer.parseInt(dataCount)+1];
        Arrays.fill(arr,0);
        for(int i=1;i<g.length+1;i++){
            arr[i] += arr[i-1] + Integer.parseInt(g[i-1]);
        }

        for(int i=0;i<Integer.parseInt(qnaCount);i++){
            String[] h = scanner.nextLine().split(" ");
            int range_one = Integer.parseInt(h[0]);
            int range_two = Integer.parseInt(h[1]);

            System.out.println(arr[range_two] - arr[range_one-1]);

        }

    }
}
