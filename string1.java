import java.util.Scanner;
public class string1 {
    public static String charF(String input){
        int length = input.length();
        String output = "";
        char c;
        for (int i = 0; i < length; i++){
            c = input.charAt(i);
            if (c >= 65 && c <= 90){
                c += 32;
                output+=c;
            }
            else if (c >= 97 && c <= 122){
                c -= 32;
                output+=c;
            }
            else
                output+=c;
        }
        return output;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = sc.nextLine();
        System.out.println(charF(s));
    }
}
