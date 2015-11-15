package workshop.mindcards.Model;

import android.graphics.Bitmap;
import android.graphics.Color;

/**
 * Created by linuxoid on 10.11.15.
 */
public class Item {
    private int _level;
    private String _content;
    private int _color;
    private static int _id=0;

    private int _locationX;
    private int _locationY;
    private Bitmap _icon;


    public Item()
    {


        this._level=0;
        this._content="";
        this._color=Color.TRANSPARENT;



        _id++;

        return;
    }


    public Item(String content)
    {


        this._level=0;
        this._content=content;
        this._color=Color.MAGENTA;





        _id++;

        return;
    }



    public String get_Content(){return this._content;}
    public void set_Content(String Content){this._content=Content;}

    public int get_Color(){return this._color;}
    public void set_Color(int color){this._color=color;}

    public int get_Id(){return this._id;}


    public int get_Level(){return this._level;}
    public void set_Level(int level){this._level=level;}



    public void set_Location(int x,int y)
    {
        this._locationX=x;
        this._locationY=y;
    }
    public int get_Location_x(){return this._locationX;}
    public int get_Location_y(){return this._locationY;}

    public void set_Icon(Bitmap icon){this._icon=icon;}
    public Bitmap get_Icon() {return this._icon;}



}
