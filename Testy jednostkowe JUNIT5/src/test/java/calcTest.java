import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class calcTest {

    Calculator calculator;

    @BeforeEach
    void init(){
        calculator = new Calculator();
    }

    @Test
    public void test1(){
        assertEquals(7, calculator.addition(3,4));
    }
}
