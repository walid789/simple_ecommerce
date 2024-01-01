package com.example.simple_ecommerce;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DeatilProduct extends AppCompatActivity {
ImageView im;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deatil_product);
        getSupportActionBar().hide();
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
}