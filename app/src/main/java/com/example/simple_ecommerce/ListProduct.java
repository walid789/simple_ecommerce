package com.example.simple_ecommerce;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ListProduct extends AppCompatActivity {
    public Button B,B1,B2,B3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_product);
        getSupportActionBar().hide();
        B=findViewById(R.id.viewProduct);
        B1=findViewById(R.id.viewProduct1);
        B2=findViewById(R.id.viewProduct2);
        B3=findViewById(R.id.viewProduct3);
        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendToDeatl();
            }
        });
        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendToDeatl();
            }
        });
        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendToDeatl();
            }
        });
        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendToDeatl();
            }
        });
    }
    private void sendToDeatl(){
        Intent intent = new Intent(ListProduct.this, DeatilProduct.class);
        startActivity(intent);

    }
}