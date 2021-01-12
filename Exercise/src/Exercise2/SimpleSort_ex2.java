package Exercise2;

import java.util.Scanner;

class SimpleSort_ex2 {
    int [] a; int n;
    SimpleSort_ex2(int [] b) {
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

    // Swap element at position i with element at position k
    void swap(int i, int k) {
        int x;
        x=a[i];
        a[i]=a[k];
        a[k]=x;
    }
    //==================================================
    void selectSort() {
        int min;
        int n = a.length;
        for(int i = 0; i < n; i++) {
            min = i;
            for(int j = i + 1; j < n; j++) {
                if(a[j] < a[min]) {
                    min = j;
                }
            }
            if(a[min] != i) {
                swap(min, i);
                display();
            }
        }
    }


    //==================================================
    void insertSort() {
        for(int i = 0; i < a.length; i++) {
            int j = i - 1;
            int temp = a[i];
            for (; j >= 0 && a[j] > temp; j--) {
                a[j + 1] = a[j];
            }
            a[j + 1] = temp;
            display();
        }
    }

//==================================================

    int Search(int x){
        for(int i = 0; i < a.length; i++) {
            if(a[i] == x) {
                return i;
            }
        }
        return -1;
    }
}
//==================================================
class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        int[] b = {9,3,5,6,1,2,4};
        SimpleSort_ex2 t = new SimpleSort_ex2(b);
        while (true) {
            System.out.println("\n Choose your option:");
            System.out.println("  1. Display data");
            System.out.println("  2. Selection sort");
            System.out.println("  3. Insertion sort");

            System.out.println("  4. Search");

            System.out.println("  0. Exit\n");
            System.out.print("  Your selection (0 -> 4): ");
            choice = sc.nextInt();
            if (choice == 0) {
                System.out.println(" Good bye, have a nice day!");
                break;
            }
            switch (choice) {
                case 1 -> t.display();
                case 2 -> {
                    t.selectSort();
                    t.display();
                }
                case 3 -> {
                    t.insertSort();
                    t.display();
                }
                case 4 -> {
                    System.out.print("Input: ");
                    int x = sc.nextInt();
                    int result = t.Search(x);
                    if (result == -1) {
                        System.out.println("Result: " + x + " is not in the array");
                    } else
                        System.out.println("Result: " + x + " is present at index " + result);
                    System.out.println();
                }
                default -> System.out.println("**Invalid choice. Try again.**");
            }
        }
    }
}