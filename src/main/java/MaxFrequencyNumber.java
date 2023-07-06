import java.util.HashMap;
import java.util.Map;

public class MaxFrequencyNumber {


    /**
     * Question: find the most frequent element in it. If there are multiple elements that appear a maximum number of times, print any one of them.
     * @param nums: arr[] = {10, 20, 10, 20, 30, 20, 20}
     * @return 20
     */
    public int getMostFrequentElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int key = nums[i];
            if (map.containsKey(key)) {
                int frequency = map.get(key);
                map.put(key, ++frequency);
            } else {
                map.put(key, 1);
            }
        }
        int maxFrequency = 0, maxFrequencyNumber = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (maxFrequency < entry.getValue()) {
                maxFrequency = entry.getValue();
                maxFrequencyNumber = entry.getKey();
            }
        }
        return maxFrequencyNumber;
    }

}
