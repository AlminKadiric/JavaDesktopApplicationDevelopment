package TutorialTwo;

// The grade points:
// 0-20 -> 5  -> u didnt pass
// 20-40 -> 4 -> u have a four
// 40-60 -> 3 -> its three
// 60-80 -> 2 -> its almost one!
// 80 - 100 -> 1 -> u are excellent


import java.util.Scanner;

public class SecondDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int points = scanner.nextInt();

        if(points >= 0 && points <=20){
            System.out.println("You didnt pass! ");

        }
        else if(points>20 && points<=40){
            System.out.println("You got a four!!!!");
        }
        else if(points>40 && points<=60){
            System.out.println("You got a Three!!!");

        }
        else if(points>60 && points<=80){
            System.out.println("You had almost a one , but its two!!!");
        }else if(points>80 && points<=100){
            System.out.println("You are excellent student!");
        }
        else
        {
            System.out.println("You didnt write an exam!");
        }

    }
}
