package Private_Buoi4;
import java.util.Scanner;
class QuanLy {
    private String maQl;
    private String tenQL;

    public QuanLy() {

    }

    public QuanLy(String maQl, String tenQL) {
        this.maQl = maQl;
        this.tenQL = tenQL;
    }

    public String getMaQl() {
        return maQl;
    }

    public void setMaQl(String maQl) {
        this.maQl = maQl;
    }

    public String getTenQL() {
        return tenQL;
    }

    public void setTenQL(String tenQL) {
        this.tenQL = tenQL;
    }

    public void Nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ma quan li: ");
        maQl = scanner.nextLine();
        System.out.print("Nhap ten quan li: ");
        tenQL = scanner.nextLine();
    }

    public void Xuat() {
        System.out.println("Ma quan lí: " + maQl);
        System.out.println("Ten quan li: " + tenQL);
    }
}





