import java.util.Scanner;

public class MyPerson {
    MyBSTree tree;
    Scanner sc;
    // constructor
    public MyPerson() {
        tree = new MyBSTree();
    }

    public void insert() {
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
        tree.insert(new Person(id, name, birthplace, dob));
    }
    // in-order traverse
    public void inOrder() {
        tree.inOrder(tree.root);
    }







}
