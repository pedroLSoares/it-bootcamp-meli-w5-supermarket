package Repository;

import Model.Invoice;

import java.util.ArrayList;
import java.util.Optional;

public class InvoiceRepo implements Repository<Invoice> {
    private static ArrayList<Invoice> invoices = new ArrayList<Invoice>();

    @Override
    public void create(Invoice obj) {

    }

    @Override
    public ArrayList<Invoice> read() {
        return null;
    }

    @Override
    public Optional<Invoice> find(int id) {
        return null;
    }

    @Override
    public void update(int id, Invoice obj) {

    }

    @Override
    public void delete(int id) {

    }
}