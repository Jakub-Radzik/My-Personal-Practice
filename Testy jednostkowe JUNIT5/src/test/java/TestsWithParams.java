import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class TestsWithParams {

    OddEven oddEven;

    @ParameterizedTest
    @ValueSource(ints = {2,4,6,Integer.MAX_VALUE-1})
    void seriesOdd(int number){
        oddEven = new OddEven();
        assertTrue(oddEven.isEven(number));
    }

}
