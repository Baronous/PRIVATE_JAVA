package Private_Buoi4;
import java.util.Scanner;
public class Sach {
    static int count = 0;
    private int Id;
    private String Tensach;
    private int Namxuatban;
    private String Theloai;
    private Tacgia x;
    private Scanner scanner = new Scanner(System.in);


    public Sach(){

    }

    public Sach(String tensach, int namxuatban, String theloai, Tacgia tacgia){
        count++;
        this.Id = count;
        this.Tensach = tensach;
        this.Namxuatban = namxuatban;
        this.Theloai = theloai;
        this.x = tacgia;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTensach() {
        return Tensach;
    }

    public void setTensach(String tensach) {
        Tensach = tensach;
    }

    public int getNamxuatban() {
        return Namxuatban;
    }

    public void setNamxuatban(int namxuatban) {
        Namxuatban = namxuatban;
    }

    public Tacgia getX() {
        return x;
    }

    public void setX(Tacgia x) {
        this.x = x;
    }

    public String getTheloai(){
        return Theloai;
    }

    public void setTheloai(String theloai){
        this.Theloai = theloai;
    }

    public Tacgia getTacgia(){
        return x;
    }

    public void setTacgia(Tacgia tacgia){
        this.x = tacgia;
    }

    public void input(){
        System.out.println("\n");
        System.out.println("NHAP VAO THONG TIN SACH: ");

        System.out.println("Nhap vao ten cua sach: ");
        Tensach = scanner.nextLine();

        System.out.println("Nhap vao nam xuat ban sach: ");
        Namxuatban = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Nhap vao the loai cua sach: ");
        Theloai = scanner.nextLine();

        System.out.println("\n");
        System.out.println("NHAP VAO THONG TIN TAC GIA: ");
        Tacgia tacgia = new Tacgia("", 0);
        tacgia.input();
        setTacgia(tacgia);


    }

    public void output(){
        System.out.println("ID: " + getId());
        System.out.println("Ten sach: " + getTensach());
        System.out.println("Nam xuat ban: " + getNamxuatban());
        System.out.println("The loai: " + getTheloai());
        System.out.println("Thong tin tac gia: ");
        getTacgia().output();
        System.out.println("-----------------------------------");
    }

}
