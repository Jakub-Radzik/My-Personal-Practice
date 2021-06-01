import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Tests1 {

    StringUtils stringUtils;

    @BeforeEach
    public void init(){
        stringUtils = new StringUtils();
    }


    @Test
    public void txt2(){
        assertAll(
            () -> assertTrue(stringUtils.evenOdd("22")),
            () -> assertFalse(stringUtils.evenOdd("222"))
        );
    }


}
