package Private_Buoi4;

import java.util.Scanner;

public class Baitap2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int luachon;
        PhongMay phongMay = new PhongMay();

        do {
            System.out.println("----- Menu -----");
            System.out.println("1. Nhap thong tin phong may");
            System.out.println("2. Xuat thong tin phong may");
            System.out.println("3. Tim kiem thong tin kieu may");
            System.out.println("4. Tim kiem thong tin theo ma may");
            System.out.println("5. Thoat chuong trinh");
            System.out.print("Nhap vao lua chon cua ban (1-5): ");
            luachon = scanner.nextInt();

            switch (luachon) {
                case 1:
                    phongMay.Nhap();
                    break;
                case 2:
                    phongMay.Xuat();
                    break;
                case 3:
                    scanner.nextLine();
                    System.out.print("Nhap kieu may can tim: ");
                    String kieuMay = scanner.nextLine();
                    phongMay.timkiemKieuMay(kieuMay);
                    break;
                case 4:
                    System.out.print("Nhap ma may can tim: ");
                    int maMay = scanner.nextInt();
                    phongMay.timkiemMaMay(maMay);
                    break;
                case 5:
                    System.out.println("End the program, Hope to see you again.");
                    break;
                default:
                    System.out.println("Invalid Value, please nhap lai!.");
            }
        } while (luachon != 5);
    }
}