package TutorialTwoSec;

import java.util.Arrays;
import java.util.List;

public class Collections {
    public static void main(String[] args) {
        Integer [] array = {0,1,2,3,4,5,6,7};
        List<Integer> integerList=Arrays.asList(array);
        System.out.println(integerList.stream().reduce(0, (x, y) -> x + y));


    }
}
