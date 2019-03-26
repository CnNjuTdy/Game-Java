package model;

import java.util.ArrayList;

public class ItemList {
    private int maxSize;
    private ArrayList<Object> items;

    public ItemList(int maxSize) {
        this.maxSize = maxSize;
        this.items = new ArrayList<Object>();
    }

    public Object getItem(int index) {
        if (index > 0 && index < this.items.size()) {
            return this.items.get(index);
        } else {
            return null;
        }
    }

    public Object replaceItem(int index, Object newItem) {
        Object oldItem = this.getItem(index);
        if (index > 0 && index < this.items.size()) {
            this.items.set(index, newItem);
        }
        return oldItem;
    }

    public boolean addItem(Object newItem) {
        if (this.items.size() < this.maxSize) {
            this.items.add(newItem);
            return true;
        }
        return false;
    }
}
