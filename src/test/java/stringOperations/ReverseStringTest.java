package stringOperations;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ReverseStringTest {

    private final ReverseString reverseString = new ReverseString();

    @Test
    public void shortWordsTestShouldBeCorrectReversed(){

        assertEquals(reverseString.reverseString("ABCDEF"),"FEDCBA");
        assertEquals(reverseString.reverseString("Waclaw"), "walcaW");
    }

}