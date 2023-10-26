package PracticeByDoing;

import java.util.Scanner;

public class DemoFive {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int stop = sc.nextInt();

        for (int i = start; i <= stop; i++) {
            if (i ==4 ) {
                System.out.print("FOUR ");
            } else if (i==8){
                System.out.println("EIGHT");
            }
            else{
                System.out.print(i + " ");
            }


        }
    }
}
