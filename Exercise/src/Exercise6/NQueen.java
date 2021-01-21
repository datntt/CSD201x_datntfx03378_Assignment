package Exercise6;

import java.util.Scanner;

public class NQueen {
    static boolean[]  h, cc, cp;

    static int n;
    static int[] x;
    static int count = 0;

    public static void Try(int i) {
        for (int j = 1; j < x.length; j++) {
            if (!h[j] && !cc[j - i + n] && !cp[i + j]) {

                x[i] = j;

                if (i < n) {

                    h[j] = true;

                    cc[j - i + n] = true;

                    cp[i + j] = true;

                    Try(i + 1);

                    h[j] = false;

                    cc[j - i + n] = false;

                    cp[i + j] = false;

                } else {

                    count++;

                    System.out.print(count + ": ");

                    for (int l = 1; l < x.length; ++l)

                        System.out.print(x[l] + " ");

                    System.out.println();
                }
            }
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input n = ");

        n = sc.nextInt();

        h = new boolean [n + 1];

        cc = new boolean[2*n + 1]; //-n..n; 0 ..2n

        cp = new boolean [2*n + 1]; //2 .. 2n

        x = new int [n + 1];

        Try(1);

    }
}
