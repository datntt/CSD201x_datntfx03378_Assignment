package Exercise6;
import java.util.Scanner;

public class Queen {
    int n, count;
    boolean[] a, b, c;
    int[] x;
    Scanner in;
    Queen() {
        x = new int[20];
        a = new boolean[20];
        b = new boolean[40];
        c = new boolean[40];
        in = new Scanner(System.in);
    }
    void init() {
        int i;
        System.out.print(" n = ");
        n = in.nextInt();
        count = 0;
        for(i = 1;i <= n;i++) a[i] = true;
        for(i = 1;i <= 2 * n;i++) b[i] = true;
        for(i = 1;i <= 2 * n;i++) c[i] = true;
    }
    //
    void result() {
        int i;
        System.out.printf("\n%3d: ", ++count);
        for(i = 1; i <= n; i++) {
            System.out.printf("%4d", x[i]);
        }
    }
    // Hàm thuật toán tìm nghiệm.
    void test(int i) {

    }

    //==========================
    public static void main(String[] args) {
        Queen t = new Queen();
        t.init();
        t.test(1);
        System.out.println();
    }
}
