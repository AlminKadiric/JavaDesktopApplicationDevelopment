package Tutorial;

import package2.Customer;

import java.util.ArrayList;

public class ArrayDemo {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(12);
        arrayList.add(12);
        arrayList.add(14);
        arrayList.add(15);
        arrayList.add(9);
        arrayList.add(25);
        arrayList.add(14);
        arrayList.add(15);
        arrayList.add(9);


        for (Integer a :
                arrayList) {
            System.out.print(a + " ");

        }
        System.out.println("--------------------------");

        int[] numbersArray = new int[10]; // Create an array with a length of 10

        // Fill the array with numbers from 1 to 10
        for (int i = 1; i <= 10; i++) {
            numbersArray[i - 1] = i;
        }

        // Print the contents of the array
        for (int i = 0; i < numbersArray.length; i++) {
            System.out.print(numbersArray[i]);

            if (i < numbersArray.length - 1) {
                System.out.print(", ");
            }

        }

    }
}

