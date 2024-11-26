package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        while((line = bf.readLine())!=null){
            String[] k = line.split(" ");
            Integer A = Integer.parseInt(k[0]);
            Integer B = Integer.parseInt(k[1]);
            System.out.println(A+B);
            System.out.println(A+B);
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