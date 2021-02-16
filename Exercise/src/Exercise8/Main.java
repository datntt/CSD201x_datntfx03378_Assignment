package Exercise8;

import java.util.Scanner;

public class Main {
    static Scanner sc;
    public static void main(String[] args) {
        Graph g = new Graph();
        /*sc = new Scanner(System.in);
        System.out.print("n = ");
        int n = sc.nextInt();
        int[] [] b = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                b[i][j] = sc.nextInt();
            }
        }*/
        int[][] b = {
                {0,1,1,0,1},
                {1,0,1,0,0},
                {1,1,0,1,0},
                {0,0,1,0,0},
                {1,0,0,0,0}
        };
        g.setData(b);
        g.displayAdj();
        System.out.println();
        g.breadth(1);
        System.out.println();
        System.out.println("Is G is connected? " + g.isConnected());
        System.out.println();
        System.out.println("Degree of the vertex A in G is " + g.degree(0));
    }
}
