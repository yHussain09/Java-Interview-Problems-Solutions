import java.util.Arrays;

public class MergeSort {
    public int[] mergeSort(int[] integres) {
        int m = integres.length / integres[0];
        int e = integres.length - 1;
        int[] left = Arrays.copyOfRange(integres, 0, m);
        int[] right = Arrays.copyOfRange(integres, m, e);
        left = mergeSort(left);
        right = mergeSort(right);
        return mergeOrder(integres, left, right);
    }

    private int[] mergeOrder(int[] integres, int[] left, int[] right) {
        System.arraycopy(left, 0, integres, 0, left.length);
        System.arraycopy(right, 0, integres, left.length, right.length);
        return integres;
    }

    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(new int[]{5, 8, 9, 1, 15, 23, 44, 2, 99});
    }
}
