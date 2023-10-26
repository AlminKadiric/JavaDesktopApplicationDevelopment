package TutorialTwoSec;


// 380 Euros -> hundreds ? fifties ? twenties ? 3 , 1 , 1

import java.util.Scanner;

public class BakingDemo {

    public static void main(String[] args) {

        // 290 -> Hundreds:2 , fifties: 1 , twenties -> 2

        Scanner scanner = new Scanner(System.in);
        int money = scanner.nextInt();
        if (money/100>0){
            System.out.println("Hundreds: " + money/100);
            money=money%100; // 380 / 100 -> 3 ; money = 380 % 100 = 80;
        }if (money/50>0){
            System.out.println("Fifties " + money/50);
            money = money%50; // 80 % 50 = 30
        }
        if (money/20>0){
            System.out.println("Twenties " + money/20);
            money = money%20;

        }



    }
}
