package com.example.arz;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;

public class Splash extends Activity {

    /** Duration of wait **/
    private final int SPLASH_DISPLAY_LENGTH = 1000;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
       // setContentView(R.layout.activity_splash);

        /* New Handler to start the Menu-Activity
         * and close this Splash-Screen after some seconds.*/
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                //ParseJson();
                Intent mainIntent = new Intent(Splash.this,MainActivity.class);
                Splash.this.startActivity(mainIntent);
                Splash.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
    }
    public void ParseJson(){
        //Get Response from URL and Parse Json
        //String dollor = "1000";
        Call<List<MultipleResource>> call = ApiClient.getInstance().getMyApi().getCurrency();

        /**
         GET List Resources
         **/
        call.enqueue(new Callback<List<MultipleResource>>() {
            @Override
            public void onResponse(Call<List<MultipleResource>> call, retrofit2.Response<List<MultipleResource>>  response) {
                Log.d("TAG",response.code()+"");
                List<MultipleResource> resource = response.body();
                if(resource == null){
                    return;
                }
                for (MultipleResource item :resource){
                    String x = item.dollor;
                }


            }

            @Override
            public void onFailure(Call<List<MultipleResource>> call, Throwable t) {

            }


        });
    }
}