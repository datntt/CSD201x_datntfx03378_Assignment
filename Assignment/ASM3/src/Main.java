import java.util.Scanner;

public class Main {
    static Scanner sc;
    public static void end() {
        System.out.println("------------------------------------------");
    }
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
            System.out.println("4. Search by Person ID");
            System.out.println("5. Delete by Person ID");
            System.out.println("6. Balancing Binary Search Tree");
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
                    end();
                    break;
                case 2:
                    myPerson.inOrder();
                    end();
                    break;
                case 3:
                    myPerson.BST();
                    end();
                    break;
                case 4:
                    myPerson.search();
                    end();
                    break;
                case 5:
                    myPerson.delete();
                    System.out.println("Deleted!");
                    end();
                    break;
                case 6:
                    myPerson.balance();
                    end();
                    break;
                case 7:
                    break;
            }
        }
    }
}
