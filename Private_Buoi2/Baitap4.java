package Private_Buoi2;
import java.util.Scanner;
public class Baitap4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        str = str.toLowerCase();

        boolean[] mark = new boolean[26];//KHOI TAO MANG DAI 26 KI TU -> 26 CHU CAI

        for(int i = 0; i < str.length();i++){
            char c = str.charAt(i);
            if(c >= 'a' && c <= 'z'){
                mark[c - 'a'] = true;
            }
        }

        boolean Yes = true;
        for(int i = 0; i < 25; i++){
            if(!mark[i]){
                Yes = false;
                break;
            }
        }
        if(Yes){
            System.out.println("YES\n");
        }
        else
        {
            System.out.println("NO\n");
        }

    }
}
