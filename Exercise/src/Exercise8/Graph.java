package Exercise8;



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
            System.out.print(k + " ");
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
        boolean[] visited = new boolean[n];
        int m = 0;
        if(m < n) {
            visited[m] = true;
        }
        for(int i = 0; i < n; i++) {
            if(a[m][i] != 0  && !visited[i])
                return true;
        }
        return false;

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
