package Conditional;
import java.util.Scanner;
public class ternaryOpr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number: ");
        int num = input.nextInt();
        String mer = (num%2==0?"even":"odd");                 //method one
        System.out.println("the enter number is "+mer);

//        System.out.println((num%2==0?"even":"odd"));          //method two
    }
}
