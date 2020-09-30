package com.ramanuj.Mattdaan;

import androidx.appcompat.app.AppCompatActivity;
import java
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageButton votercardButton;
    ImageButton aadharcardButton;
    ImageButton pancardButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Voterid card button for Voterid selection
        votercardButton=(ImageButton) findViewById(R.id.voter_btn);
        votercardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this , "VoterCard Selected" ,Toast.LENGTH_SHORT).show();

                Intent Votercard = new Intent(getApplicationContext(), VotercardActivity.class);
                startActivity(Votercard);
                finish();

            }
        });

        //Aadhar card button for Aadharcard selection
        aadharcardButton=(ImageButton) findViewById(R.id.aadhar_btn);
        aadharcardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,  "AadharCard Selected" ,Toast.LENGTH_SHORT).show();

                Intent Aadharcard = new Intent(getApplicationContext(), AadharcardActivity.class);
                startActivity(Aadharcard);
                finish();


            }
        });

        //Pancard button for Aadharcard selection
        pancardButton=(ImageButton) findViewById(R.id.pan_btn);
        pancardButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,  "PanCard Selected" ,Toast.LENGTH_SHORT).show();

                Intent Pancard = new Intent(getApplicationContext(), PancardActivity.class);
                startActivity(Pancard);
                finish();

            }
        });
    }
}
