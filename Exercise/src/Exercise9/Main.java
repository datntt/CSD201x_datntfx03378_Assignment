package Exercise9;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int[] b;
    static int n;
    static Scanner sc;
    // input
    public static void input() {
        sc = new Scanner(System.in);
        System.out.println("Input: ");
        System.out.print("n = ");
        n = sc.nextInt();
        b = new int[n];
        for(int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
    }
    // quick sort
    public static void quickSort() {
        EffSort t = new EffSort(b);
        t.quickSort();
        System.out.println("Mảng đã sắp xếp: ");
        t.display();
    }
    // display
    public static void display() {
        if(b == null)
            System.out.println("Array null");
        System.out.println("Mảng đã nhập: ");
        for(int i = 0; i < n; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();
    }

    // main
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println();
            System.out.println("1. Nhập dữ liệu.");
            System.out.println("2. Hiển thị giá trị mảng đã nhập.");
            System.out.println("3. Sắp xếp & hiển thị mảng.");
            System.out.println("0. Thoát.");
            System.out.println();
            System.out.print("Lựa chon của bạn: ");
            choice = sc.nextInt();

            if(choice == 0) {
                System.out.println("Tạm biệt. Chúc một ngày tốt lành !");
                break;
            }
            switch (choice) {
                case 1:
                    input();
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    quickSort();
                    break;
                default:


            }
        }
    }
}
