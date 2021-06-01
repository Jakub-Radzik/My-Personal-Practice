import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assumptions.*;
import static org.junit.jupiter.api.Assertions.*;

public class Assumptions {

    @Test
    @DisabledOnJre(JRE.JAVA_15)
    void testOnDevEnv(){

//        for (Map.Entry<String, String> entry : System.getenv().entrySet()) {
//            System.out.println(entry.getKey() + ":" + entry.getValue());
//        }
        System.out.println(System.getProperty("java.version"));
        System.setProperty("ENV", "DEV");
        assumeTrue("DEV".equals(System.getProperty("ENV")));
    }

    @Test
    @DisabledOnOs(OS.WINDOWS)
    @DisabledOnJre(JRE.JAVA_15)
    void testOnProdEnv(){
        System.setProperty("ENV", "PROD");
        assumeFalse("DEV".equals(System.getProperty("ENV")), "Assumption failed");
    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    @DisabledOnJre(JRE.JAVA_15)
    void assum(){
        System.setProperty("ENV", "DEV");
        assumingThat(System.getProperty("ENV").equals("DEV"),
            () -> {
                assertEquals(2,1+1);
            }
        );
    }

}
