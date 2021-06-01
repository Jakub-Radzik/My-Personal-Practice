import org.junit.jupiter.api.Test;
import student.StudentDAO;
import student.StudentService;
import static org.junit.jupiter.api.Assertions.*;

public class StudentServiceStubTest {

    @Test
    void testFindTotal(){
        StudentService studentService = new StudentService(new StudentDAO());
        int total = studentService.findTotal();
        assertEquals(40, total);
    }

}
