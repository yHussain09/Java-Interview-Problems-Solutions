public class ShiftsAnArrayNTimesToLeftSide {

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
}
