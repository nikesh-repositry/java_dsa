package Conditional;
import java.util.Scanner;
public class findRaise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter base number ");
        int num1 = input.nextInt();
        System.out.println("enter raise number ");
        int num2 = input.nextInt();
        int pow = 1;
        for(int i=1;i<=num2;i++){
            pow = num1*pow;
        }
        System.out.println("answer is "+pow);
    }
}
