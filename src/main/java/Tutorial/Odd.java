package Tutorial;

import java.util.Scanner;

public class Odd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();


        if(numberOne % 2 != 0){
            System.out.println("Odd!");
        } else {
            System.out.println("even");
        }
    }
}
