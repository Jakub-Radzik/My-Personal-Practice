import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class Repeat {

    OddEven oddEven;

    @RepeatedTest(10)
//    @ParameterizedTest
//    @ValueSource(ints = {2,4,1000,200000,3000000})
    @DisplayName("Repeated test")
    void timeTest(){
        oddEven = new OddEven();
        assertTimeout(Duration.ofMillis(100), ()->assertTrue(oddEven.isEven(90000000)));
    }

}
