package mergeSort;

public class MergeSort {
    int[] a;
    int n;
    MergeSort() {}
    MergeSort(int[]b) {
        int i;
        n = b.length;
        a = new int[n];
        for(i = 0; i < n; i++) a[i] = b[i];
    }
    void setData(int [] b) {
        int i;
        n = b.length;
        a = new int[n];
        for(i=0;i<n;i++)
            a[i]= b[i];
    }
    void display() {
        int i;
        for(i=0;i<n;i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }
    // sắp xếp theo thứ tự tăng dần bằng phương pháp MerSort
    void mergeSort(int p, int r) {
        if(p>= r) return;
        int q = (p + r) / 2;
        mergeSort(p, q);
        mergeSort(q + 1, r);
        merge(p, q, r);
    }

    private void merge(int p, int q, int r) {
        if(!(p<=q) && (q<=r)) return;
        int n,i,j,k; n = r -p + 1;
        int [] b = new int[n];
        i = p; j = q + 1; k=0;
        while(i<=q && j<=r) {
            if(a[i]<a[j])
            b[k++] = a[i++];
        else
            b[k++] = a[j++];
        }
        while(i<=q)  b[k++] = a[i++];
        while(j<=r)  b[k++] = a[j++];
        k=0;
        for(i=p;i<=r;i++) a[i] = b[k++];
    }
}
