package Private_Buoi2;
import java.util.Scanner;
public class Baitap1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap vao so luong phan tu trong mang: ");
        int n = scanner.nextInt();
        while(n <= 0 || n>10000){
            System.out.println("Gia tri khong hop le, vui long nhap lai!");
            n = scanner.nextInt();
        }
        int[] array = new int[n];

        for(int i = 0 ; i < n; i++){
            System.out.println("Nhap vao phan tu thu " + ( i + 1 ) + ": ");
            array[i] = scanner.nextInt();
            if (array[i] < 0) {
                System.out.println("Gia tri khong hop le, vui long nhap lai: ");
                array[i] = scanner.nextInt();
            }
        }
        int dem = 0;
        int maxcount = array[0];
        for(int i = 0; i < n;i++){
            int count = 0;
            for(int j = 0; j < n;j++){
                if(array[i] == array[j]){
                    count++;
                }
            }
            if(count > dem  || (count == dem && array[i] < maxcount)){
                dem = count;
                maxcount = array[i];
            }
        }
        System.out.println(maxcount + " " + dem);

    }
}
