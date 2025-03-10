package Conditional;
import java.util.Scanner;
public class countDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the digit");
        int num = input.nextInt();
        int count = 1;
        while(num/10!=0){
            num=num/10;
            count++;
        }
        System.out.println("count is"+" "+count);
    }
}