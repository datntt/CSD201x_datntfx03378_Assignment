import java.io.*;
import java.util.*;

public class Graph {
    int[][] a;
    int n;
    static File urlData = new File("src\\Matran.txt");


    Graph () {
        n = 7;
        a = new int[n][n];
    }
    public void readFile() throws IOException {
        FileInputStream fileInputStream = new FileInputStream(urlData);
        Scanner scanner = new Scanner(fileInputStream);
        try {
            int k = 0;
            while (scanner.hasNextLine()) {
                String str = scanner.nextLine();
                String[] subStr = str.split(";");
                if(subStr.length == n) {
                    for(int i = 0; i < n; i++) {
                        a[k][i] = Integer.parseInt(subStr[i]);
                    }
                }
                k++;
            }
        } finally {
            try {
                scanner.close();
                fileInputStream.close();
            } catch (IOException e) {
                System.out.println("Exception");
            }
        }

    }
    public void printMatrix() throws IOException {
        readFile();
        System.out.println("Weight matrix: ");
        for(int i = 0; i < 7; i++) {
            for(int j = 0; j < 7; j++) {
                System.out.printf("%10d", a[i][j]);
            }
            System.out.println();
        }
    }
    // visit
    public void visit(int i) {
        switch (i) {
            case 0 -> System.out.print("A");
            case 1 -> System.out.print("B");
            case 2 -> System.out.print("C");
            case 3 -> System.out.print("D");
            case 4 -> System.out.print("E");
            case 5 -> System.out.print("F");
            case 6 -> System.out.print("G");
        }
    }

    // depth graph from vertices k
    public void depth(int k) {
        System.out.print("DFS_Graph: ");
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[n];
        visited[k] = true;
        stack.push(k);
        while (!stack.isEmpty()) {
            k = stack.pop();
            visit(k);
            //System.out.print(k + " ");
            for(int i = 0; i < n; i++) {
                if(a[k][i] != 9999 && !visited[i]) {
                    visited[i] = true;
                    stack.push(i);
                }
            }
        }
    }

    // breadth graph from vertices k
    public void breath(int k) {
        System.out.print("BFS_Graph: ");
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n];
        visited[k] = true;
        queue.add(k);
        while (!queue.isEmpty()) {
            k = queue.poll();
            visit(k);
            for (int i = 0; i < n; i++) {
                if(a[k][i] != 9999 && !visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }
}
