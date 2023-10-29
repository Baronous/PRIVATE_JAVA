package Private_Buoi2;
import java.util.Scanner;

public class Baitap2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //NHAP GIA TRI CUA n
        System.out.print("Nhap vao gia tri cua n: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        //NHAP VAO GIA TRI CUA TUNG PHAN TU TRONG MANG
        for(int i = 0; i < n; i++){
            System.out.print("\nNhap vao phan tu thu " + (i+1) + ": ");
            array[i] = scanner.nextInt();
        }
        //XUAT CAC PHAN TU TRONG MANG
        for(int i = 0; i < n; i++){
            System.out.print(array[i] + " ");
        }
        //NHAP VAO SO LUONG CAN TRUY VAN
        System.out.print("Nhap vao so luong can truy van: ");
        int soluongphantu = scanner.nextInt();

        while(soluongphantu-- > 0){
            //NHAP VAO GIA TRI CUA L VA R
            System.out.print("Nhap vao vi tri L: ");
            int L = scanner.nextInt();
            System.out.print("Nhap vao vi tri R: ");
            int R = scanner.nextInt();

            int sum = 0;
            for(int i = L - 1; i < R; i++){
                sum += array[i];
            }
            System.out.println( "Tong = " + sum);
        }
    }
}
