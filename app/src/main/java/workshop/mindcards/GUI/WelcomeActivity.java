package workshop.mindcards.GUI;

import android.content.Intent;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.concurrent.TimeUnit;

import butterknife.ButterKnife;
import butterknife.InjectView;
import workshop.mindcards.R;

public class WelcomeActivity extends AppCompatActivity {


    private int count=0;

    @InjectView(R.id.logo)ImageView logo;
    @InjectView(R.id.layout)LinearLayout layout;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);


        new first().execute();
        ButterKnife.inject(this);

    }




    class first extends AsyncTask<Void, Void, Void> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

        }

        @Override
        protected Void doInBackground(Void... params) {
            try {



                TimeUnit.SECONDS.sleep(3);


            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void result) {


            super.onPostExecute(result);

            new two().execute();



        }
    }
        class two extends AsyncTask<Void, Void, Void> {

            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                logo.setImageResource(R.drawable.logo_keepsolid);


            }

            @Override
            protected Void doInBackground(Void... params) {
                try {



                    TimeUnit.SECONDS.sleep(3);


                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                return null;
            }

            @Override
            protected void onPostExecute(Void result) {



                super.onPostExecute(result);


                new tree().execute();



            }
        }
    class tree extends AsyncTask<Void, Void, Void> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            layout.setBackgroundColor(Color.rgb(255,255,255));
            logo.setImageResource(R.drawable.logo);

        }

        @Override
        protected Void doInBackground(Void... params) {
            try {



                TimeUnit.SECONDS.sleep(2);


            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void result) {



            super.onPostExecute(result);



            Intent intent = new Intent(WelcomeActivity.this, SignIn.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);

            finish();



        }
    }

    }
