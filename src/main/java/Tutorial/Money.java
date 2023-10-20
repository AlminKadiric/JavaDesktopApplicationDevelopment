package Tutorial;

import java.util.Scanner;

public class Money {

        public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                int money = scanner.nextInt();
                int stotine = 0;
                int pedeset = 0;
                int dvadeset = 0;
                int deset = 0;
                int pet = 0;

                int i = 1;
                while (i > 0) {
                    while (money >= 100) {
                        stotine++;
                        money = money - 100;
                    }
                    while (money >= 50) {
                        pedeset++;
                        money = money - 50;
                    }
                    while (money >= 20) {
                        dvadeset++;
                        money = money - 20;
                    }
                    while (money >= 10) {
                        deset++;
                        money = money - 10;
                    }
                    while (money >= 5) {
                        pet++;
                        money = money - 5;
                    }
                    if (money == 0) {
                        i = -1; // -1 jednako uspjeli smo svest money na 0
                    } else if (money > 0) {
                        i = -2;
                    } //-2 jednako da ima ostatka (greska)
                }
                if (i == -1) {
                    if (stotine > 0) {
                        System.out.println("100 Euro: " + stotine);
                    }
                    if (pedeset > 0) {
                        System.out.println("50 Euro: " + pedeset);
                    }
                    if (dvadeset > 0) {
                        System.out.println("20 Euro: " + dvadeset);
                    }
                    if (deset > 0) {
                        System.out.println("10 Euro: " + deset);
                    }
                    if (pet > 0) {
                        System.out.println("5 Euro: " + pet);
                    }
                } else if (i == -2) {
                    System.out.println("Cannot be processed!");
                }
            }
}
