package Private_Buoi1;
import java.util.Scanner;
public class Baitap3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        int product = 1;
        while( a != 0){
            product *= a % 10;
            a /= 10;
        }
        System.out.println(product);
    }
}
