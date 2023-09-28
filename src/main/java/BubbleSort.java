import java.util.Arrays;

public class BubbleSort {

    public int[] bubbleSort(int[] integers) {
        for(int i = 0; i < integers.length; i++) {
            for(int j = 0; j < integers.length; j++) {
                if(integers[i] < integers[j]) {
                    int temp = integers[i];
                    integers[i] = integers[j];
                    integers[j] = temp;
                }
            }
        }
        return integers;
    }

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        System.out.println(Arrays.toString(bubbleSort.bubbleSort(new int[]{5, 8, 9, 1, 15, 23, 44, 2, 99})));
    }
}
