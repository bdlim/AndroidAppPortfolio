package com.brandondlim.myappportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void buttonPressed(View view) {
        int duration = Toast.LENGTH_SHORT;
        CharSequence text;

        switch(view.getId()) {
            case R.id.popular_movies:
                text = "Popular Movies Pressed";
                break;
            case R.id.stock_hawk:
                text = "Stock Hawk Pressed";
                break;
            case R.id.build_it_bigger:
                text = "Build It Bigger Pressed";
                break;
            case R.id.make_your_app_material:
                text = "Make Your App Pressed";
                break;
            case R.id.go_ubiquitous:
                text = "Go Ubiquitous Pressed";
                break;
            case R.id.capstone:
                text = "Capstone Pressed";
                break;
            default:
                text = "No Text Set";
                break;
        }

        Toast toast = Toast.makeText(this, text, duration);
        toast.show();
    }

}
