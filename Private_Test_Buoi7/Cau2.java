package Private_Test_Buoi7;
import java.util.List;
import java.util.Scanner;

public class Cau2 {

    public static void main(String[] args) {
        StudentService studentService = new StudentServiceImpl();
        Scanner scanner = new Scanner(System.in);

        int luachon;
        do {
            System.out.println("----- MENU -----");
            System.out.println("1. Them sinh vien");
            System.out.println("2. Xoa sinh vien theo ID");
            System.out.println("3. Tim sinh vien theo ten");
            System.out.println("4. Sap xep danh sach sinh vien theo diem");
            System.out.println("5. Hien thi danh sach sinh vien");
            System.out.println("0. Thoat");
            System.out.print("Vui long chon(0-5): ");
            luachon = scanner.nextInt();
            scanner.nextLine();

            switch (luachon) {
                case 1:
                    addStudent(studentService, scanner);
                    break;
                case 2:
                    deleteStudent(studentService, scanner);
                    break;
                case 3:
                    searchStudent(studentService, scanner);
                    break;
                case 4:
                    showSortedStudent(studentService);
                    break;
                case 5:
                    showAllStudent(studentService);
                    break;
                case 0:
                    System.out.println("END!");
                    break;
                default:
                    System.out.println("INVALID FUNCTION, PLEASE INPUT AGAIN");
            }
        } while (luachon != 0);
    }

    public static void addStudent(StudentService studentService, Scanner scanner) {
        System.out.print("Nhap ten sinh vien: ");
        String name = scanner.nextLine();
        System.out.print("Nhap tuoi sinh vien: ");
        short age = scanner.nextShort();
        scanner.nextLine();

        System.out.print("Nhap dia chi huyen: ");
        String district = scanner.nextLine();
        System.out.print("Thanh pho: ");
        String city = scanner.nextLine();
        Address address = new Address(district, city);

        System.out.print("Nhap diem sinh vien: ");
        double score = scanner.nextDouble();

        Student student = new Student(name, age, address, score);
        studentService.addStudent(student);
    }

    public static void deleteStudent(StudentService studentService, Scanner scanner) {
        System.out.print("Nhap ID sinh vien can xoa: ");
        int id = scanner.nextInt();
        studentService.deleteStudent(id);
    }

    public static void searchStudent(StudentService studentService, Scanner scanner) {
        System.out.print("Nhap ten sinh vien can tim: ");
        String name = scanner.nextLine();
        List<Student> searchResult = studentService.searchStudent(name);

        if (searchResult.isEmpty()) {
            System.out.println("Can't find '" + name + "'");
        } else {
            System.out.println("Result:");
            for (Student student : searchResult) {
                System.out.println(student);
            }
        }
    }

    public static void showSortedStudent(StudentService studentService) {
        List<Student> sortedList = studentService.sortedStudent();

        if (sortedList.isEmpty()) {
            System.out.println("Khong co sinh vien trong danh sach.");
        } else {
            System.out.println("Danh sach sap xep giam dan:");
            for (Student student : sortedList) {
                System.out.println(student);
            }
        }
    }

    public static void showAllStudent(StudentService studentService) {
        studentService.showAllStudent();
    }
}

