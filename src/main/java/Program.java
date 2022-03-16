import Model.Customer;
import Model.Invoice;
import Model.Item;
import Model.Market;
import Repository.CustomerRepo;
import Repository.Repository;
import Repository.InvoiceRepo;
import Repository.ItemRepo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        //create Customer
        CustomerRepo customerRepository = new CustomerRepo();
        Customer customer = new Customer("Paulo", "Lima");
        Customer thainan = new Customer("thainan","Santos");


        customerRepository.create(customer);
        customerRepository.create(thainan);
        List<Customer> customers = customerRepository.read();
        System.out.println(customers);



        // Update Customer
        Customer customer2 = new Customer("Paulos", "Laranja");
        customerRepository.update(1, customer2);

        Customer customerThainan = new Customer("Thaina", "Corinthians");
        customerRepository.update(2, customerThainan);

        List<Customer> customer3 = customerRepository.read();
        System.out.println(customer3);

        //create Items
        ItemRepo intemRepository = new ItemRepo();
        Item testeItem = new Item("MLB12312", "garrafa", new BigDecimal (15.00));

        intemRepository.create(testeItem);
        List<Item> itemRead = intemRepository.read();


        //create invoices
        InvoiceRepo invoiceRepository = new InvoiceRepo();

        Invoice invoice = new Invoice(customer,itemRead);

        invoiceRepository.create(invoice);
        List<Invoice> invoiceRead = invoiceRepository.read();
        System.out.println(invoiceRead);



    }

}
