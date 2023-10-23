package Private_Buoi1;
import java.util.Scanner;
public class Baitap5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] n = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("So nguyen thu " + (i + 1) + ": ");
            n[i] = scanner.nextInt();
        }
        int max1 = n[0];
        int max2 = n[0];

        for (int i = 0; i < 5; i++) {
            if (n[i] > max1) {
                max2 = max1;
                max1 = n[i];
            } else if (n[i] > max2 && n[i] != max1) {
                max2 = n[i];
            }
        }
        System.out.println(max1 + " " + max2);
    }
}
