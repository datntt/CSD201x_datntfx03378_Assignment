package Exercise7;

import java.util.Scanner;

public class Main {
    static Scanner sc;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        BTree t = new BTree();

        /*System.out.print("n = ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.print("Elements of array: ");
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }*/

        int[] a = {25,10,30,5,20,10,15};

        t.insertMany(a);
        System.out.println();
        System.out.println("\nPre-order traverse:");
        t.preOrder(t.root);
        System.out.println("\nIn-order traverse:");
        t.inOrder(t.root);

        System.out.println("\nSearch:");
        t.search(t.root, 10);
    }
}
