import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxFrequencyNumberTest {

    @Test
    void maxFrequencyElement() {
        int[] arr =  {10, 20, 10, 20, 30, 20, 20};
        MaxFrequencyNumber maxFrequencyNumber = new MaxFrequencyNumber();
        assertEquals(20, maxFrequencyNumber.getMostFrequentElement(arr));
    }
}