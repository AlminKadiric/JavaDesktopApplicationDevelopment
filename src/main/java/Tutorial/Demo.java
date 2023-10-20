package Tutorial;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        switch (number){
            case 1:
                System.out.println("one");break;
            case 2:
                System.out.println("two");break;
            case 3:
                System.out.println("three");break;
            default:
                System.out.println("Its not any of them!!!!");

        }
    }
}
