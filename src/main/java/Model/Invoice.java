package Model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.List;

@Data
public class Invoice {

    private Customer customer;
    private List<Item> items;
    private BigDecimal totalPrice;

    public Invoice(Customer customer, List<Item> items) {
        this.customer = customer;
        this.items = items;
        this.totalPrice = setTotalPrice();
    }

    private BigDecimal setTotalPrice() {
        BigDecimal total = new BigDecimal(0);
        for (Item item:
             items) {
            total = total.add(item.getUnitPrice());
        }

        return total;
    }

    public String getTotalPrice() {
        return NumberFormat.getCurrencyInstance().format(totalPrice);
    }
}
