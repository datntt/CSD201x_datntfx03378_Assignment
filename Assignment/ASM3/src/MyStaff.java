import java.util.LinkedList;
import java.util.Scanner;

public class MyStaff {
    MyBTree tree;
    Scanner sc;
    // constructor
    public MyStaff() {
        tree = new MyBTree();
    }

    public void insert() {
        MyQueue list = new MyQueue();
        // input id
        sc = new Scanner(System.in);
        System.out.print("Input ID: ");
        String id = sc.nextLine();
        // input name
        System.out.print("Input name: ");
        String name = sc.nextLine();
        // input birthplace
        System.out.print("Input birthplace: ");
        String birthplace = sc.nextLine();
        // input dob
        System.out.print("Input date of birth: ");
        String dob = sc.nextLine();
        // check

        // insert date into tree
        tree.insert(new Staff(id, name, birthplace, dob));
        list.enqueue();

        System.out.println("------------------------------------------");
    }
    // in-order traverse
    public void inOrder() {

    }







}
