package Repository;

import Model.Item;

import java.util.ArrayList;

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
    public Item find(int id) {
        return null;
    }

    @Override
    public void update(Item obj) {

    }

    @Override
    public void delete(Item obj) {

    }
}
