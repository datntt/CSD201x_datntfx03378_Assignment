package Exercise1;

public class SimpleSort_ex1 {
    int [] a;
    int n;
    SimpleSort_ex1(int [] b) {
        int i;
        n = b.length;
        a = new int[n];
        for(i=0;i<n;i++) a[i]= b[i];
    }

    void display() {
        int i;
        for(i=0;i<n;i++)
            System.out.print("  " + a[i]);
        System.out.println();
    }
//==================================================

    // Hàm hoán vị
    void swap(int i, int k) {
        int x;
        x=a[i];
        a[i]=a[k];
        a[k]=x;
    }

    // Hàm sắp xếp bằng thuật toán nổi bọt, sau mỗi bước sắp xếp hãy gọi tới hàm display() để hiển thị giá trị của mảng a ra màn hình
    void bubbleSort() {
        n = a.length;
        for(int i = 0; i < n - 1; i++) {
            for(int j = 0; j < n - 1 - i; j++) {
                if(a[j] > a[j + 1]) {
                    swap(j, j + 1);
                }
            }
            display();
        }
    }

    public static void main(String[] args) {
        int[] b = {5, 7, 11, 3, 9, 2, 6};

        SimpleSort_ex1 t = new SimpleSort_ex1(b);

        t.bubbleSort();
    }
}
