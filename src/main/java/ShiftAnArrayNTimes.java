import java.util.Arrays;

public class ShiftAnArrayNTimes {
    /**
     * Question: Write a method that shifts an array n times to left side?
     * int[] array = {1,2,3,4,5};
     * int shifts = 6;
     *
     * @param arr given an integer array.
     * @param shifts number of times that you want to shift.
     * @return n times shifted array.
     */
    static int[] shiftLeft(int[] arr, int shifts) {
        if(arr.length == shifts) {
            return arr;
        }
        else {
            shifts = shifts % arr.length;
            int first = arr[0];
            int i = 1;
            while(i < arr.length) {
                arr[i - 1] = arr[i];
                i++;
            }
            arr[i -1] = first;
            shifts--;
            if(shifts != 0) {
                shiftLeft(arr, shifts);
            }
        }
        return arr;
    }





    /*
     * Complete the 'slowestKey' function below.
     *
     * The function is expected to return a CHARACTER.
     * The function accepts 2D_INTEGER_ARRAY keyTimes as parameter.
     */



    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int shifts = 6;
        shiftLeft(array, shifts);
        System.out.println(Arrays.toString(array));

        int[] array1 = {6, 8, 10, 11, 12};
        int[] array2 = {1, 2, 4, 6, 11};
        int[] array3 = {5, 6, 8, 11};









    }
}
