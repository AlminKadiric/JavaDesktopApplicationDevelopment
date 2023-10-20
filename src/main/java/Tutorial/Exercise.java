package Tutorial;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b=sc.nextInt();
        int c = sc.nextInt();

        if((a<=0 || b<=0 || c<=0 )  || (a+b<c || b+c<a || b+c<a)) {
            System.out.println("Kein Dreieck!");

        }
        else {
            if(a * a + b * b == c * c || a * a + c * c==b * b || b * b + c * c ==a*a) {
                System.out.println("Die drei Seiten bilden ein rechtwinkliges Dreieck!");
            }
            if(a == b && b == c ) {
                System.out.println("Die drei Seiten bilden ein gleichseitiges Dreieck!");
            }
            if(a == b || b == c || c==a) {
                System.out.println("Die drei Seiten bilden ein gleichschenkliges Dreieck!");
            }

        }

        // TODO Put your code here

    }
}
