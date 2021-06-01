import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;
import java.util.Queue;

@DisplayName("Main class")
public class NestedTests {

    Queue<String> queue;

    @Test
    void isNot(){
        assertNull(queue);
    }


    @org.junit.jupiter.api.Nested
    class Nested{

        @BeforeEach
        void create() {
            queue = new LinkedList<>();
        }

        @Test
        void pollTest(){
            assertNull(queue.poll());
        }


    }

}
