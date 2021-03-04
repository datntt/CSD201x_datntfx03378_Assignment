package countingSort;

import java.util.Arrays;

public class CountingSort {
    public static int[] countingSort(int[] a, int k) {
        int[] c = new int[k];
        for (int i = 0; i < a.length; i++) {
            c[a[i]] ++;
        }
        for(int i = 1; i < k; i++) {
            c[i] += c[i - 1];
        }
        int[] b = new int[a.length];
        for(int i = a.length - 1; i >= 0; i--) {
            b[--c[a[i]]] = a[i];
        }
        return b;
    }

    public static void main(String[] args) {
        int[] a = {2, 1, 5, 4, 2, 3, 1, 3, 6, 8, 2, 5, 10, 8, 9,7, 6, 8, 9, 10};
        int k = a.length;

        System.out.println(Arrays.toString(countingSort(a, k)));
    }
}
