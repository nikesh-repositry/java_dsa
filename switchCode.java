package Conditional;
import java.util.Scanner;
public class switchCode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number from 1 to 7");
        int num = input.nextInt();
        String day;
        switch (num){
            case 1:day="monday"; break;
            case 2:day="tuesday"; break;
            case 3:day="wednesday"; break;
            case 4:day="thursday"; break;
            case 5:day="friday"; break;
            case 6:day="saturday"; break;
            case 7:day="sunday"; break;
            default:day="no from 1 to 7";
        }
        System.out.println(day);
    }
}
