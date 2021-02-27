package Exercise8;


import java.util.Stack;

public class Graph {
    int[] [] a;
    int n;
    Graph() {
        a = null;
        n = 0;
    }
    void setData(int [][] b) {
        n = b.length;
        a = new int[n][n];
        int i, j;
        for(i = 0; i < n; i++) {
            for(j = 0; j < n; j++) {
                a[i][j] = b[i][j];
            }
        }
    }
    void visit(int i) {
        //System.out.print(i+" ");
        switch (i) {
            case 0 -> System.out.print("A");
            case 1 -> System.out.print("B");
            case 2 -> System.out.print("C");
            case 3 -> System.out.print("D");
            case 4 -> System.out.print("E");
        }
    }
    void displayAdj() {
        int i, j;
        System.out.println("The adjacency matrix: ");
        for(i = 0; i < n; i++) {
            System.out.println();
            for(j = 0; j < n; j++) {
                System.out.printf("%5d", a[i][j]);
            }
        }
    }

    // Hàm duyệt theo BFS bắt đầu tại đỉnh k bằng cách sử dụng MyQueue.
    // Mỗi khi lấy đỉnh ra khỏi queue thì hiển thị đỉnh đó ra hình.
    void breadth(int k) {
        MyQueue q = new MyQueue();
        boolean[] visited = new boolean[n];
        visited[k] = true;
        q.enqueue(k);
        while (!q.isEmpty()) {
            k = q.dequeue();
            visit(k);
            //System.out.print(k+" ");
            for (int i = 0; i < n; i++) {
                if(a[i][k] == 1 && !visited[i]) {
                    visited[i] = true;
                    q.enqueue(i);
                }
            }
        }
    }

    // Hàm kiểm tra tính liên thông của đồ thị.
    boolean isConnected() {
        int k = 0;
        int[] visit = new int[n];
        MyQueue q = new MyQueue();
        visit[k] = 1;
        q.enqueue(k);
        while (!q.isEmpty()) {
            k = q.dequeue();
            for (int j = 0; j < n; j++) {
                if ((a[k][j] > 0) && visit[j] != 1) {
                    visit[j] = 1;
                    q.enqueue(j);
                }
            }
        }
        //
        for (int i : visit)
            if (i != 1)
                return false;
        return true;
    }

    // hàm duyệt theo dfs.
    void depth(int k) {
        Stack<Integer> stack = new Stack<Integer>();
        boolean[] visited = new boolean[n];
        visited[k] = true;
        stack.push(k);
        while (!stack.isEmpty()) {
            k = stack.pop();
            //visit(k);
            System.out.print(k+" ");
            for(int i = 0; i < n; i++) {
                if(a[k][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    stack.push(i);
                }
            }
        }
    }

    // Hàm tính bậc của đỉnh k
    int degree(int k) {
        int sum = 0;
        if(k > - 1 && k < n) {
            for(int i = 0; i < n; i++) {
                sum += a[k][i];
            }
            return sum;
        } else {
            return -1;
        }
    }
}
