package com.hmyo.petbio;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Bio extends AppCompatActivity {
    Bundle ekstralar;
    TextView adiTextView;
    TextView bioTextView;
    ImageView bioImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bio);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        adiTextView = (TextView) findViewById(R.id.baslikTextView) ;
        bioTextView = (TextView) findViewById(R.id.bioTextView);
        bioImageView = (ImageView) findViewById(R.id.bioImageView);
        ekstralar = getIntent().getExtras();




        if(ekstralar != null){
            String adiString = ekstralar.getString("adi");
            String bioString = ekstralar.getString("bio");

            adiTextView.setText(adiString);
            bioTextView.setText(bioString);

            if(adiString.equals("Jarvis")){
                bioImageView.setImageDrawable(getResources().getDrawable(R.drawable.icon_lg_cat));
            }
            if(adiString.equals("Tomy")){
                bioImageView.setImageDrawable(getResources().getDrawable(R.drawable.icon_lg_dog));
            }




        }


    }
}