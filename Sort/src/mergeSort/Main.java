package mergeSort;

public class Main {
    public static void main(String[] args) {
        int[] b =  {7,3,5,9,11,8,6,15,10,12,14};
        MergeSort t = new MergeSort(b);
        int n = b.length;
        t.mergeSort(0, n - 1);
        t.display();
        System.out.println();
    }
}
