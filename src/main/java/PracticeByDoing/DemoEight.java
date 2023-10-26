package PracticeByDoing;

import java.util.Scanner;

public class DemoEight {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number= sc.nextInt();
        int i=number;
        if(number==0){
            System.out.print("\n");
            System.out.println(0);
        }
        else {
            while(i>0){
                System.out.print(i + " ");
                i--;

            }
            System.out.print("\n");
            i=-number;

            while(i<=number ){

                System.out.print(i + " ");
                i++;
            }
        }
    }
}
