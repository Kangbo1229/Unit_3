
import org.junit.Test;

import static org.junit.Assert.*;

public class TestDigitsTest {

    @Test
    public void testDigits() {
        assertEquals(true, ShareDigit.digits(14, 43));
        assertEquals(true, ShareDigit.digits(99, 39));
        assertEquals(false, ShareDigit.digits(22, 65));
        assertEquals(false, ShareDigit.digits(11, 88));
    }
}
