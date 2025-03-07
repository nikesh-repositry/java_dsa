package Conditional;
import java.util.Scanner;
public class greatestOfThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number a");
        int num1 = input.nextInt();
        System.out.println("enter the number b");
        int num2 = input.nextInt();
        System.out.println("enter the number c");
        int num3 = input.nextInt();
        if(num1>num2 && num1>num3){
            System.out.println(num1+"a is the greatest of three");
        }
        else if(num2>num1 && num2>num3){
            System.out.println(num2+"b is the greatest of three");
        }
        else{
            System.out.println(num3+"c is the greatest of three");
        }
    }
}
