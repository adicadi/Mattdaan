package com.ramanuj.Mattdaan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PancardActivity extends AppCompatActivity {
    EditText panNo;
    Button pansubmitbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pancard);

        panNo = (EditText) findViewById(R.id.pan_inpt);
        pansubmitbtn = (Button) findViewById(R.id.pc_btn);

        pansubmitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (panNo.getText().toString().equals("ABCDE1234F")) {
                    Intent intent = new Intent(PancardActivity.this, FingerprintActivity.class);
                    startActivity(intent);
                    Toast.makeText(PancardActivity.this, "Success", Toast.LENGTH_SHORT).show();
                    finish();

                } else {
                    if (panNo.getText().toString().equals("ABCDE1234G")) {
                        Intent intent = new Intent(PancardActivity.this, FingerprintActivity.class);
                        startActivity(intent);

                        Toast.makeText(PancardActivity.this, "Success", Toast.LENGTH_SHORT).show();
                        finish();

                    } else {
                        if (panNo.getText().toString().equals("ABCDE1234H")) {
                            Intent intent = new Intent(PancardActivity.this, FingerprintActivity.class);
                            startActivity(intent);

                            Toast.makeText(PancardActivity.this, "Success", Toast.LENGTH_SHORT).show();
                            finish();

                        } else {
                            Toast.makeText(PancardActivity.this, "Invalid PAN number", Toast.LENGTH_SHORT).show();
                        }
                    }
                }

            }

            ;
        });
    }
}
