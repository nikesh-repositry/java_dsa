package Conditional;
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number ");
        int num = input.nextInt();
        int fact = 1;
        while(num>0){
            fact = fact*num;
            num -= 1;
        }
        System.out.println("the factorial is "+fact);
    }
}
