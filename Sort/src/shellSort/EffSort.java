package shellSort;

public class EffSort {
    int[] a;
    int n;
    EffSort() {}
    EffSort(int[] b) {
        int i;
        n  = b.length;
        a = new int[n];
        for(i = 0; i < n; i++) {
            a[i] = b[i];
        }
    }
    // set giá trị cho mảng
    void setData (int[] b) {
        int i;
        n = b.length;
        a = new int[n];
        for(i = 0;  i < n; i++) {
            a[i] = b[i];
        }
    }
    // display
    void display() {
        for (int i = 0; i < n; i++) {
            System.out.print(" " + a[i]);
        }
        System.out.println();
    }
    // shell short
    void insertSort2(int h) {
        int i, j, x;
        for(i = h; i < n; i++) {
            x = a[i];
            j = i;
            while (j - h >= 0 && x < a[j - h]) {
                a[j] = a[j - h]; // kéo nút lớn hơn x lên vị trí h
                j = j - h;
            }
            a[j] = x;
        }
    }
    //
    void shellSort(int[] step) {
        //
        int h, i, stepNum;
        stepNum = step.length;
        for (i = 0; i < stepNum; i++) {
            h = step[i];
            insertSort2(h);
        }
    }
    //
    void shellSort() {
        int[] step = {5, 3, 1};
        shellSort(step);
    }
}
