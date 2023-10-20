package Tutorial;

public class Main {
    public static void main(String[] args) {
        int n = 5; // Adjust the value of 'n' to change the size of the letter E
        for (int i = 0; i < n; i++) {
            System.out.print("*");
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1 || j == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
