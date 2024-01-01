package com.example.simple_ecommerce;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class DeatilProduct extends AppCompatActivity {
ImageView im;
Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deatil_product);
        getSupportActionBar().hide();
        b=findViewById(R.id.add);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendToReserver();
            }
        });

        im=findViewById(R.id.arrow);
        im.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goBack();
            }
        });
    }
  public void   goBack(){
      Intent intent = new Intent(DeatilProduct.this, ListProduct.class);
      startActivity(intent);
    }
    public void      sendToReserver(){
        Intent intent = new Intent(DeatilProduct.this, Reserver.class);
        startActivity(intent);
    }
}