package student;

public class StudentService {

    private StudentDAO studentDAO;

    public StudentService(StudentDAO studentDAO) {
        super();
        this.studentDAO = studentDAO;
    }

    public int findTotal() {
        int[] array = studentDAO.getMarks();

        int sum = 0;
        for (int value: array) {
            sum+= value;
        }

        return sum;
    }

}
