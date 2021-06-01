import org.junit.Test;

import static org.junit.Assert.*;

public class FirstJunit5Test {
    @Test
    public void givenEven(){
        OddEven oddEven = new OddEven();
        assertTrue(oddEven.isEven(2));
    }

    @Test
    public void givenOdd(){
        OddEven oddEven = new OddEven();
        assertFalse(oddEven.isEven(3));
    }
}
