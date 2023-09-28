public class BalanceParentheses {

    // Function to return required minimum number

    /**
     * Question: write a function that returns a minimum number of Parentheses to be added to make it valid.
     *
     * @param p
     * @return
     */
    static int minimumParentheses(String p)
    {

        // maintain balance of string
        int bal = 0;
        int ans = 0;

        for (int i = 0; i < p.length(); ++i) {

            bal += p.charAt(i) == '(' ? 1 : -1;

            // It is guaranteed bal >= -1
            if (bal == -1) {
                ans += 1;
                bal += 1;
            }
        }

        return bal + ans;
    }

    public static void main(String[] args) {
        String parentheses1 = "())";
        String parentheses2 = "))((";
        String parentheses3 = "(()()";
        System.out.println(minimumParentheses(parentheses1));
        System.out.println(minimumParentheses(parentheses2));
        System.out.println(minimumParentheses(parentheses3));
    }
}
