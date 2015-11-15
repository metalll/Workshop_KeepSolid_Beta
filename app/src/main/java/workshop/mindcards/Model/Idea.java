package workshop.mindcards.Model;

/**
 * Created by linuxoid on 15.11.15.
 */
public class Idea {

    private Item _rootItem;
    private ItemCollection _itemCollectionTopic;
    private ItemCollection _itemCollectionSubTopic;

    public Item get_RootItem()
    {
          return _rootItem;
    }

    public ItemCollection get_itemCollectionTopic() {
        return _itemCollectionTopic;
    }

    public ItemCollection get_itemCollectionSubTopic() {
        return _itemCollectionSubTopic;
    }


}
