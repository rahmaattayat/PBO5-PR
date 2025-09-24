
abstract class Sortable {
    public abstract int compare(Sortable b);

    // Shell sort generik untuk array Sortable[]
    public static void shell_sort(Sortable[] a) {
        int n = a.length;
        // gap sequence sederhana: n/2, ..., 1
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                Sortable temp = a[i];
                int j = i;
                // Geser elemen yang lebih besar ke kanan
                while (j >= gap && a[j - gap].compare(temp) > 0) {
                    a[j] = a[j - gap];
                    j -= gap;
                }
                a[j] = temp;
            }
        }
    }
}
