import Model.Customer;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer(1, "Klinton", "Lee"));
        customerList.add(new Customer(2, "Icaro", "Salgado"));
        customerList.add(new Customer(3, "Pedro", "Soares"));
        customerList.add(new Customer(4, "Maran", "Brasil"));
        customerList.add(new Customer(5, "Evandro", "Sutil"));
        customerList.add(new Customer(6, "Thainan", "Santos"));
        customerList.add(new Customer(7, "Paulo", "Lima"));
    }
}
