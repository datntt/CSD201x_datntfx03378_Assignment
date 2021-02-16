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
    void visit(int i) {
        System.out.print(i + " ");
    }

    // Hàm duyệt theo BFS bắt đầu tại đỉnh k bằng cách sử dụng MyQueue.
    // Mỗi khi lấy đỉnh ra khỏi queue thì hiển thị đỉnh đó ra hình.
    void breadth(int k) {
        MyQueue q = new MyQueue();
        for(int i = 0; i < n; i++) {
            if(a[i][k] != 0) {
                q.enqueue(i);
                for(int j = i; j < n; j++) {
                    if(a[i][j] != 0 && j != k) {
                        q.enqueue(j);
                        visit(q.dequeue());
                    }
                }

            }
        }

    }


    // Hàm kiểm tra tính liên thông của đồ thị.
    //boolean isConnected() { }


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
