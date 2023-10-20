package Tutorial;

import java.util.Scanner;

public class ExerciseOne {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int money = scanner.nextInt();

            //TODO: put your code here
            if(money % 5 != 0)
                System.out.println("Cannot be processed!");
            else{
                if (money/100 > 0){
                    System.out.println("100 Euro: "+money/100);
                    money = money%100;
                }
                if (money/50 > 0){
                    System.out.println("50 Euro: "+money/50);
                    money = money%50;
                }
                if (money/20 > 0){
                    System.out.println("20 Euro: "+money/20);
                    money = money%20;
                }
                if (money/10 > 0){
                    System.out.println("10 Euro: "+money/10);
                    money = money%10;
                }
                if (money/5 > 0)
                    System.out.println("5 Euro: "+money/5);
            }
        }
    }


