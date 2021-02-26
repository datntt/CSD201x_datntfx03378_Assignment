import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Graph {
    int[][] a;
    int n;
    static int INF = 99; // 99 is considered as infinite value
    static File urlData = new File("hoctap\\github\\CSD201x_datntfx03378_Assignment\\Assignment\\ASM3\\src\\Matran.txt");

    Graph () {
        a = null;
        n = 7;
    }
    public void readFile() throws IOException {
        FileInputStream fileInputStream = new FileInputStream(urlData);
        Scanner scanner = new Scanner(fileInputStream);
        try {
            while (scanner.hasNextLine()) {
                String str = scanner.nextLine();
                String[] subStr = str.split(";");


            }
        }  finally {
            try {
                scanner.close();
                fileInputStream.close();
            } catch (IOException e) {
                System.out.println("Exception");
            }
        }

    }

}
