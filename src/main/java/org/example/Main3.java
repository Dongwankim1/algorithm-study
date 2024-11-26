package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main3 {
    static int checkArr[];
    static int myArr[];
    static int checkSecret;
    public static void main(String[] args) throws Exception {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int count = Integer.parseInt(st.nextToken());
        int[][] arr = new int[count][count];
        int[][] visitarr = new int[count][count];
        for(int i=0;i<count;i++){
            String[] item = bf.readLine().split("");
            for(int j=0;j<count;j++){
                arr[i][j] = Integer.parseInt(item[j]);
            }
        }



    }


}


/**
 *  while((line = bf.readLine())!=null){
 *             String[] k = line.split(" ");
 *             Integer A = Integer.parseInt(k);
 *             Integer B = Integer.parseInt(k);
 *             System.out.println(A+B);
 *         }
 *
 */