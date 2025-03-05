package Conditional;
import java.util.Scanner;
//print the absolute value means modulus of the integer
public class absoluteValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the num");
        float num = input.nextFloat();
        if(num>=0){
            System.out.println("the absolute value is "+num);
        }
        else{
            float num2 = num*2;
            float num3 = num - num2;
            System.out.println("the absolute value is "+num3);

        }
    }
}
