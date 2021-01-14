import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main_Sort {
    static Scanner sc;
    static int [] a;

    // write input in file
    private static void write_file() {
        int [] array;
        try {
            sc = new Scanner(System.in);
            int n = sc.nextInt();
            array = new int[n];
            System.out.println("Input elements :");
            System.out.println();
            for (int i = 0; i < n; i++) {
                array[i] = sc.nextInt();
            }
            //
            OutputStream os = new FileOutputStream("in.txt");
            for (int i : array) {
                os.write(i);
            }
            os.close();
        } catch (IOException e) {
            System.out.println("Exception");
        }
    }

    // read file save array.
    private static void read_file() throws IOException {
        File fileUrl = new File("\\hoctap\\github\\CSD201x_datntfx03378_Assignment\\Assignment\\ASM1\\CSD201x_AS1_fx03378\\in.txt");
        // url
        FileReader FileUrl = new FileReader(fileUrl);
        int i;
        int e = 0;
        while (FileUrl.read() != -1) {
            e++;
        }
        a = new int[e];
        e = 0;
        FileUrl = new FileReader(fileUrl);
        while ((i = FileUrl.read()) != -1) {
            System.out.print(i + " ");
            a[e] = i;
            e++;
        }
        FileUrl.close();
    }

    // bubble sort
    private static void bubbleSort(int[] a) {

        int [] b = new int[a.length];
        // copy arrays
        System.arraycopy(a, 0, b, 0, a.length);

        int temp;
        for(int i = 0; i < b.length - 1;i++) {
            for(int j = 0; j < b.length - 1 - i; j++) {
                if(b[j] > b[j + 1]) {
                    temp = b[j];
                    b[j] = b[j + 1];
                    b[j + 1] = temp;
                }
                // write file
                try {
                    OutputStream os = new FileOutputStream("out1.txt");
                    for(int w : b) {
                        os.write(w);
                    }
                    os.close();
                } catch (IOException e) {
                    System.out.println("Exception");
                }
            }
            display(b);
        }
    }

    // selection sort
    private static void selectionSort(int[] a) {

        int [] c = new int[a.length];
        System.arraycopy(a, 0, c, 0, a.length);

        int position;
        for(int i = 0; i < c.length; i++) {
            int j = i + 1;
            position = i;
            int temp = c[i];
            for(; j < c.length; j++) {
                if(c[j] < temp) {
                    temp = c[j];
                    position = j;
                }
                //
                try {
                    OutputStream os = new FileOutputStream("out2.txt");
                    for(int w : c) {
                        os.write(w);
                    }
                    os.close();
                } catch (IOException e) {
                    System.out.println("Exception");
                }
            }
            c[position] = c[i];
            c[i] = temp;
            display(c);
        }
        System.out.println();
    }

    // insertion sort
    private static void insertionSort(int[] a) {
        int [] d = new int[a.length];
        System.arraycopy(a, 0, d, 0, a.length);

        for (int i = 0; i < d.length; i++) {
            int temp = d[i];
            int j = i - 1;
            for (; j >= 0 && d[j] > temp; j--){
                d[j + 1] = d[j];

            }
            d[j + 1] = temp;
            display(d);
        }
        //
        try {
            OutputStream os = new FileOutputStream("out3.txt");
            for(int w : d) {
                os.write(w);
            }
            os.close();
        } catch (IOException e) {
            System.out.println("Exception");
        }
        System.out.println();
    }

    // linear search element in the array.
    private static void search (int x) {
        int[] c = new int[a.length];
        System.arraycopy(a,0, c,0, a.length);
        int e = 0;
        for (int j : c) {
            if (j > x) {
                e++;
            }
        }
        //input lớn hơn các ptu trong array
        if(e == 0) {
            System.out.println("null");
            return;
        }
        //
        int[] b = new int[e];
        int z = 0;
        for (int i = 0; i < c.length; i++) {
            if(c[i] > x) {
                b[z] = i;
                z++;
            }
        }

        for (int i : b) {
            System.out.print(i + " ");
        }
        try {
            OutputStream os = new FileOutputStream("out4.txt");
            for(int w : b) {
                os.write(w);
            }
            os.close();
        } catch (IOException ex) {
            System.out.println("Exception");
        }
    }

    // binary search
    private static int binarySearch(int x) {

        int [] e = new int[a.length];
        System.arraycopy(a, 0, e, 0, a.length);
        Arrays.sort(e);
        int l = 0;
        int r = e.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if(e[m] == x) {
                return m;
            } else if (e[m] < x) {
                l = m + 1;
            } else if(e[m] > x) {
                r = m - 1;
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

    public static void main(String[] args) throws IOException {

        sc = new Scanner(System.in);

        int choice;
        while (true) {
            System.out.println();
            System.out.println("+--------------Menu-------------+");
            System.out.println("1. Input");
            System.out.println("2. Output");
            System.out.println("3. Bubble sort");
            System.out.println("4. Selection sort");
            System.out.println("5. Insertion sort");
            System.out.println("6. Search > value");
            System.out.println("7. Search = value");
            System.out.println("0. Exit");
            System.out.println("You selection (0 -> 7): ");
            System.out.println();
            System.out.print("Your choice: ");

            choice = checkIntNumber();
            if(choice == 0) {
                System.out.println("Good bye, have a nice day!");
                break;
            }
            switch (choice) {
                case 1 -> {
                    System.out.println("Choice: 1");
                    System.out.print("Input number of elements: ");
                    write_file();
                    System.out.println();
                }
                case 2 -> {
                    System.out.println("Choice: 2");
                    System.out.println("Read from file");
                    System.out.print("Array: ");
                    read_file();
                    System.out.println();
                }
                case 3 -> {
                    System.out.println("Choice: 3");
                    System.out.println("Bubble sort");
                    bubbleSort(a);
                }
                case 4 -> {
                    System.out.println("Choice: 4");
                    System.out.println("Selection sort");
                    selectionSort(a);
                }
                case 5 -> {
                    System.out.println("Choice: 5");
                    System.out.println("Insertion sort");
                    insertionSort(a);
                }
                case 6 -> {
                    System.out.println("Choice: 6");
                    System.out.println("Linear Search");
                    System.out.print("Input value: ");
                    int x = checkIntNumber();
                    System.out.println();
                    System.out.print("Chỉ số là : ");
                    search(x);
                }
                case 7 -> {
                    System.out.println("Choice: 7");
                    System.out.println("Binary Search");
                    System.out.print("Input value: ");
                    int value = checkIntNumber();
                    System.out.println();
                    int position = binarySearch(value);
                    if (position == -1) {
                        System.out.println("Result: " + value + " is not in the array");
                    } else
                        System.out.println("Result: " + value + " is present at index " + position + " in the array.");
                    System.out.println();
                }
                default -> System.out.println("**Invalid choice. Try again.**");
            }
        }

    }
}
