import java.io.IOException;
import java.util.Scanner;

public class Main {
    static Scanner sc;
    public static void end() {
        System.out.println("------------------------------------------");
    }
    public static void main(String[] args) throws IOException {
        sc = new Scanner(System.in);
        MyPerson myPerson = new MyPerson();
        Graph g = new Graph();
        int choice;
        while (true) {
            System.out.println("Choose one of this options:");
            System.out.println("Person Tree:");
            System.out.println("1. Insert a new Person");
            System.out.println("2. Inorder traverse");
            System.out.println("3. Preorder traverse");
            System.out.println("4. Postorder traverse");
            System.out.println("5. Breadth-First Traversal traverse");
            System.out.println("6. Search by Person ID");
            System.out.println("7. Delete by Person ID");
            System.out.println("8. Balancing Binary Search Tree");
            System.out.println("9. Display adjacency matrix from file");
            System.out.println("10. DFS_Graph");
            System.out.println("11. BFS_Graph");
            System.out.println("12. Dijkstra");
            System.out.println("13. Exit");
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
                    myPerson.preOrder();
                    end();
                    break;
                case 4:
                    myPerson.postOrder();
                    end();
                    break;
                case 5:
                    myPerson.BST();
                    end();
                    break;
                case 6:
                    myPerson.search();
                    end();
                    break;
                case 7:
                    myPerson.delete();
                    System.out.println("Deleted!");
                    end();
                    break;
                case 8:
                    myPerson.balance();
                    end();
                    break;
                case 9:
                    g.printMatrix();
                    end();
                    break;
                case 10:
                    g.depth(0);
                    System.out.println();
                    end();
                    break;
                case 11:
                    g.breath(0);
                    System.out.println();
                    end();
                    break;
                case 12:
                    break;
            }
        }
    }
}
