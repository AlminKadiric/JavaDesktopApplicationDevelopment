package TutorialTwo;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
    String text  =  "This is some text";
    char a = 'a';
    Integer numberIntOne = 10;
    Integer numberIntTwo=11;
    int numberOne = 11;
    int numberTwo = 10;

    double a1 = 10.0;
    Double DoubleOne = 10.0;
    double b2 =11.0;
    Double doubleTwo = 11.0;



        System.out.println( numberIntOne.compareTo(numberIntTwo));
        System.out.println();
        System.out.println(DoubleOne.compareTo(doubleTwo));

        for (int i = 0; i < text.length(); i++) {
            System.out.println(i);

        }




    }
}
