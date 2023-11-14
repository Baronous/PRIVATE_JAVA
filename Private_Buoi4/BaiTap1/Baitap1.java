package Private_Buoi4;

import java.util.Scanner;
public class Baitap1 {
    static Scanner scanner = new Scanner(System.in);
    static Sach[] mangSach = new Sach[1000];
    public static void main(String[] args) {
        int luachon;
        do{
            System.out.println("1.Nhap vao thong tin n cuon sach voi n nhap tu ban phim.");
            System.out.println("2.In ra man hinh thong tin cuon sach");
            System.out.println("3.Tim kiem sach theo ten");
            System.out.println("4.Sap xep lai cac cuon sach da nhap theo ten tac gia");
            System.out.println("5. Thoat chuong trinh");
            System.out.println("Nhap vao lua chon (1-5): ");
            luachon = scanner.nextInt();
            scanner.nextLine();

            switch(luachon){
                case 1:
                    nhapThongTinNSach();
                    break;
                case 2:
                    inThongTinSach();
                    break;
                case 3:
                    timKiemSachTheoTen();
                    break;
                case 4:
                    sapXepTheoTenTacGia();
                    break;
                case 5:
                    System.out.println("Thoat chuong trinh!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le, vui long nhap lai chua chon. ");
            }
        }while (luachon != 5);
    }

    public static void nhapThongTinNSach() {
        System.out.print("Nhap vao so luong sach: ");
        int soLuong = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < soLuong; i++) {
            System.out.println("Nhap vao thong tin cuon sách thu " + (i + 1) + ":");
            mangSach[i] = new Sach("", 0, "", new Tacgia("", 0));
            mangSach[i].input();
        }
    }

    public static void inThongTinSach() {
        System.out.println("Danh sách sách:");
        System.out.printf("%-5s %-20s %-15s %-15s %-20s %-15s %-15s\n", "ID", "TEN SACH", "NAM XUAT BAN", "THE LOAI", "TEN TAC GIA", "NAM SINH", "-------------------");

        for (int i = 0; i < Sach.count; i++) {
            Sach sach = mangSach[i];
            Tacgia tacgia = sach.getTacgia();
            System.out.printf("%-5d %-20s %-15d %-15s %-20s %-15d\n",
                    sach.getId(), sach.getTensach(), sach.getNamxuatban(), sach.getTheloai(),
                    tacgia.getTentacgia(), tacgia.getNamsinh());
        }
    }


    public static void timKiemSachTheoTen() {
        scanner.nextLine();
        System.out.print("Nhap vao ten sach can tim: ");
        String tenCanTim = scanner.nextLine();

        boolean timThay = false;
        for (int i = 0; i < Sach.count; i++) {
            if (mangSach[i].getTensach().contains(tenCanTim)) {
                mangSach[i].output();
                timThay = true;
            }
        }

        if (!timThay) {
            System.out.println("Khong tim thay quyen sach \"" + tenCanTim + "\"");
        }
    }

    public static void sapXepTheoTenTacGia() {
        for (int i = 0; i < Sach.count - 1; i++) {
            for (int j = i + 1; j < Sach.count; j++) {
                if (mangSach[i].getTacgia().getTentacgia().compareToIgnoreCase(mangSach[j].getTacgia().getTentacgia()) > 0) {
                    Sach temp = mangSach[i];
                    mangSach[i] = mangSach[j];
                    mangSach[j] = temp;
                }
            }
        }

        System.out.println("Done!");
    }

}
