import java.util.Scanner;

public class Main {
    static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        MyPerson myPerson = new MyPerson();
        int choice;
        while (true) {
            System.out.println("Choose one of this options:");
            System.out.println("Person Tree:");
            System.out.println("1. Insert a new Person");
            System.out.println("2. Inorder traverse");
            System.out.println("3. Breadth-First Traversal traverse");
            System.out.println("4.Search by Person ID");
            System.out.println("5. Delete by Person ID");
            System.out.println("6.  Balancing Binary Search Tree");
            System.out.println("7. DFS_Graph");
            System.out.println("8. Dijkstra");
            System.out.println("0. Exit");
            System.out.println();
            System.out.print("Choice: ");
            // check choice
            choice = sc.nextInt();
            if(choice == 0) {
                System.out.println("Good bye, have a nice day!");
                break;
            }
            switch (choice) {
                case 1:
                    myPerson.insert();
                    System.out.println("------------------------------------------");
                    break;
                case 2:
                    myPerson.inOrder();
                    break;
                case 3:
            }
        }
    }
}
