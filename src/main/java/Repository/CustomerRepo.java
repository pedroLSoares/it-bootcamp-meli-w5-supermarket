package Repository;

import Model.Customer;

import java.util.ArrayList;
import java.util.Optional;

public class CustomerRepo implements Repository<Customer> {
    private static ArrayList<Customer> customers = new ArrayList<Customer>();

    @Override
    public void create(Customer obj) {
        obj.setID(customers.size() + 1);
        customers.add(obj);
    }

    @Override
    public ArrayList<Customer> read() {
        return customers;
    }

    @Override
    public Optional<Customer> find(int id) {
         return customers.stream().filter(c -> c.getID() == id).findFirst();
    }

    @Override
    public void update(Customer obj) {
    }

    @Override
    public void delete(Customer obj) {

    }
}