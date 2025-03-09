package Conditional;
import java.util.Scanner;
public class switchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter any planet name in solar system: ");
        String name = input.nextLine();
        String planet;
        switch (name){
            case "mercury":
                System.out.println("1st one");
                break;
            case "venus":
                System.out.println("2nd one");
                break;
            case "mars":
                System.out.println("3rd one");
                break;
            case "earth":
                System.out.println("4th one");
                break;
            case "saturn":
                planet="5th one";
                break;
            case "jupiter":
                planet="6th one";
                break;
            case "uranus":
                planet="7th one";
                break;
            case "neptune":
                planet="8th one";
                break;
            default:
                System.out.println("spell correctly and valid planet");
        }
    }
}
