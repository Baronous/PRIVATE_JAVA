package Private_Buoi1;
import java.util.Scanner ;
public class Baitap1 {
    public static int gcd(int a , int b)
    {
        while(b != 0)
        {
            int r = a % b ;
            a = b ;
            b = r ;
        }
        return a ;
    }
    public static int lcm(int a , int b)
    {
        return a / gcd(a , b) * b ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        System.out.println("\nNhap vao gia tri cua a: ");
        int a = sc.nextInt();

        System.out.println("\nNhap vao gia tri cua b: ");
        int b = sc.nextInt();

        System.out.println("\nNhap vao gia tri cua c: ");
        int c = sc.nextInt();

        while(a <= 0 || b <= 0 || c <= 0){
            System.out.println("\nNhap lai gia tri cua a: ");
            a = sc.nextInt();

            System.out.println("\nNhap lai gia tri cua b: ");
            b = sc.nextInt();

            System.out.println("\nNhap lai gia tri cua c: ");
            c = sc.nextInt();
        }

        System.out.println(lcm(lcm(a , b) , c) + " " + gcd(gcd(a , b) , c));

    }
}