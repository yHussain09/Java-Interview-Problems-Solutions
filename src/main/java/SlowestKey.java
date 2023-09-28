import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SlowestKey {


    /**
     * Question: Determine which key takes the longest press.
     * Example:
     *  ketTimes = [[0.2], [1.5], [0.9], [2, 15]]
     *  Interpret each KeyTimes[i][0] as an encoded character in the range ascii[a-z] where a = 0, b = 1, ...., z = 25.
     *  The second element KeyTimes[i][1] represent the time the key is pressed since the start of the test. In the example,
     *  keys pressed, in order are 0102 encoded = abac at times 2, 5 9, 15. From the start time, it took 2 - 0 = 2 to press
     *  the first key, 5 - 2 = 3 to press the second key, and so on. The longest time it took press a key was key 2, or 'c'
     *  at 15 - = 6.
     *
     * Function Description:
     *  Complete the function slowestKey. The function must return a character.
     *
     * Constraints:
     *  -> 1 <= n <= 10^5
     *  -> 0 <= keyTimes[i][0] <= 25 (0 <= i < n)
     *  -> 1 <= keyTimes[i][1] <= 10^8 (0 <= i < n)
     *  -> There will be only one key with the worst time.
     *
     * @param keyTimes
     * @return
     */
    public static char slowestKey(List<List<Integer>> keyTimes) {
        // Write your code here
        HashMap<Integer, Character> characterMap = new HashMap<>();
        characterMap.put(0, 'a');
        characterMap.put(1, 'b');
        characterMap.put(2, 'c');
        characterMap.put(3, 'd');
        characterMap.put(4, 'e');
        characterMap.put(5, 'f');
        characterMap.put(6, 'g');
        characterMap.put(7, 'h');
        characterMap.put(8, 'i');
        characterMap.put(9, 'j');
        characterMap.put(10, 'k');
        characterMap.put(11, 'l');
        characterMap.put(12, 'm');
        characterMap.put(13, 'n');
        characterMap.put(14, 'o');
        characterMap.put(15, 'p');
        characterMap.put(16, 'q');
        characterMap.put(17, 'r');
        characterMap.put(18, 's');
        characterMap.put(19, 't');
        characterMap.put(20, 'u');
        characterMap.put(21, 'v');
        characterMap.put(22, 'w');
        characterMap.put(23, 'x');
        characterMap.put(24, 'y');
        characterMap.put(25, 'z');

        int previousTime = 0;
        int maxTime = 0;
        char character = ' ';
        for (int i = 0; i < keyTimes.size(); i++) {
            List<Integer> keyTime = keyTimes.get(i);
            if(i == 0) {
                maxTime = keyTime.get(1);
            }
            else {
                if(maxTime < keyTime.get(1) - previousTime) {
                    maxTime = keyTime.get(1) - previousTime;
                    character = characterMap.get(keyTime.get(0));
                }
            }
            previousTime = keyTime.get(1);
        }
        return character;
    }


    public static void main(String[] args) {
        List<List<Integer>> keyTimes= new ArrayList<>();
        List<Integer> key1 = new ArrayList<>();
        key1.add(0);
        key1.add(2);
        keyTimes.add(key1);

        List<Integer> key2 = new ArrayList<>();
        key2.add(1);
        key2.add(5);
        keyTimes.add(key2);

        List<Integer> key3 = new ArrayList<>();
        key3.add(0);
        key3.add(9);
        keyTimes.add(key3);

        List<Integer> key4 = new ArrayList<>();
        key4.add(2);
        key4.add(15);
        keyTimes.add(key4);

        System.out.println(slowestKey(keyTimes));

    }
}
