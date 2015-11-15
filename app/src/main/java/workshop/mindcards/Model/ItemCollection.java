package workshop.mindcards.Model;

import java.util.List;

/**
 * Created by linuxoid on 10.11.15.
 */
public class ItemCollection {
    private List<Item> _collection;


    public ItemCollection()
    {


    }

    public void Add(Item item)
    {
        this._collection.add(item);
    }

    public void Add(Item item,int position)
    {
        this._collection.add(position,item);
    }

    public void Remove()
    {
        this._collection.remove(this._collection.size() - 1);
    }

    public void Remove(int position)
    {
        this._collection.remove(position);
    }


    public Item get_Item(int position)
    {
        return this._collection.get(position);
    }




}
