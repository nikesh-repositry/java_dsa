package Conditional;
import java.util.Scanner;
public class leapyear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the year");
        int yr = input.nextInt();
        if(yr%4==0){
            System.out.println("the entered year is leap year");
        }
        else{
            System.out.println("not a leap year");
        }
    }
}
