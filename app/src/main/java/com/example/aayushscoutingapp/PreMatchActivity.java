package com.example.aayushscoutingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PreMatchActivity extends AppCompatActivity {
    
    public EditText teamNumber;
    public EditText matchNumber;
    public EditText scoutName;
    public Button sendButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sendButton = (Button) findViewById(R.id.screenOneEnterButton);

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                teamNumber = findViewById(R.id.enterTeamNumber);
                matchNumber = findViewById(R.id.enterMatchNumber);
                scoutName = findViewById(R.id.enterScoutName);

                int team = Integer.parseInt(((TextView) teamNumber).getText().toString());
                int match = Integer.parseInt(((TextView) matchNumber).getText().toString());
                String scout = ((TextView) scoutName).getText().toString();

                Bundle preMatchBundle = new Bundle();
                preMatchBundle.putInt("Robot Number", team);
                preMatchBundle.putInt("Match Number", match);
                preMatchBundle.putString("Scout Name", scout);

                Intent preMatchIntent = new Intent(PreMatchActivity.this, SandstormActivity.class);
                preMatchIntent.putExtras(preMatchBundle);
                startActivity(preMatchIntent);
            }
        });

    }

}
