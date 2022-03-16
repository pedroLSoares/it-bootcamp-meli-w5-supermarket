package Repository;

import Model.Customer;

import java.util.ArrayList;

public class CustomerRepo implements Repository<Customer> {
    private static ArrayList<Customer> customers = new ArrayList<Customer>();

    @Override
    public void create(Customer obj) {

    }

    @Override
    public ArrayList<Customer> read() {
        return null;
    }

    @Override
    public Customer find(int id) {
        return null;
    }

    @Override
    public void update(Customer obj) {

    }

    @Override
    public void delete(Customer obj) {

    }
}