package Private_Buoi3;
import java.util.Scanner;
public class Main_Bai2 {
    static Subject[] subjects = new Subject[100];
    static int subjectCount = 0;
    static Scanner scanner = new Scanner(System.in);

    //HIEN THI MENU LUA CHON
    public static void showMenu() {
        System.out.println("1. Nhap 1 tiet hoc moi");
        System.out.println("2. Hien thi danh sach tiet hoc");
        System.out.println("3. Sap xep mon theo thu tu thoi gian ket thuc tang dan");
        System.out.println("4. Lua chon mon hoc");
        System.out.println("5. Thoat");
        System.out.print("Vui long nhap chuc nang: ");
    }

    //THEM MON HOC MOI
    public static void addNewSubject() {
        System.out.println("Nhap thong tin tiet hoc moi:");
        System.out.print("ID: ");
        String id = scanner.nextLine();

        System.out.print("Nhap ten mon: ");
        String subjectName = scanner.nextLine();

        System.out.print("So luong sinh vien: ");
        int studentCount = Integer.parseInt(scanner.nextLine());

        System.out.print("Thoi gian bat dau (gio : phut): ");
        String timeStart = scanner.nextLine();

        System.out.print("Thoi gian ket thuc (gio : phut): ");
        String timeEnd = scanner.nextLine();

        subjects[subjectCount] = new Subject(id, subjectName, studentCount, timeStart, timeEnd);
        subjectCount++;
        System.out.println("Da them mon hoc moi");
    }
    //HIEN THI DANH SACH MON HOC
    public static void displaySubjects() {
        System.out.println("\n");
        System.out.println("Danh sach tiet hoc:");
        System.out.printf("%-10s %-20s %-15s %-20s\n", "ID", "Subject Name", "Student Count", "Time Start - End");
        for (int i = 0; i < subjectCount; i++) {
            System.out.printf("%-10s %-20s %-15s %-20s\n", subjects[i].getId(), subjects[i].getSubjectName(),
                    subjects[i].getStudentCount(), subjects[i].getTimeStart() + " - " + subjects[i].getTimeEnd());
        }
        System.out.println("\n");
    }

    public static void sortEndTime() {
        for (int i = 0; i < subjectCount - 1; i++) {
            for (int j = i + 1; j < subjectCount; j++) {
                if (compareTime(subjects[i].getTimeEnd(), subjects[j].getTimeEnd()) > 0) {
                    Subject temp = subjects[i];
                    subjects[i] = subjects[j];
                    subjects[j] = temp;
                }
            }
        }

        System.out.println("Hien thi danh sach theo thu tu tang dan");
        displaySubjects();
    }

    public static void selectInTime() {
        System.out.print("Nhap thoi gian bat dau (gio : phut): ");
        String startTime = scanner.nextLine();
        System.out.print("Nhap thoi gian ket thuc (gio : phut) ");
        String endTime = scanner.nextLine();

        System.out.println("Cac mon trong khoang thoi gian " + startTime + " - " + endTime + ":");
        for (int i = 0; i < subjectCount; i++) {
            if (compareTime(startTime, subjects[i].getTimeStart()) <= 0 && compareTime(endTime, subjects[i].getTimeEnd()) >= 0) {
                System.out.println(subjects[i].getId() + ", " + subjects[i].getSubjectName() + ", " + subjects[i].getStudentCount()
                        + ", " + subjects[i].getTimeStart() + " - " + subjects[i].getTimeEnd());
            }
        }
    }

    public static int compareTime(String time1, String time2) {
        String[] parts1 = time1.split(":");
        String[] parts2 = time2.split(":");
        int hour1 = Integer.parseInt(parts1[0]);
        int minute1 = Integer.parseInt(parts1[1]);
        int hour2 = Integer.parseInt(parts2[0]);
        int minute2 = Integer.parseInt(parts2[1]);

        if (hour1 != hour2) {
            return hour1 - hour2;
        } else {
            return minute1 - minute2;
        }
    }
    public static void main(String[] args) {
        int luachon;
        do {
            showMenu();
            luachon = Integer.parseInt(scanner.nextLine());
            switch (luachon) {
                case 1:
                    addNewSubject();
                    break;
                case 2:
                    displaySubjects();
                    break;
                case 3:
                    sortEndTime();
                    break;
                case 4:
                    selectInTime();
                    break;
                case 5:
                    System.out.println("Exiting the menu. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please select again.");
            }
        } while (luachon != 5);
    }
}