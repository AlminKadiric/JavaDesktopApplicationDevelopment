package TutorialTwo;

import java.util.Scanner;

public class ThirdDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grade  = scanner.nextInt();
        switch (grade){
            case 1:

                System.out.println("You got a one!!!!");
                break;

            case 2:
                System.out.println("YOu got a two");
                break;
            case 3:
                System.out.println("You got a three");
                break;
            case 4:
                System.out.println("You got a four!!!");
                break;
            case 5:
                System.out.println("You got a five!");
                break;
            default:
                System.out.println("You didnt write an exam!!!");
        }
    }
}
