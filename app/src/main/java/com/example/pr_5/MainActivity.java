package com.example.pr_5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void OnApple(View v){
        Button Apple = findViewById(R.id.Btn_Apples);
        Intent intent = new Intent(this, AppleActivity.class);
        Apple.setOnClickListener(view->{
            startActivity(intent);
        });

    }
    public void OnPotatoes(View v){
        Button Potato = findViewById(R.id.Btn_Potatoes);
        Intent intent = new Intent(this, PotatoesActivity.class);
        Potato.setOnClickListener(view->{
            startActivity(intent);
        });
    }
    public void OnCucumber(View v){
        Button Cucumber = findViewById(R.id.Btn_Cucumber);
        Intent intent = new Intent(this, CucumberActivity.class);
        Cucumber.setOnClickListener(view->{
            startActivity(intent);
        });
    }
    public void OnBread(View v){
        Button Bread = findViewById(R.id.Btn_Bread);
        Intent intent = new Intent(this, BreadActivity.class);
        Bread.setOnClickListener(view->{
            startActivity(intent);
        });
    }
    public void OnPasta(View v){
        Button Pasta = findViewById(R.id.Btn_Pasta);
        Intent intent = new Intent(this, PastaActivity.class);
        Pasta.setOnClickListener(view->{
            startActivity(intent);
        });
    }
    public void OnMilk(View v){
        Button Milk = findViewById(R.id.Btn_Milk);
        Intent intent = new Intent(this, MilkActivity.class);
        Milk.setOnClickListener(view->{
            startActivity(intent);
        });
    }
    public void OnTomatoes(View v){
        Button Tomato = findViewById(R.id.Btn_Tomatoes);
        Intent intent = new Intent(this, TomatoesActivity.class);
        Tomato.setOnClickListener(view->{
            startActivity(intent);
        });
    }
    public void OnBananas(View v){
        Button Banana = findViewById(R.id.Btn_Bananas);
        Intent intent = new Intent(this, BananasActivity.class);
        Banana.setOnClickListener(view->{
            startActivity(intent);
        });
    }
}