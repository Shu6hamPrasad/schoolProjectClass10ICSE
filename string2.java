import java.util.Scanner;

public class string2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a lowercase String: ");
        String s1 = sc.nextLine();
        String s2 = new String(s1.toUpperCase());
        System.out.println("The uppercase is: ");
        System.out.println(s2);
    }
}
