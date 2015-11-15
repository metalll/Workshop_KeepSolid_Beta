package workshop.mindcards.GUI;

import android.content.Intent;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.concurrent.TimeUnit;

import butterknife.ButterKnife;
import butterknife.InjectView;
import workshop.mindcards.R;

public class WelcomeActivity extends AppCompatActivity {


    first task1=new first();
    two task2=new two();
    tree task3= new tree();
    four task4=new four();
    five task5 = new five();
    six task6=new six();
    seven task7 = new seven();
    eight task8 = new eight();
    nine task9 = new nine();
    ten task10 = new ten();

    @InjectView(R.id.logo)ImageView logo;
    @InjectView(R.id.layout)LinearLayout layout;




    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);




       task1.execute();

        ButterKnife.inject(this);

        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                finish();

                    task1. cancel(true);
                    task2. cancel(true);
                    task3. cancel(true);
                    task4. cancel(true);
                    task5. cancel(true);
                    task6. cancel(true);
                    task7. cancel(true);
                    task8. cancel(true);
                    task9. cancel(true);
                    task10.cancel(true);






                Intent intent = new Intent(WelcomeActivity.this, SignIn.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });







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

            task2.execute();




        }
    }
        class two extends AsyncTask<Void, Void, Void> {

            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                layout.setBackgroundColor(Color.rgb(255, 255, 255));

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


                task3.execute();



            }
        }
    class tree extends AsyncTask<Void, Void, Void> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            layout.setBackgroundColor(Color.rgb(255, 255, 255));
            logo.setImageResource(R.drawable.logo_full);

        }

        @Override
        protected Void doInBackground(Void... params) {

            return null;
        }

        @Override
        protected void onPostExecute(Void result) {



            super.onPostExecute(result);



            task4.execute();



        }
    }

    class four extends AsyncTask<Void, Void, Void> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            layout.setBackgroundColor(Color.rgb(255,255,255));
            logo.setImageResource(R.drawable.logo_five);

        }

        @Override
        protected Void doInBackground(Void... params) {

            return null;
        }

        @Override
        protected void onPostExecute(Void result) {



            super.onPostExecute(result);

            task5.execute();






        }
    }
    class five extends AsyncTask<Void, Void, Void> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            layout.setBackgroundColor(Color.rgb(255,255,255));
            logo.setImageResource(R.drawable.logo_four);

        }

        @Override
        protected Void doInBackground(Void... params) {

            return null;
        }

        @Override
        protected void onPostExecute(Void result) {



            super.onPostExecute(result);


            task6.execute();



        }
    }
    class six extends AsyncTask<Void, Void, Void> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            layout.setBackgroundColor(Color.rgb(255,255,255));
            logo.setImageResource(R.drawable.logo_tree);

        }

        @Override
        protected Void doInBackground(Void... params) {

            return null;
        }

        @Override
        protected void onPostExecute(Void result) {



            super.onPostExecute(result);

            task7.execute();





        }
    }
    class seven extends AsyncTask<Void, Void, Void> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            layout.setBackgroundColor(Color.rgb(255,255,255));
            logo.setImageResource(R.drawable.logo_tree);

        }

        @Override
        protected Void doInBackground(Void... params) {

            return null;
        }

        @Override
        protected void onPostExecute(Void result) {



            super.onPostExecute(result);



            task8.execute();




        }
    }

    class eight extends AsyncTask<Void, Void, Void> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            layout.setBackgroundColor(Color.rgb(255,255,255));
            logo.setImageResource(R.drawable.logo_two);

        }

        @Override
        protected Void doInBackground(Void... params) {

            return null;
        }

        @Override
        protected void onPostExecute(Void result) {



            super.onPostExecute(result);



            task9.execute();




        }
    }

    class nine extends AsyncTask<Void, Void, Void> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            layout.setBackgroundColor(Color.rgb(255,255,255));
            logo.setImageResource(R.drawable.logo_one);

        }

        @Override
        protected Void doInBackground(Void... params) {

            return null;
        }

        @Override
        protected void onPostExecute(Void result) {



            super.onPostExecute(result);



            task10.execute();




        }
    }


    class ten extends AsyncTask<Void, Void, Void> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            layout.setBackgroundColor(Color.rgb(255, 255, 255));
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
