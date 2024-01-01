package com.example.simple_ecommerce;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
    RelativeLayout R1,R2,R3,R4;
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        R1=findViewById(R.id.r1);
        R2=findViewById(R.id.r2);
        R3=findViewById(R.id.r3);
        R4=findViewById(R.id.r4);
        b1=findViewById(R.id.viewpostion);
        b2=findViewById(R.id.view2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendtolac2();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendtoAzur();
            }
        });




        R1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SendToListOfProduct();
            }
        });
        R2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SendToListOfProduct();
            }
        });
        R3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SendToListOfProduct();
            }
        });
        R4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SendToListOfProduct();
            }
        });

    }
   public void  SendToListOfProduct(){
       Intent intent = new Intent(MainActivity.this, ListProduct.class);
       startActivity(intent);
    }

    public void  sendtolac2(){

        double latitude = 36.84796358909936;
        double longitude = 10.280854235394369;
        String label = "lac 2 ";

        String uri = "geo:" + latitude + "," + longitude + "?q=" + latitude + "," + longitude + "(" + label + ")";
        Uri location = Uri.parse(uri);

        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
        mapIntent.setPackage("com.google.android.apps.maps"); // Set package to explicitly open in Google Maps app

        if (mapIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(mapIntent);
        } else {
            Uri mapWebUri = Uri.parse("https://www.google.com/maps?q=" + latitude + "," + longitude);
            Intent mapWebIntent = new Intent(Intent.ACTION_VIEW, mapWebUri);
            startActivity(mapWebIntent);
        }
    }
    public void  sendtoAzur(){

        double latitude = 36.72611419275946;
        double longitude = 10.25591199070701;
        String label = "Azur city  ";

        String uri = "geo:" + latitude + "," + longitude + "?q=" + latitude + "," + longitude + "(" + label + ")";
        Uri location = Uri.parse(uri);

        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
        mapIntent.setPackage("com.google.android.apps.maps"); // Set package to explicitly open in Google Maps app

        if (mapIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(mapIntent);
        } else {
            Uri mapWebUri = Uri.parse("https://www.google.com/maps?q=" + latitude + "," + longitude);
            Intent mapWebIntent = new Intent(Intent.ACTION_VIEW, mapWebUri);
            startActivity(mapWebIntent);
        }

    }
}