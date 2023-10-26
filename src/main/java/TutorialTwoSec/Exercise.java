package TutorialTwoSec;

import java.util.Scanner;

import java.util.Scanner;

public class Exercise {

    public static void main(String[] args) {
        double a;
        double b;
        double c;

        Scanner scanner = new Scanner(System.in);
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();



            if((a<=0 || b<=0 || c<=0 )  || (a+b<c || b+c<a || b+c<a)) {
                System.out.println("No triangle!");

            }
            else {
                if(a * a + b * b == c * c || a * a + c * c==b * b || b * b + c * c ==a*a) {
                    System.out.println("The three sides form a right triangle!");
                }
                if(a == b && b == c ) {
                    System.out.println("The three sides form an isosceles triangle!");
                }
                if(a == b || b == c || c==a) {
                    System.out.println("The three sides form an equilateral triangle!");
                }

            }

        // Put your code here

    }

}