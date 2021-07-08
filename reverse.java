import java.util.Scanner;
public class reverse {
    public static String rev(String input){
        String output = "";
        for (int i = (input.length()-1); i >= 0; i--) output = output + input.charAt(i);
        return output;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String in = sc.nextLine();
        System.out.println("The reverse is: "+ rev(in));
    }
}
