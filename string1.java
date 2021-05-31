import java.util.Scanner;
public class string1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String input = sc.nextLine();
        int length = input.length();
        for (int i = 0; i < length; i++){
            char c = input.charAt(i);
            if (c >= 65 && c <= 90){
                c += 32;
                System.out.print(c);
            }
            else if (c >= 97 && c <= 122){
                c -= 32;
                System.out.print(c);
            }
            else
                System.out.print(c);
        }
    }
}
