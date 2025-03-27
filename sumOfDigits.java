//find the sum of each digit of a given number
package Conditional;
import java.util.Scanner;
public class sumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("enter the integer");
        int num= input.nextInt();
        int sum = 0;
        while(num>0){
            sum = sum+(num%10);
            num = num/10;
        }
        System.out.printf("the sum is "+sum);
    }
}
