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
    
    public int findIndex(Customer obj) {
        return customers.indexOf(obj);
   }

    @Override
    public void update(int id, Customer newCustomer) {
        Optional <Customer> findObj = find(id);

        if(!findObj.isEmpty()){
            findObj.get().setName(newCustomer.getName());
            findObj.get().setLastName(newCustomer.getLastName());
        }

    }

    @Override
    public void delete(int id) {
        Optional <Customer> response = find(id);
        if(response.isPresent()){
            customers.remove(id - 1);
        }
    }
}