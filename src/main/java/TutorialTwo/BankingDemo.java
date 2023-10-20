package TutorialTwo;

import java.util.Scanner;
// 360 -> 100

public class BankingDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      int money = scanner.nextInt();


      if(money/100> 0){
          System.out.println("Hundreds: " + money/100);
          money=money%100;
      }
      if(money/50>0){
          System.out.println("Fifties " + money/50);
          money=money%50;
      }
      if(money/20>0){
          System.out.println("Twenties "+ money/20);
          money=money%20;



      }



    }
}
