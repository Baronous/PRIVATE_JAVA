package Private_Buoi1;
import java.util.Scanner;
public class Baitap4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nNhap vao so thu nhat: ");
        int a = scanner.nextInt();

        System.out.println("\nNhap vao so thu hai: ");
        int b = scanner.nextInt();

        System.out.println("\nNhap vao dau: ");
        char c = scanner.next().charAt(0);

        switch(c)
        {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                if(b == 0){
                    System.out.println("\nVo nghiem");
                }
                else
                {
                    System.out.println((double)(a / b));
                    break;
                }
            default:
                System.out.println("\nDau khong hop le");

        }
    }
}
