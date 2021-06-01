import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class EnumAndMethodProviderTest {

    OddEven oddEven;

    @ParameterizedTest
    @EnumSource(Animal.class)
    void testEnum(Animal animal){
        assertNotNull(animal);
    }

    @ParameterizedTest
    @MethodSource("paramProv")
    void testWithProv(String arg){
        assertNotNull(arg);
    }

    @ParameterizedTest
    @MethodSource("paramProv2")
    void testWithProv2(String arg){
        assertNotNull(arg);
    }

    @ParameterizedTest
    @MethodSource("paramProv3")
    void testWithProv3(int arg){
        oddEven = new OddEven();
        assertTrue(oddEven.isEven(arg));
    }

    @ParameterizedTest
    @CsvSource({"one, 1", "two, 2", "three, 3"})
    void testWith(String first, int second){
        assertNotNull(first);
        assertNotEquals(0, second);
    }



    static Stream<String> paramProv(){
        return Stream.of("p1", "p2", "p3");
    }

    static ArrayList<String> paramProv2(){
        return new ArrayList<>(Arrays.asList("p1", "p2", "p3"));
    }
    static ArrayList<Integer> paramProv3(){
        return new ArrayList<>(Arrays.asList(2,4,6,8,10));
    }



}
