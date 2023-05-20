package com.haman.skyrimcalculator;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View v) {
        String msg = "";
        switch (v.getTag().toString()) {
            case "Smithing":
                msg = "You pressed the Smithing Button.";
                break;
            case "Skills":
                Intent intent = new Intent(this, SkillsActivity.class);
                startActivity(intent);
                break;
            case "Alchemy":
                msg = "You pressed the Alchemy Button.";
                break;
        }
        Log.d("D", msg);
    }
}