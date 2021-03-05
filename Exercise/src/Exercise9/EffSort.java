package Exercise9;

public class EffSort {
    int[] a;
    int n;
    EffSort() {}
    public EffSort(int[] b) {
        int i;
        n = b.length;
        a = new int[n];
        for(i = 0; i < n; i++) {
            a[i] = b[i];
        }
    }

    void display() {
        for(int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    // quick sort
    int partition(int low, int up) {
        int pivot = a[up];
        int i = low - 1; // index of element smaller than pivot
        for(int j = low; j <= up - 1; j++) {
            if(a[j] <= pivot) {
                i++;
                //swap(i, j);
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        //swap(a[i + 1], a[up]);
        int temp = a[i+1];
        a[i + 1] = a[up];
        a[up] = temp;


        return i + 1;
    }
    void quicksort(int low, int up) {
        if(low < up) {
            int pi = partition(low, up);
            quicksort(low, pi - 1);
            quicksort(pi + 1, up);
        }
    }
    void quickSort() {
        quicksort(0, n - 1);
    }

}
