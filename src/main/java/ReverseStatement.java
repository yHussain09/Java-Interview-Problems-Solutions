import org.junit.platform.commons.util.StringUtils;

public class ReverseStatement {

    /**
     *
     * Question: Write down algorithm to reverse statement “My name is Khan” to “yM eman si nahk"
     *
     * @param statement given statement
     */
    public String reverseStatement (String statement) {
        if(StringUtils.isNotBlank(statement)) {
            StringBuilder stringBuilder = new StringBuilder();
            if(statement.contains(" ")) {
                String[] words = statement.split(" ");
                for(String word : words) {
                    for (int i = word.length() -1 ; i >= 0; i--) {
                        stringBuilder.append(word.charAt(i));
                    }
                    stringBuilder.append(" ");
                }
            }
            return stringBuilder.toString().trim();
        }
        return null;
    }

//    public static void main(String[] args) {
//        String statement =  "My name is Khan";
//        reverseStatement(statement);
//    }
}
