//this is the program to count the digit of the entered number
package Conditional;
import java.util.Scanner;
public class countDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the digit");
        long num = input.nextLong();
        int count = 1;
        while(num/10!=0){
            num=num/10;
            count++;
        }
        System.out.println("count is"+" "+count);
    }
}
//if you need to work with more 20 digit than you have to use bigInterger
