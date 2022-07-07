package com.example.diceroller;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    int random;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView= findViewById(R.id.imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.animate().rotationXBy(360);
                random = generateRandom();

                displayImage(imageView,random);
            }
        });
    }

    private void displayImage(ImageView imageView, int random){
        switch (random){
            case 1:
                imageView.setImageResource(R.drawable.dice1);
                Toast.makeText(this,random+"", Toast.LENGTH_SHORT).show();
                break;
            case 2:
                imageView.setImageResource(R.drawable.dice2);
                Toast.makeText(this,random+"", Toast.LENGTH_SHORT).show();
                break;
            case 3:
                imageView.setImageResource(R.drawable.dice3);
                Toast.makeText(this,random+"", Toast.LENGTH_SHORT).show();
                break;
            case 4:
                imageView.setImageResource(R.drawable.dice4);
                Toast.makeText(this,random+"", Toast.LENGTH_SHORT).show();
                break;
            case 5:
                imageView.setImageResource(R.drawable.dice5);
                Toast.makeText(this,random+"", Toast.LENGTH_SHORT).show();
                break;
            case 6:
                imageView.setImageResource(R.drawable.dice6);
                Toast.makeText(this,random+"", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }
    public int generateRandom(){
        return (int)Math.ceil(Math.random()*6);
    }
}