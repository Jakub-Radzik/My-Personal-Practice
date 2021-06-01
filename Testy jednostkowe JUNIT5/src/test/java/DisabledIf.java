import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.DisabledIfSystemProperty;

import static org.junit.jupiter.api.Assertions.*;

public class DisabledIf {

    @BeforeAll
    static void init(){
        System.out.println(System.getenv("PATH"));
        System.out.println(System.getenv());
    }

    @Test
    @DisabledIfSystemProperty(named = "os.name", matches = "Windows 10")
    public void test1(){
        assertEquals(2,1+1);
    }

    @Test
    @DisabledIfEnvironmentVariable(named = "PROCESSOR_LEVEL", matches = "6")
    public void test2(){
        assertEquals(2,1+1);
    }

}
