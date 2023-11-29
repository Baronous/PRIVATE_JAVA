package Private_Test_Buoi7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class StudentServiceImpl implements StudentService {
    private List<Student> studentList;

    public StudentServiceImpl() {
        this.studentList = new ArrayList<>();
    }

    @Override
    public void addStudent(Student student) {
        studentList.add(student);
        System.out.println("Them thanh cong");
    }

    @Override
    public void deleteStudent(int id) {
        for (Student student : studentList) {
            if (student.getId() == id) {
                studentList.remove(student);
                System.out.println("Xoa thanh cong");
                return;
            }
        }
        System.out.println("Khong tim thay: " + id);
    }

    @Override
    public List<Student> searchStudent(String name) {
        List<Student> result = new ArrayList<>();
        for (Student student : studentList) {
            if (student.getName().contains(name)) {
                result.add(student);
            }
        }
        return result;
    }

    @Override
    public List<Student> sortedStudent() {
        List<Student> sortedList = new ArrayList<>(studentList);
        Collections.sort(sortedList, (s1, s2) -> Double.compare(s2.getScore(), s1.getScore()));
        return sortedList;
    }

    @Override
    public void showAllStudent() {
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}
