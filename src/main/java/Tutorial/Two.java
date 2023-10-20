package Tutorial;

public class Two {

    public static void main(String[] args) {


        int[] numbersArray = new int[10]; // Create an array with a length of 10

        // Fill the array with numbers from 1 to 10
        for (int i = 1; i <= 10; i++) {
            numbersArray[i - 1] = i;
        }

        // Print the contents of the array
        for (int i = 0; i < numbersArray.length; i++) {
            System.out.print(numbersArray[i]);

            // Add a comma and space unless it's the last element
            if (i < numbersArray.length - 1) {
                System.out.print(", ");
            }
        }

    }
}
