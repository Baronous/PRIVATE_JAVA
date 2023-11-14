package Private_Buoi4;

import java.util.Scanner;

public class PhongMay {
    private String maPhong;
    private String tenPhong;
    private QuanLy x;
    private May[] y;
    private int n;

    public PhongMay() {

    }

    public PhongMay(String maPhong, String tenPhong, QuanLy x, May[] y, int n) {
        this.maPhong = maPhong;
        this.tenPhong = tenPhong;
        this.x = x;
        this.y = y;
        this.n = n;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public QuanLy getX() {
        return x;
    }

    public void setX(QuanLy x) {
        this.x = x;
    }

    public May[] getY() {
        return y;
    }

    public void setY(May[] y) {
        this.y = y;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void Nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ma phong: ");
        maPhong = scanner.nextLine();
        System.out.print("Nhap ten phong: ");
        tenPhong = scanner.nextLine();

        x = new QuanLy();
        x.Nhap();

        System.out.print("Nhap so luong may tinh: ");
        n = scanner.nextInt();
        y = new May[n];
        for (int i = 0; i < n; i++) {
            y[i] = new May();
            System.out.println("Nhap vao thong tin may thu " + (i + 1) + ":");
            y[i].Nhap();
        }
    }

    public void Xuat() {
        System.out.println("THONG TIN PHONG MAY:");
        System.out.printf("%-20s%-40s%-20s%-20s%n", "Ma phong", "Ten phong", "Ma quan li", "Ten quan li");
        System.out.printf("%-20s%-40s%-20s%-20s%n", maPhong, tenPhong, x.getMaQl(), x.getTenQL());

        System.out.println("\nDANH SACH MAY TINH TRONG PHONG:");
        System.out.printf("%-10s%-15s%-20s%-20s%n", "STT", "Ma may", "Kieu may", "Tinh trang");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-10d%-15d%-20s%-20s%n", i + 1, y[i].getMaMay(), y[i].getKieuMay(), y[i].getTinhTrang());
        }
    }


    public void timkiemKieuMay(String kieuMay) {
        for (int i = 0; i < n; i++) {
            if (y[i].getKieuMay().equalsIgnoreCase(kieuMay)) {
                System.out.println("Thong tin may " + kieuMay + ":");
                y[i].Xuat();
            }
        }
    }

    public void timkiemMaMay(int maMay) {
        for (int i = 0; i < n; i++) {
            if (y[i].getMaMay() == maMay) {
                System.out.println("Thong tin may tinh co ma " + maMay + ":");
                y[i].Xuat();
            }
        }
    }
}