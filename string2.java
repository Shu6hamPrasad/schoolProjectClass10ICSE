import java.util.Scanner;
public class string2 {
    public static String rev(String input){
        String output = "";
        for (int l = (input.length() - 1); l >= 0; l--){
            output += input.charAt(l);
        }
        return output;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String in = sc.nextLine();
        System.out.println(rev(in));
    }
}
