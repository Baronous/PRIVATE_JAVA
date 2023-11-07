package Private_Buoi3;
import java.util.Scanner;
public class Main_Bai1 {

    //HUHUHU <(.)>U<(.)>
    //-------------------
    private static Scanner scanner = new Scanner(System.in);
    public static Baitap1[] vegetables = new Baitap1[100];

    private static int vegetablecount = 0;

    public static void addVegetable() {
        System.out.print("Nhap ID: ");
        String id = scanner.nextLine();

        System.out.print("Nhap ten: ");
        String name = scanner.nextLine();

        System.out.print("Nhap don vi tinh: ");
        String unit = scanner.nextLine();

        System.out.print("Nhap so luong da ban: ");
        int quantitySold = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nhap phan tram giam gia: ");
        int sale = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nhap gia: ");
        double price = scanner.nextDouble();
        scanner.nextLine();

        vegetables[vegetablecount] = new Baitap1(id, name, unit, quantitySold, sale, price);
        vegetablecount++;
    }
    private static void displayAllVegetables() {
        System.out.printf("%-10s%-20s%-10s%-15s%-10s%-10s%-15s\n", "ID", "Name", "Unit", "QuantitySold", "Sale", "Price", "Revenue");
        for (int i = 0; i < vegetablecount; i++) {
            vegetables[i].display();
        }
    }
    private static void sortVegetablesByRevenue() {
        for (int i = 0; i < vegetablecount - 1; i++) {
            for (int j = i + 1; j < vegetablecount; j++) {
                if (vegetables[i].getTotalRevenue() > vegetables[j].getTotalRevenue()) {
                    Baitap1 temp = vegetables[i];
                    vegetables[i] = vegetables[j];
                    vegetables[j] = temp;
                }
            }
        }
        displayAllVegetables();
    }
    private static void groupVegetablesByUnit() {
        for (int i = 0; i < vegetablecount - 1; i++) {
            for (int j = i + 1; j < vegetablecount; j++) {
                if (vegetables[i].getUnit().compareTo(vegetables[j].getUnit()) > 0) {
                    Baitap1 temp = vegetables[i];
                    vegetables[i] = vegetables[j];
                    vegetables[j] = temp;
                }
            }
        }
        displayAllVegetables();
    }
    private static void searchVegetablesByName() {
        System.out.print("Nhập tên cần tìm: ");
        String searchName = scanner.nextLine();

        for (int i = 0; i < vegetablecount; i++) {
            if (vegetables[i].getName().contains(searchName)) {
                vegetables[i].display();
            }
        }
    }
    public static void main(String[] args) {
        int luachon;
        do{
            System.out.println("1. Nhap loai rau cu moi");
            System.out.println("2. Hien thi danh sach rau cu");
            System.out.println("3. Sap xep cac loai rau cu theo thu tu so tien thu duoc tang dan");
            System.out.println("4. Nhom cac loai rau cu theo don vi tinh");
            System.out.println("5. Tim kiem rau cu theo ten");
            System.out.println("6. Thoat menu");
            System.out.print("Nhap vao lua chon cua ban: ");
            luachon = scanner.nextInt();
            scanner.nextLine();

            switch(luachon){
                case 1:
                    addVegetable();
                    break;
                case 2:
                    displayAllVegetables();
                    break;
                case 3:
                    sortVegetablesByRevenue();
                    break;
                case 4:
                    groupVegetablesByUnit();
                    break;
                case 5:
                    searchVegetablesByName();
                    break;
                case 6:
                    System.out.println("Thoat chuong trinh!!!!!");
                    break;
                default:
                    System.out.println("Gia tri khong hop le, vui long nhap lai!!!!!!!!!!");
            }
        }while(luachon != 6);
    }
}
