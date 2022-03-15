package Model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
public class Invoice {

    private Customer customer;
    private List<Item> items;
    private BigDecimal totalPrice;
}
