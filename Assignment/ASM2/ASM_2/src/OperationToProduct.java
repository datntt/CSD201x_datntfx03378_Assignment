import java.util.Scanner;

public class OperationToProduct {
    static Scanner sc;

    // search
    public int index(Product sp, MyList<Product> list) {

        return -1;
    }
    // create product input keyboard
    public Product inputProduct() {
        sc = new Scanner(System.in);
        System.out.print("Input new ID: ");
        String id = sc.nextLine();
        System.out.print("Input Product's Name: ");
        String title = sc.nextLine();
        System.out.print("Input Product's quantity: ");
        int quantity = sc.nextInt();
        System.out.print("Input Product's price: ");
        double price = sc.nextDouble();
        return new Product(id, title, quantity, price);

    }

    public void getAllItemsFromFile(String fileName, MyList<Product> list) {

    }


}
