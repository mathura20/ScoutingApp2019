package com.example.aayushscoutingapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;


public class SandstormActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sandstorm);

        final Counter csBalls = findViewById(R.id.csBalls);
        final Counter csHatches = findViewById(R.id.csHatches);

        final Counter r1Balls = findViewById(R.id.r1Cargo);
        final Counter r2Balls = findViewById(R.id.r2Cargo);
        final Counter r3Balls = findViewById(R.id.r3Cargo);

        final Counter r1Hatches = findViewById(R.id.r1Hatches);
        final Counter r2Hatches = findViewById(R.id.r2Hatches);
        final Counter r3Hatches = findViewById(R.id.r3Hatches);

        final Counter ballsPicked = findViewById(R.id.cPicked);
        final Counter hatchesPicked = findViewById(R.id.hPicked);

        final Button sendButton = (Button) findViewById(R.id.progressButton);

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Bundle sandstormBundle = new Bundle();
                sandstormBundle.putInt("csBalls", csBalls.getValue());
                sandstormBundle.putInt("csHatches", csHatches.getValue());

                sandstormBundle.putInt("r1Balls", r1Balls.getValue());
                sandstormBundle.putInt("r2Balls", r2Balls.getValue());
                sandstormBundle.putInt("r3Balls", r3Balls.getValue());

                sandstormBundle.putInt("r1Hatches", r1Hatches.getValue());
                sandstormBundle.putInt("r2Hatches", r2Hatches.getValue());
                sandstormBundle.putInt("r3Hatches", r3Hatches.getValue());

                sandstormBundle.putInt("ballsPicked", ballsPicked.getValue());
                sandstormBundle.putInt("hatchesPicked", hatchesPicked.getValue());

                Bundle preMatchBundle = getIntent().getExtras();
                Intent sandstormIntent = new Intent (SandstormActivity.this, TeleopActivity.class);
                sandstormIntent.putExtras(preMatchBundle);
                sandstormIntent.putExtras(sandstormBundle);
                startActivity(sandstormIntent);
            }

        });


    }

}
