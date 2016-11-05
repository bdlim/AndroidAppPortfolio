package com.brandondlim.myappportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button popularMovies = (Button) findViewById(R.id.popular_movies);
        Button stockHawk = (Button) findViewById(R.id.stock_hawk);
        Button buildItBigger = (Button) findViewById(R.id.build_it_bigger);
        Button makeYourAppMaterial = (Button) findViewById(R.id.make_your_app_material);
        Button goUbiquitous = (Button) findViewById(R.id.go_ubiquitous);
        Button capstone = (Button) findViewById(R.id.capstone);

        popularMovies.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence text = "Popular Movies Pressed";
                buttonPressed(text);
            }
        });

        stockHawk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence text = "Stock Hawk Pressed";
                buttonPressed(text);
            }
        });

        buildItBigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence text = "Build It Bigger Pressed";
                buttonPressed(text);
            }
        });

        makeYourAppMaterial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence text = "Make Your App Material Pressed";
                buttonPressed(text);
            }
        });

        goUbiquitous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence text = "Go Ubiquitous Pressed";
                buttonPressed(text);
            }
        });

        capstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence text = "Capstone Pressed";
                buttonPressed(text);
            }
        });



    }

    public void buttonPressed(CharSequence text) {
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(this, text, duration);
        toast.show();
    }

}
