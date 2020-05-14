package com.ramanuj.Mattdaan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class VotercardActivity extends AppCompatActivity {
    EditText vanNo;
    Button votersubmitbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_votercard);

        vanNo = (EditText) findViewById(R.id.pan_inpt);
        votersubmitbtn = (Button) findViewById(R.id.vc_btn);

        votersubmitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (vanNo.getText().toString().equals("ABC1234567")) {
                    Intent intent = new Intent(VotercardActivity.this, FingerprintActivity.class);
                    startActivity(intent);

                    Toast.makeText(VotercardActivity.this, "Success", Toast.LENGTH_SHORT).show();
                    finish();


                } else {
                    if (vanNo.getText().toString().equals("ABD1234567")) {
                        Intent intent = new Intent(VotercardActivity.this, FingerprintActivity.class);
                        startActivity(intent);

                        Toast.makeText(VotercardActivity.this, "Success", Toast.LENGTH_SHORT).show();
                        finish();


                    } else {
                        if (vanNo.getText().toString().equals("ABE1234567")) {
                            Intent intent = new Intent(VotercardActivity.this, FingerprintActivity.class);
                            startActivity(intent);

                            Toast.makeText(VotercardActivity.this, "Success", Toast.LENGTH_SHORT).show();
                            finish();


                        } else {
                            Toast.makeText(VotercardActivity.this, "Invalid Voter ID", Toast.LENGTH_SHORT).show();
                        }
                    }
                }

            }

            ;
        });
    }
    }
