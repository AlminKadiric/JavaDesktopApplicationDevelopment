package Tutorial;

public class One {

    public static void main(String[] args) {
        int n = 5; // Adjust the value of 'n' to change the size of the letter U
        for (int i = 0; i < n; i++) {
            System.out.print("*");
            for (int j = 0; j < n - 2; j++) {
                if ((i == n - 1) || (j == 0) || (j == n - 3)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("*");
            System.out.println();
        }
    }
}
