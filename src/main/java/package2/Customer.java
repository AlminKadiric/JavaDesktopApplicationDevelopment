package package2;

public class Customer implements Comparable<Customer> {
    private String name;
    private String surname;


    public String getName() {
        return name;
    }

    public Customer(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    @Override
    public int compareTo(Customer o) {
        int result = surname.compareTo(o.getSurname());
        if (result==0){
            result= surname.compareTo(o.getSurname());

        }
        return result;
    }
}
