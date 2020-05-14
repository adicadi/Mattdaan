package com.ramanuj.Mattdaan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class PartyActivity extends AppCompatActivity {

    ImageButton bjpbtn;
    ImageButton aapbtn;
    ImageButton congressbtn;
    ImageButton notabtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_party);

        //Below are the buttons for party selection for voting with Toast notification that shows which party you voted for

        bjpbtn=(ImageButton) findViewById(R.id.bjp);
        bjpbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PartyActivity.this , "YOU VOTED FOR BJP" ,Toast.LENGTH_SHORT).show();

                Intent votedbjp = new Intent(getApplicationContext(), FinishActivity.class);
                startActivity(votedbjp);
                finish();

            }
        });
        aapbtn=(ImageButton) findViewById(R.id.aap);
        aapbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PartyActivity.this,  "YOU VOTED FOR AAP" ,Toast.LENGTH_SHORT).show();

                Intent votedaap = new Intent(getApplicationContext(), FinishActivity.class);
                startActivity(votedaap);
                finish();


            }
        });
        congressbtn=(ImageButton) findViewById(R.id.congress);
        congressbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PartyActivity.this,  "YOU VOTED FOR CONGRESS" ,Toast.LENGTH_SHORT).show();

                Intent votedcongress = new Intent(getApplicationContext(), FinishActivity.class);
                startActivity(votedcongress);
                finish();

            }
        });
        notabtn=(ImageButton) findViewById(R.id.nota);
        notabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(PartyActivity.this , "YOU VOTED FOR NOTA" ,Toast.LENGTH_SHORT).show();

                Intent votednota = new Intent(getApplicationContext(), FinishActivity.class);
                startActivity(votednota);
                finish();

            }
        });
    }
}
