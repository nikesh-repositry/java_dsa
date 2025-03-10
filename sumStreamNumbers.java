package Conditional;
import java.util.Scanner;
public class sumStreamNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter 0 to stop input");
        System.out.println("enter the number  ");
        float num = input.nextFloat();
        int sum = 0;
        while(num!=0){
            sum+=num;
            num = input.nextFloat();
//            System.out.println("enter the number ");
        }
        System.out.println("the sum is"+" "+sum);
    }
}
