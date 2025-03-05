package Conditional;
import java.util.Scanner;
public class grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("enter you grade");
        float num = input.nextFloat();
        if(num>100){
            System.out.println("score can not be greater than 100");
        }
        else if(num>=90 && num<100){
            System.out.println("excellent");
        }
        else if(num>=80 && num<90){
            System.out.println("good");
        }
        else if(num>=60 && num<70){
            System.out.println("not bad");
        }
        else if(num>=70 && num<80){
            System.out.println("work more");
        }
        else if(num>=50 && num<60){
            System.out.println("bad");
        }
        else{
            System.out.println("very bad");
        }
    }
}
