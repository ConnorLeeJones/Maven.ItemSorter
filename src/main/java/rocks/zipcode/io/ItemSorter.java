package rocks.zipcode.io;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class ItemSorter {
    Item[] items;

    public ItemSorter(Item[] items) {
        this.items = items;
    }

    public Item[] sort(Comparator<Item> comparator) {
        ArrayList<Item> itemsList = new ArrayList<Item>(Arrays.asList(items));
        Collections.sort(itemsList, comparator);
        items = new Item[itemsList.size()];
        items = itemsList.toArray(items);
        return items;
    }
}
