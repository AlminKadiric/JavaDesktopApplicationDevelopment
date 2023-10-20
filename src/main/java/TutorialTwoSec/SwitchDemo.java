package TutorialTwoSec;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int grades = scanner.nextInt();

        switch (grades){
            case 1:
                System.out.println("You got an One!");
                break;


            case 2:
                System.out.println("You got a two!");
                break;
            case 3:
                System.out.println("You got a three!");
                break;
            case 4:
                System.out.println("YOu got a four!");
                break;
            case 5:
                System.out.println("You got a five!");
                break;
            default:
                System.out.println("You didnt write an exam!!!");
        }

    }
}
