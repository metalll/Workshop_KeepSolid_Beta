package workshop.mindcards.Model;

import android.graphics.Color;

/**
 * Created by linuxoid on 10.11.15.
 */
public class Item {
    private final int _level;
    private String _content;
    private int _color;
    private static int _id=0;
    private String _strId;
    private final boolean _root;


    public Item()
    {


        this._level=0;
        this._content="";
        this._color=Color.TRANSPARENT;
        this._root=_level==0;

        if(isRoot())
            _strId="root_element_"+_id;

        else
            _strId="element_"+_id;

        _id++;

        return;
    }


    public Item(String content)
    {


        this._level=0;
        this._content=content;
        this._color=Color.MAGENTA;
        this._root=_level==0;

        if(isRoot())
            _strId="root_element_"+_id;

        else
            _strId="element_"+_id;

        _id++;

        return;
    }



    public String get_Content(){return this._content;}
    public void set_Content(String Content){this._content=Content;}

    public int get_Color(){return this._color;}
    public void set_Color(int color){this._color=color;}

    public String get_Id(){return this._strId;}


    public int get_level(){return this._level;}
    public boolean isRoot(){return this._root;}


}
