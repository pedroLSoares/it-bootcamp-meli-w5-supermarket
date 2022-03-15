package Model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class Item {

    private String code;
    private String name;
    private BigDecimal unitPrice;
    public static int boughtQty;

}

