package Private_Buoi1;
import java.util.Scanner;
public class Baitap2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int b = scanner.nextInt();

        String str = "";

        while(n != 0){
            int a = n % b;
            if(a < 10){
                str = n % b + str;
            }
            else
            {
                char x = (char)(a + 55);
                str = x + str;
            }
            n/=b;
        }
        System.out.println(str);
    }
}
