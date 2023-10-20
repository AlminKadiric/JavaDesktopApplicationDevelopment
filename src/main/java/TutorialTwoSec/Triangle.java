package TutorialTwoSec;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c  =scanner.nextInt();

        if (a == b && b==c ) {
            System.out.println("Every side has the same length");
        }else {
            System.out.println("No , they dont!!!!");
        }


    }
}
