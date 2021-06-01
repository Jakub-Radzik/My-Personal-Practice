import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayUtilsTest {

    ArrayUtils arrayUtils;

    @BeforeEach
    void init(){
        System.out.println("Initializing before test");
        arrayUtils = new ArrayUtils();
    }

    @AfterEach
    void afterEach(){
        System.out.println("Clean up after test");
    }

    @BeforeAll
    static void beforeAll(){
        System.out.println("Before all");
    }

    @AfterAll
    static void afterAllTests() {
        System.out.println("Run this code after all tests");
    }

    @Test
    public void sortTest(){
        assertArrayEquals(new int[]{1,2,3,4}, arrayUtils.sortArray(new int[]{4,3,2,1}));
    }

    @Test
    public void sortTests(){
        assertAll(
                () -> assertArrayEquals(new int[]{1,2,3,4}, arrayUtils.sortArray(new int[]{4,3,2,1})),
                () -> assertArrayEquals(new int[]{1,1,1,1}, arrayUtils.sortArray(new int[]{1,1,1,1})),
                () -> assertArrayEquals(new int[]{2,2,4,4}, arrayUtils.sortArray(new int[]{2,4,2,4}))
        );
    }


}
