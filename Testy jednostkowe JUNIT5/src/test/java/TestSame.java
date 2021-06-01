import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import static  org.junit.jupiter.api.Assertions.*;

@DisplayName("Testowanie mordeczko")
public class TestSame {


    @Test
    @DisplayName("test numer 1")
    public void t1(){

        String t1 = "123";
        String t2 = "123";
        String t3 = new String("123");
        String t4 = new String("123");

        assertAll(
                () -> assertEquals(t2,t3),
                () -> assertEquals(t3,t4),
                () -> assertNotSame(t2,t3),
                () -> assertNotSame(t3,t4)
        );


    }

    @Test
    public void t2(TestInfo testInfo){

        System.out.println(testInfo.getDisplayName());
        System.out.println(testInfo.getTestClass());
        System.out.println(testInfo.getTestMethod());
        System.out.println(testInfo.getTags());

        String t1 = "123";
        String t2 = t1;

        assertAll(
                () -> assertSame(t1,t2),
                () -> assertEquals(t1,t2)
        );
    }

}
