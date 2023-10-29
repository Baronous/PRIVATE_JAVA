package Private_Buoi2;
import java.util.Scanner;
public class Baitap3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //NHAP VAO XAU
        String array = scanner.nextLine();
        int letter = 0;
        int number = 0;
        int special = 0;
        for(int i = 0; i < array.length();i++){
            char ch = array.charAt(i);
            if(Character.isLetter(ch)){
                letter++;
            }
            else if(Character.isDigit(ch)){
                number++;
            }
            else {
                special++;
            }
        }
        System.out.println(letter + " " + number + " " + special);
    }
}
