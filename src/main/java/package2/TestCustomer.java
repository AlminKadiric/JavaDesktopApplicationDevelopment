package package2;

import javax.swing.*;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestCustomer {
    public static void main(String[] args) {


        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer("Eldar", "Hasanovic"));
        customerList.add(new Customer("Martin", "Filipovic"));
        customerList.add(new Customer("Samir", "Nasri"));
        Comparator<Customer>customerComparator = TestCustomer::uporediKupce;;

        customerList.stream().sorted(customerComparator).forEach(System.out::println);
        int number =SwingConstants.LEADING;
        PrintStream output = System.out;


    }


    static int uporediKupce(Customer c1, Customer c2){
        int result = c1.getName().compareTo(c2.getName());
        if(result==0){
            result = c1.getSurname().compareTo(c2.getSurname());
        }
        return  result;


    }
}
