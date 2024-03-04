package com.hmyo.petbio;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ImageView kediImageView;
    ImageView kopekImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        kediImageView = (ImageView) findViewById(R.id.kediImageView);
        kopekImageView = (ImageView) findViewById(R.id.kopekImageView);

        kediImageView.setOnClickListener(this);
        kopekImageView.setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.kediImageView){
            Intent intent = new Intent(MainActivity.this, Bio.class);
            intent.putExtra("adi", "Jarvis");
            intent.putExtra("bio", "İnsanlara bayılır, oyun oynamayı sever ve çok hareketlidir");
            startActivity(intent);
        }else if(v.getId()==R.id.kopekImageView){
            Intent intent = new Intent(MainActivity.this, Bio.class);
            intent.putExtra("adi", "Tomy");
            intent.putExtra("bio", "En sevdiği yemek taze biftek, çok neşeli, oyuna bayılır");
            startActivity(intent);
        }
    }
}