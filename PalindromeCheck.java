package dsa;
import java.util.Scanner;
public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER ::");
        String palin = input.nextLine();
        String reversedPalin = new StringBuilder(palin).reverse().toString();
        if(palin.equals(reversedPalin)){
            System.out.println("ENTERED NUMBER IS A PALINDROME");
        }
        else{
            System.out.println("NOT A PALINDROME");
        }
    }
}
