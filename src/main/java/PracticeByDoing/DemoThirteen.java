package PracticeByDoing;

public class DemoThirteen {
    public static void main(String[] args) {
        int end=5;
        for (int row = 1; row < end; row++) {
            if(row==1 || row==3 || row ==end) {
                System.out.println("*****");
            } else {
                System.out.println("*");
            }

        }
    }
}
