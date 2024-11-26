package org.example.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * packageName    : org.example.graph
 * fileName       : DaikStra
 * author         : mac
 * date           : 10/14/24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 10/14/24        mac       최초 생성
 */
public class DaikStra {

    private static class Node{
        int dest, cost;

        public Node(int dest, int cost) {
            this.dest = dest;
            this.cost = cost;
        }
    }

    public static void main(String[] args) {
        int n = 3;
        int start =0;
        int[][] graph = {{0,1,9},{0,2,3},{1,0,5},{2,1,1}};
        ArrayList<Node>[] adjList = new ArrayList[n];



        for(int i=0;i<n;i++){
            adjList[i] = new ArrayList<>();
        }

        for(int[] edge : graph){
            adjList[edge[0]].add(new Node(edge[1],edge[2]));
        }

        int[] dist = new int[n];

        Arrays.fill(dist,Integer.MAX_VALUE);

        dist[start] = 0;


    }
}
