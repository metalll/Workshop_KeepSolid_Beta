package workshop.mindcards.GUI;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.database.DataSetObserver;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;

import CustomView.FloatingActionButton;
;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;


import java.util.ArrayList;

import butterknife.InjectView;
import workshop.mindcards.R;

public class Navigate extends AppCompatActivity {

    FloatingActionButton fabButtonAdd;
    FloatingActionButton fabButtonDelete;

 //   ListView listView;
   // ArrayAdapter listAdapter;
   // String[] arrayList;
 // набор данных, которые свяжем ос списком
 String[] ideas = {"Идея"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        /*arrayList=new String[0];
        listAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arrayList);
        listView=(ListView)findViewById(R.id.listView);
        listView.setAdapter(listAdapter);

        listAdapter.add("Привет");
        listAdapter.notifyDataSetChanged();*/

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigate);


        // получаем элемент ListView
        ListView countriesList = (ListView) findViewById(R.id.MindList);



        // создаем адаптер
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1);

        // устанавливаем для списка адаптер
        countriesList.setAdapter(adapter);
    










        fabButtonAdd = new FloatingActionButton.Builder(this)
                .withDrawable(getResources().getDrawable(R.drawable.add))
                .withButtonColor(getResources().getColor(R.color.primary))
                .withGravity(Gravity.BOTTOM | Gravity.RIGHT)
                .withMargins(0, 0, 16, 16)
                .create();

       fabButtonDelete = new FloatingActionButton.Builder(this)
                .withDrawable(getResources().getDrawable(R.drawable.delete))
                .withButtonColor(getResources().getColor(R.color.primary))
                .withGravity(Gravity.BOTTOM | Gravity.RIGHT)
                .withMargins(0, 0, 16, 16)
                .create();

        fabButtonDelete.setVisibility(View.INVISIBLE);

        fabButtonDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SwapFubImages();

            }
        });

         fabButtonAdd.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {


                adapter.add("Идея");

                adapter.notifyDataSetChanged();
             }
         });
    }

        void SwapFubImages()
        {
            if(fabButtonAdd.getVisibility()==View.VISIBLE) {


                fabButtonAdd.setVisibility(View.INVISIBLE);
                fabButtonDelete.setVisibility(View.VISIBLE);
            }
            else
            {
                fabButtonAdd.setVisibility(View.VISIBLE);
                fabButtonDelete.setVisibility(View.INVISIBLE);
            }
        }

}
