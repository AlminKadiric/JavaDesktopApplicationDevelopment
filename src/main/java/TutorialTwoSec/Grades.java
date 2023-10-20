package TutorialTwoSec;

// 0-20 -> 5 -> YOu failed!
// 20-40 -> 4 -> You barely passed
//40-60 -> 3 -> Its good
//60-80 -> Its almost one , but its not
// 80-100 -> You are an excellent student!

import java.util.Scanner;

public class Grades {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int points = scanner.nextInt();

        if (points>=0 && points<=20){
            System.out.println("You failed!");
        }else if(points>20 && points<=40){
            System.out.println("You barely passed");
        }else if(points>40 && points<=60){
            System.out.println("Its good!");
        }
        else if(points>60 && points<=80){
            System.out.println("Its almost one , but its not");
        }else if(points>80 && points<=100){
            System.out.println("You are an excellent student");
        }else {
            System.out.println("You didnt write an exam!");
        }

    }
}
