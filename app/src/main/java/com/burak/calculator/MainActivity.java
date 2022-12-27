package com.burak.calculator;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;



public class MainActivity extends AppCompatActivity {
    private InterstitialAd mInterstitialAd;


    TextView crunchifyEditText;

    boolean crunchifyAddition, mSubtract, crunchifyMultiplication, crunchifyDivision;
    float mValueOne, mValueTwo;
    int hundred= 100;
    int ten =10;
    private AdView mAdView;
    private AdView nAdView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        crunchifyEditText=findViewById(R.id.textView8);


        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-3135462600729764/4012938995");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());
        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                // Load the next interstitial.
                mInterstitialAd.loadAd(new AdRequest.Builder().build());
            }

        });

        mAdView = findViewById(R.id.adView);
        nAdView=findViewById(R.id.adView2);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
        nAdView.loadAd(adRequest);





    }


    public void clear(View view) {




        crunchifyEditText.setText(null);



    }
    public void point(View view) {





        if (!crunchifyEditText.getText().toString().matches(""))
        {


            mValueOne = Float.parseFloat(crunchifyEditText.getText().toString());

            crunchifyEditText.setText(mValueOne / ten + "");

        }
        else{
            crunchifyEditText.setText(null);
        }}


    public void divideHundreds(View view) {




        if (!crunchifyEditText.getText().toString().matches(""))
        {


            mValueOne = Float.parseFloat(crunchifyEditText.getText().toString());

            crunchifyEditText.setText(mValueOne / hundred + "");

        }
        else{
            crunchifyEditText.setText(null);
        }



    }

    public void divide(View view) {




        if (!crunchifyEditText.getText().toString().matches(""))
        {
            mValueOne = Float.parseFloat(crunchifyEditText.getText().toString());
            crunchifyDivision = true;
            crunchifyEditText.setText(null);
        }
        else{
            crunchifyEditText.setText(null);
        }
    }

    public void seven(View view) {

        if (!crunchifyEditText.getText().toString().matches(""))
        {


            if (crunchifyEditText.getText().toString()=="0"){
                crunchifyEditText.setText("7");
            }else{
                crunchifyEditText.setText(crunchifyEditText.getText() + "7");
            }
        }
        else{
            crunchifyEditText.setText("7");
        }




    }

    public void eight(View view) {
        if (!crunchifyEditText.getText().toString().matches(""))
        {


            if (crunchifyEditText.getText().toString()=="0"){
                crunchifyEditText.setText("8");
            }else{
                crunchifyEditText.setText(crunchifyEditText.getText() + "8");
            }
        }
        else{
            crunchifyEditText.setText("8");
        }
    }

    public void nine(View view) {
        if (!crunchifyEditText.getText().toString().matches(""))
        {


            if (crunchifyEditText.getText().toString()=="0"){
                crunchifyEditText.setText("9");
            }else{
                crunchifyEditText.setText(crunchifyEditText.getText() + "9");
            }
        }
        else{
            crunchifyEditText.setText("9");
        }
    }

    public void multiply(View view) {

        if (!crunchifyEditText.getText().toString().matches(""))
        {
            mValueOne = Float.parseFloat(crunchifyEditText.getText().toString());
            crunchifyMultiplication = true;
            crunchifyEditText.setText(null);
        }
        else{
            crunchifyEditText.setText(null);
        }
    }

    public void four(View view) {
        if (!crunchifyEditText.getText().toString().matches(""))
        {


            if (crunchifyEditText.getText().toString()=="0"){
                crunchifyEditText.setText("4");
            }else{
                crunchifyEditText.setText(crunchifyEditText.getText() + "4");
            }
        }
        else{
            crunchifyEditText.setText("4");
        }

    }

    public void five(View view) {
        if (!crunchifyEditText.getText().toString().matches(""))
        {


            if (crunchifyEditText.getText().toString()=="0"){
                crunchifyEditText.setText("5");
            }else{
                crunchifyEditText.setText(crunchifyEditText.getText() + "5");
            }
        }
        else{
            crunchifyEditText.setText("5");
        }

    }

    public void six(View view) {
        if (!crunchifyEditText.getText().toString().matches(""))
        {


            if (crunchifyEditText.getText().toString()=="0"){
                crunchifyEditText.setText("6");
            }else{
                crunchifyEditText.setText(crunchifyEditText.getText() + "6");
            }
        }
        else{
            crunchifyEditText.setText("6");
        }
    }

    public void subtract(View view) {


        if (!crunchifyEditText.getText().toString().matches(""))
        {
            mValueOne = Float.parseFloat(crunchifyEditText.getText().toString());
            mSubtract = true;
            crunchifyEditText.setText(null);
        }
        else{
            crunchifyEditText.setText(null);
        }
    }

    public void three(View view) {
        if (!crunchifyEditText.getText().toString().matches(""))
        {


            if (crunchifyEditText.getText().toString()=="0"){
                crunchifyEditText.setText("3");
            }else{
                crunchifyEditText.setText(crunchifyEditText.getText() + "3");
            }
        }
        else{
            crunchifyEditText.setText("3");
        }

    }

    public void two(View view) {
         if (!crunchifyEditText.getText().toString().matches(""))
        {


            if (crunchifyEditText.getText().toString()=="0"){
                crunchifyEditText.setText("2");
            }else{
                crunchifyEditText.setText(crunchifyEditText.getText() + "2");
            }
        }
        else{
            crunchifyEditText.setText("2");
        }


    }

    public void one(View view) {
        if (!crunchifyEditText.getText().toString().matches(""))
        {


            if (crunchifyEditText.getText().toString()=="0"){
                crunchifyEditText.setText("1");
            }else{
                crunchifyEditText.setText(crunchifyEditText.getText() + "1");
            }
        }
        else{
            crunchifyEditText.setText("1");
        }

    }

    public void add(View view) {


        if (!crunchifyEditText.getText().toString().matches(""))
        {
        mValueOne = Float.parseFloat(crunchifyEditText.getText().toString());
        crunchifyAddition = true;
        crunchifyEditText.setText(null);
        }
        else{
            crunchifyEditText.setText(null);
        }
    }

    public void zero(View view) {
        if (!crunchifyEditText.getText().toString().matches(""))
        {


            if (crunchifyEditText.getText().toString()=="0"){
                crunchifyEditText.setText("0");
            }else{
                crunchifyEditText.setText(crunchifyEditText.getText() + "0");
            }
        }
        else{
            crunchifyEditText.setText("0");
        }


    }



    public void equal(View view) {

        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        }


        if (!crunchifyEditText.getText().toString().matches(""))
        {
            mValueTwo = Float.parseFloat(crunchifyEditText.getText().toString());

            if (crunchifyAddition == true) {
            crunchifyEditText.setText(mValueOne + mValueTwo + "");
            crunchifyAddition = false;
        }



        if (mSubtract == true) {
            crunchifyEditText.setText(mValueOne - mValueTwo + "");
            mSubtract = false;
        }

        if (crunchifyMultiplication == true) {
            crunchifyEditText.setText(mValueOne * mValueTwo + "");
            crunchifyMultiplication = false;
        }

        if (crunchifyDivision == true) {
            crunchifyEditText.setText(mValueOne / mValueTwo + "");
            crunchifyDivision = false;
        }
        else{

           float mValuethree = Float.parseFloat(crunchifyEditText.getText().toString());
           mValueOne=mValuethree;

            crunchifyEditText.setText(mValuethree+"");
        }


    }
        else{

            crunchifyEditText.setText(null);
        }




    }
}
