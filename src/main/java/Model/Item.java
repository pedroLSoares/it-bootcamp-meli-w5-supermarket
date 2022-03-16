package Model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class Item {

    private int idItem;
    private String code;
    private String name;
    private BigDecimal unitPrice;
    public static int boughtQty;

    public Item(String code, String name, BigDecimal unitPrice) {
        this.code = code;
        this.name = name;
        this.unitPrice = unitPrice;
    }
}

