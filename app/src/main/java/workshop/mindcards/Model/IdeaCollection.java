package workshop.mindcards.Model;

import java.util.List;

/**
 * Created by linuxoid on 15.11.15.
 */
public class IdeaCollection {
    private List<Idea>_collection;

    public void Add(Idea idea)
    {
        this._collection.add(idea);
    }

    public void Add(Idea idea,int position)
    {
        this._collection.add(position,idea);
    }

    public void Remove()
    {
        this._collection.remove(this._collection.size() - 1);
    }

    public void Remove(int position)
    {
        this._collection.remove(position);
    }


    public Idea get_Idea(int position)
    {
        return this._collection.get(position);
    }


}
