import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStatementTest {

    @Test
    void reverseStatement() {
        ReverseStatement reverseStatement = new ReverseStatement();
        assertEquals("yM eman si nahk", reverseStatement.reverseStatement("My name is khan"));
    }
}