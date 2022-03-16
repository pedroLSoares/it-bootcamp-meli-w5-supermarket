package Repository;

import Model.Item;

import java.util.ArrayList;
import java.util.Optional;

public class ItemRepo implements Repository<Item> {
    private static ArrayList<Item> items = new ArrayList<Item>();

    @Override
    public void create(Item obj) {

    }

    @Override
    public ArrayList<Item> read() {
        return null;
    }

    @Override
    public Optional<Item> find(int id) {
        return null;
    }

    @Override
    public void update(int id, Item obj) {

    }

    @Override
    public void delete(int id) {

    }
}
