import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindSmallestNumberAmongThreeArraysTest {

    @Test
    void testCase1() {
        int[] array1 = {6, 8, 10, 11, 12};
        int[] array2 = {1, 2, 4, 6, 11};
        int[] array3 = {5, 6, 8, 11};
        FindSmallestNumberAmongThreeArrays findSmallestNumberAmongThreeArrays = new FindSmallestNumberAmongThreeArrays();
        assertEquals(6,findSmallestNumberAmongThreeArrays.smallestCommon(array1, array2, array3));
    }

    @Test
    void testCase2() {
        int[] array1 = {};
        int[] array2 = {1, 2, 4, 6, 11};
        int[] array3 = {5, 6, 8, 11};
        FindSmallestNumberAmongThreeArrays findSmallestNumberAmongThreeArrays = new FindSmallestNumberAmongThreeArrays();
        assertEquals(6,findSmallestNumberAmongThreeArrays.smallestCommon(array1, array2, array3));
    }
}