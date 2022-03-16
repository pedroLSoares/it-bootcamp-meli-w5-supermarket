package Model;

import java.util.ArrayList;

public class Market {
    private ArrayList<Invoice> invoices = new ArrayList<>();
    private ArrayList<Customer> customers = new ArrayList<>();

    public void addInvoice(Invoice invoiceToAdd){

        if(!customers.contains(invoiceToAdd.getCustomer())){
            System.out.println("Usuário não existe, criando user...");
            addCustomer(invoiceToAdd.getCustomer());
        }

        System.out.println("Adicionando Fatura");
        invoices.add(invoiceToAdd);
    }

    private void addCustomer(Customer customerToAdd){
         if(!customers.contains(customerToAdd)){
             customers.add(customerToAdd);
             System.out.println("usuario criado: " + customers.get(customers.size() -1));
         }
    }

}
