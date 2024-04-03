import java.util.List;

public class Curs {
    private List<Student> students;
    
    public Course(List<Student> students) {
        this.students = students;
    }
    
    public int countStudents() {
        return students.size();
    }
}
