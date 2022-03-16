package Repository;

import Model.Customer;
import Model.Item;

import java.awt.*;
import java.util.ArrayList;
import java.util.Optional;

public class ItemRepo implements Repository<Item> {
    private static ArrayList<Item> items = new ArrayList<Item>();

    @Override
    public void create(Item obj) {
        obj.setIdItem(items.size() + 1);
        items.add(obj);
    }

    @Override
    public ArrayList<Item> read() {
        return items;
    }

    @Override
    public Optional<Item> find(int id) {
        return items.stream().filter(c -> c.getIdItem() == id).findFirst();
    }

    @Override
    public void update(int id, Item newItem) {
        Optional <Item> findObj = find(id);

        if(!findObj.isEmpty()){
            findObj.get().setCode(newItem.getCode());
            findObj.get().setName(newItem.getName());
            findObj.get().setUnitPrice(newItem.getUnitPrice());
        }
    }

    @Override
    public void delete(int id) {
        Optional <Item> response = find(id);
        if(response.isPresent()){
            items.remove(id - 1);
        }
    }
}
