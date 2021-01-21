import java.io.*;

import java.util.Arrays;
import java.util.Scanner;


public class ASM2_Main {
    static Scanner sc;
    static OperationToProduct op = new OperationToProduct();
    static MyList<Product> myList = new MyList<Product>();
    static File urlData = new File("\\hoctap\\ASM_2\\src\\data.txt");

    private static void writeData() {
        try {
            FileWriter fw = new  FileWriter(urlData);

            /*fw.write("P03;Sugar;12;25.1\n");
            fw.write("P01;Milk;10;5.2\n");
            fw.write("P02;Apple;5;4.3\n");
            fw.write("P05;Rose;7;15.4\n");
            fw.write("P07;Beer;11;12.2\n");
            fw.write("P04;Book;9;5.2\n");*/
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void  loadData() throws IOException {

        // read file
        FileInputStream fileInputStream = new FileInputStream(urlData);
        Scanner scanner = new Scanner(fileInputStream);
        try {
            while (scanner.hasNextLine()) {
                String str = scanner.nextLine();
                String[] subStr = str.split(";");
                Product sp = new Product(subStr[0],subStr[1],Integer.parseInt(subStr[2]), Double.parseDouble(subStr[3]));
                myList.insertAfter(sp);
                System.out.println(sp);
            }
        } finally {
            try {
                scanner.close();
                fileInputStream.close();
            } catch (IOException e) {
                System.out.println("Exception");
            }
        }
    }
    public static void head() {
        System.out.printf("%-5s%-10s%-10s%-10s%n", "ID" ,"Title" ,"Quality", "Price");
        System.out.println("+------------------------------+");
    }

    public static void main(String[] args) throws IOException {
        sc = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println();
            System.out.println("Choose one of this options:");
            System.out.println("Product list:");
            System.out.println("1. Load data from file and display");
            System.out.println("2. Input & add to the end.");
            System.out.println("3. Display data");
            System.out.println("4. Save product list to file.");
            System.out.println("5. Search by ID");
            System.out.println("6. Delete by ID");
            System.out.println("7. Sort by ID.");
            System.out.println("8. Convert to Binary");
            System.out.println("9. Load to stack and display");
            System.out.println("10. Load to queue and display.");
            System.out.println("0. Exit");
            System.out.println();
            System.out.print("Choice: ");
            // choice
            choice = sc.nextInt();
            if(choice == 0) {
                System.out.println("Good bye, have a nice day!");
                break;
            }
            switch (choice) {
                case 1:
                    head();
                    loadData();
                    break;
                case 2:
                    myList.insertAfter(op.inputProduct());
                    System.out.println("Enter successfully!!!");
                    break;
                case 3:
                    head();
                    myList.traverse();
                    break;
                case 4:
                case 5:
                default:


            }
        }
    }
}
