package Conditional;
//find out the sum of like if input is 9874 then sum should be like 9874+987+98+9
import java.util.Scanner;
public class numDigitSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number:  ");
        int num = input.nextInt();
        int mun = num;
//        int rem = num%10;
//        System.out.println(5555/10);    //555
//        System.out.println(5555%10);    //5
        int sum = 0;
        while(num>0){
            sum = sum+(num/10);
//            System.out.println(sum);
            num=num/10;
        }
        System.out.println("the sum of the digits is"+" "+(sum+mun));
    }
}
