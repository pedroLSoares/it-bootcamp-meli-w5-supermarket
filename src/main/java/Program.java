import Model.Customer;
import Model.Invoice;
import Model.Item;
import Model.Market;
import Repository.CustomerRepo;
import Repository.Repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//
//        List<Customer> customerList = new ArrayList<>();
//        customerList.add(new Customer(1, "Klinton", "Lee"));
//        customerList.add(new Customer(2, "Icaro", "Salgado"));
//        customerList.add(new Customer(3, "Pedro", "Soares"));
//        customerList.add(new Customer(4, "Maran", "Brasil"));
//        customerList.add(new Customer(5, "Evandro", "Sutil"));
//        customerList.add(new Customer(6, "Thainan", "Santos"));
//        customerList.add(new Customer(7, "Paulo", "Lima"));
//
//        customerList.add(new Customer(8, "Cara que", "Não devia estar aqui"));
//
//        for (int i=0; i < customerList.size(); i++) {
//            System.out.println(customerList.get(i));
//        };
//        System.out.println();
//        customerList.remove(7);
//
//        for (Customer customer :
//                customerList) {
//            System.out.println(customer);
//        }
//
//        try {
//            System.out.println("Digite o id do usuário: ");
//            int userId = scanner.nextInt() - 1;
//
//            Customer searchCustomer = customerList.get(userId);
//            System.out.println(searchCustomer);
//        } catch (IndexOutOfBoundsException error) {
//            System.out.println("Usuário não encontrado.");
//        }
//        List<Item> items = new ArrayList<Item>();
//        items.add(new Item("MLB12312", "garrafa", new BigDecimal (15.00)));
//        items.add(new Item("MLB12333", "café", new BigDecimal(15.00)));
//        items.add(new Item("MLB41241", "mesa", new BigDecimal(4000.23)));
//
//
//        Invoice invoice = new Invoice(customerList.get(1), items);
//
//        List<Item> items2 = new ArrayList<Item>();
//        items2.add(new Item("MLB12312", "garrafa", new BigDecimal (15.00)));
//        items2.add(new Item("MLB12333", "café", new BigDecimal(15.00)));
//        items2.add(new Item("MLB41241", "mesa", new BigDecimal(4000.23)));
//
//        Invoice invoice2 = new Invoice(customerList.get(1), items2);
//
//
//        System.out.println(invoice.getTotalPrice());
//        Market market = new Market();
//
//        market.addInvoice(invoice);
//        market.addInvoice(invoice2);
//
//        scanner.close();

        CustomerRepo customerRepository = new CustomerRepo();
        Customer customer = new Customer("Paulo", "Lima");


        customerRepository.create(customer);
        List<Customer> customers = customerRepository.read();
        System.out.println(customers);
        Optional<Customer> customerFound = customerRepository.find(1);
        System.out.println(customerFound.get());
    }

}
