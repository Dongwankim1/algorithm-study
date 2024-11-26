package org.example.array;

/**
 * packageName    : org.example.array
 * fileName       : TwPointer
 * author         : mac
 * date           : 10/16/24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 10/16/24        mac       최초 생성
 */

import java.util.Scanner;

/**
 * N>100000000일경우
 *   NlogN 을 써도 위험하므로 투포인터를 사용해야한다
    시작인덱스 , 종료인덱스를 사용하여 연속된수를 표현한다.
 */
public class P2018_연속된자연수의합_TwoPointer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 1;
        int start_index = 1;
        int end_index = 1;
        int sum = 1;


        while(end_index!=N){
            if(sum==N){
                count++; end_index++; sum = sum+end_index;
            }else if(sum>N){
                sum = sum- start_index; start_index++;
            }else{
                end_index++; sum = sum+end_index;
            }
        }

        System.out.println(count);



    }



}
