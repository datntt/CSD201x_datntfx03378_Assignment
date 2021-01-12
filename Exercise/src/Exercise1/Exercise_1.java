package Exercise1;

import java.util.Scanner;

public class Exercise_1 {
    static Scanner sc;

    private static void bubbleSort(int[] a) {
        int temp;
        for(int i = 0; i < a.length - 1;i++) {
            for(int j = 0; j < a.length - 1 - i; j++) {
                if(a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
            display(a);
            System.out.println();
        }
    }

    private static  void display(int[] a) {
        for (int j : a) {
            System.out.print(" " + j);
        }
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        bubbleSort(arr);
    }
}
