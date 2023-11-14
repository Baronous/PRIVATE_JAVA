package Private_Buoi4;

import java.util.Scanner;

public class May {
    private int maMay;
    private String kieuMay;
    private String tinhTrang;

    public May() {}

    public May(int maMay, String kieuMay, String tinhTrang) {
        this.maMay = maMay;
        this.kieuMay = kieuMay;
        this.tinhTrang = tinhTrang;
    }

    public int getMaMay() {
        return maMay;
    }

    public void setMaMay(int maMay) {
        this.maMay = maMay;
    }

    public String getKieuMay() {
        return kieuMay;
    }

    public void setKieuMay(String kieuMay) {
        this.kieuMay = kieuMay;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public void Nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n");
        System.out.print("Nhap ma may: ");
        maMay = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhap vao kieu may:  ");
        kieuMay = scanner.nextLine();
        System.out.print("Nhap tinh trang may: ");
        tinhTrang = scanner.nextLine();
    }

    public void Xuat() {
        System.out.println("\n");
        System.out.println("Ma may: " + maMay);
        System.out.println("Kieu may: " + kieuMay);
        System.out.println("Tinh trang may: " + tinhTrang);
        System.out.println("\n");
    }
}
