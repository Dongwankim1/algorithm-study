package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BACKJUN1874 {
    static int checkArr[];
    static int myArr[];
    static int checkSecret;
    public static void main(String[] args) throws Exception {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int Result = 0;
        checkArr = new int[4];
        myArr = new int[4];
        char A[] = new char[S];
        checkSecret = 0;

        A = bf.readLine().toCharArray();
        st = new StringTokenizer(bf.readLine());
        for(int i=0;i<4;i++){
            checkArr[i] = Integer.parseInt(st.nextToken());
            if(checkArr[i] == 0){
                checkSecret++;
            }
        }
        
        for(int i=0;i<P;i++){
            Add(A[i]);
        }

        for(int i=P; i<S;i++){
            int j= i-P;

        }

    }

    private static void Add(char c) {
        switch (c){
            case 'A':
                myArr[0]++;
                if(myArr[0]==checkArr[0]) checkSecret++;
            case 'C':
                myArr[1]++;
                if(myArr[1]==checkArr[1]) checkSecret++;
            case 'G':
                myArr[2]++;
                if(myArr[2]==checkArr[2]) checkSecret++;
            case 'T':
                myArr[3]++;
                if(myArr[3]==checkArr[3]) checkSecret++;
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