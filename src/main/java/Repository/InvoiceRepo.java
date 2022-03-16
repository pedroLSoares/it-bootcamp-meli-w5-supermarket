package Repository;

import Model.Customer;
import Model.Invoice;

import java.util.ArrayList;
import java.util.Optional;

public class InvoiceRepo implements Repository<Invoice> {
    private static ArrayList<Invoice> invoices = new ArrayList<Invoice>();

    @Override
    public void create(Invoice obj) {
        obj.setIdInvoice(invoices.size() + 1);
        invoices.add(obj);
    }

    @Override
    public ArrayList<Invoice> read() {
        return invoices;
    }

    @Override
    public Optional<Invoice> find(int id) {
        return invoices.stream().filter(c -> c.getIdInvoice() == id).findFirst();
    }

    @Override
    public void update(int id, Invoice newInvoice) {
        Optional <Invoice> findObj = find(id);

        if(!findObj.isEmpty()){
            findObj.get().setCustomer(newInvoice.getCustomer());
            findObj.get().setItems(newInvoice.getItems());
            findObj.get().setTotalPrice( newInvoice.getTotalPrice());
        }
    }

    @Override
    public void delete(int id) {
        Optional <Invoice> response = find(id);
        if(response.isPresent()){
            invoices.remove(id - 1);
        }
    }
}