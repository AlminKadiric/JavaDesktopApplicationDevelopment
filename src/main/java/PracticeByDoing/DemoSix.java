package PracticeByDoing;

import java.util.Scanner;

public class DemoSix {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number= sc.nextInt();
        if(number==0){
            System.out.print("\n");
            System.out.print(0);
        }
        else {

            for(int i=1;i<=number;i++){
                System.out.print(i + " ");

            }
            System.out.print("\n");
            for(int i = -number;i<=number;i++){

                System.out.print(i + " ");
            }




            //TODO: put your code here

        }

    }
}
