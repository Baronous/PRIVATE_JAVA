package Private_Test_Buoi7;

import java.util.List;

interface StudentService {
    void addStudent(Student student);
    void deleteStudent(int id);
    List<Student> searchStudent(String name);
    List<Student> sortedStudent();
    void showAllStudent();
}