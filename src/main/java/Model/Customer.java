package Model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Customer {

    private int ID;
    private String name;
    private String lastName;

    @Override
    public String toString() {
        return "O ID do usuário é " + ID + ", e o nome é " + name + " " + lastName;
    }
}
