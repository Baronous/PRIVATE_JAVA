package Private_Buoi4;
import java.util.Scanner;
public class Tacgia {
    private String Tentacgia;
    private int Namsinh;
    private Scanner scanner = new Scanner(System.in);

    public Tacgia() {

    }

    public Tacgia(String tentacgia, int namsinh) {
        this.Tentacgia = tentacgia;
        this.Namsinh = namsinh;
    }

    public String getTentacgia() {
        return Tentacgia;
    }

    public void setTentacgia(String tentacgia) {
        this.Tentacgia = tentacgia;
    }

    public int getNamsinh() {
        return Namsinh;
    }

    public void setNamsinh(int namsinh) {
        Namsinh = namsinh;
    }
    public void input(){
        System.out.println("Nhap vao ten giac gia: ");
        Tentacgia = scanner.nextLine();

        System.out.println("Nhap vao nam sinh cua tac gia: ");
        Namsinh = scanner.nextInt();
    }

    public void output(){
        System.out.println("Ten tac gia: " + getTentacgia());
        System.out.println("Nam sinh tac gia: " + getNamsinh());
    }
}
