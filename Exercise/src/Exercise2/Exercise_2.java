package Exercise2;

import java.util.Scanner;

public class Exercise_2 {
    static Scanner sc;

    // bubble sort
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
        }
    }

    // selection sort
    private static void selectionSort(int[] a) {
        int position;
        for(int i = 0; i < a.length; i++) {
            int j = i + 1;
            position = i;
            int temp = a[i];
            for(; j < a.length; j++) {
                if(a[j] < temp) {
                    temp = a[j];
                    position = j;
                }
            }
            a[position] = a[i];
            a[i] = temp;
            display(a);
        }
        System.out.println();
    }

    // insertion sort
    private static void insertionSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int temp = a[i];
            int j = i - 1;
            for (; j >= 0 && a[j] > temp; j--){
                a[j + 1] = a[j];
            }
            a[j + 1] = temp;
            display(a);
        }
        System.out.println();
    }

    // search element in the array.
    private static int search(int[] a, int x) {
        for(int i = 0; i < a.length; i++) {
            if(a[i] == x) {
                return i;
            }
        }
        return -1;
    }

    // display the elements of the array
    private static  void display(int[] a) {
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // check int input
    private static int checkIntNumber() {
        int num = 0;
        sc = new Scanner(System.in);
        boolean check = true;
        while (check) {
            if (sc.hasNextInt()) {
                num = sc.nextInt();
                check = false;
            } else {
                System.out.println("Should you enter an integer?");
                System.out.print("Your choice: ");
                sc.nextLine();
            }
        }
        return num;
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        //int choice;
        System.out.print("Enter length of the array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        //int [] a = {5,7,11,3,9,2,6};
        System.out.println();

        int choice;
        while (true) {
            System.out.println("Choose your option");
            System.out.println("1. Display data");
            System.out.println("2. Bubble sort");
            System.out.println("3. Selection sort");
            System.out.println("4. Insertion sort");
            System.out.println("5. Search");
            System.out.println("0. Exit");
            System.out.println("You selection (0 -> 5): ");
            System.out.println();
            System.out.print("Your choice: ");

            choice = checkIntNumber();
            if(choice == 0) {
                System.out.println("Good bye, have a nice day!");
                break;
            }
            switch (choice) {
                case 1 -> {
                    System.out.println("Input data:");
                    display(a);
                    System.out.println();
                }
                case 2 -> {
                    System.out.println("Bubble sort result: ");
                    bubbleSort(a);
                    System.out.println();
                }
                case 3 -> {
                    System.out.println("Selection sort result: ");
                    selectionSort(a);
                    System.out.println();
                }
                case 4 -> {
                    System.out.println("Insertion sort result: ");
                    insertionSort(a);
                    System.out.println();
                }
                case 5 -> {
                    System.out.print("Enter the number to find the position in the array: ");
                    int x = checkIntNumber();
                    System.out.println();
                    int result = search(a, x);
                    if (result == -1) {
                        System.out.println("Result: " + x +" is not in the array");
                    } else
                        System.out.println("Result: " + x + " is present at index " + result + " in the array data.");
                    System.out.println();
                }
                default -> {
                    System.out.println("**Invalid choice. Try again.**");
                    System.out.println();
                }
            }
        }
    }
}
