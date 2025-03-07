package Conditional;
import java.util.Scanner;
public class checkThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(
                "enter the number:");
//        int num = Integer.parseInt(input.nextLine());  also used for conversion
        int num = input.nextInt();
        String myString = String.valueOf(num);
        if(myString.length()==3){
            System.out.println("three digit number");
        }
        else{
            System.out.println("not a three digit number");
        }
    }
}
