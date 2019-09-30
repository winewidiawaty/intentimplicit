package com.example.intentsimplicit;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

import androidx.appcompat.app.AppCompatActivity;

public class implicitintens extends AppCompatActivity {

    Button browse;
    Button contact;

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layar1);
        browse=findViewById(R.id.button1);
        contact=findViewById(R.id.button2);

        browse.setOnClickListener(new OnClickListener(){
            public void onClick(View v){
                Uri uriUrl=Uri.parse("http://www.google.com");
                Intent browse_intent=new Intent(Intent.ACTION_VIEW, uriUrl);

                startActivity(browse_intent);
            }
        });

        contact.setOnClickListener(new OnClickListener(){
            public void onClick(View v){
                String nomor="087823654799";
                Intent panggil= new Intent(Intent.ACTION_DIAL);
                panggil.setData(Uri.fromParts("tel",nomor,null));
                startActivity(panggil);
            }
        });
    }
}
