package com.ramanuj.Mattdaan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AadharcardActivity extends AppCompatActivity {
    EditText aadharNo;
    Button aadharsubmitbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aadharcard);

        aadharNo = (EditText) findViewById(R.id.aadhar_inpt);
        aadharsubmitbtn = (Button) findViewById(R.id.ac_btn);

        aadharsubmitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (aadharNo.getText().toString().equals("123456789014")) {
                    Intent intent = new Intent(AadharcardActivity.this, FingerprintActivity.class);
                    startActivity(intent);
                    Toast.makeText(AadharcardActivity.this, "Success", Toast.LENGTH_SHORT).show();
                    finish();


                } else {
                    if (aadharNo.getText().toString().equals("123456789013")) {
                        Intent intent = new Intent(AadharcardActivity.this, FingerprintActivity.class);
                        startActivity(intent);

                        Toast.makeText(AadharcardActivity.this, "Success", Toast.LENGTH_SHORT).show();
                        finish();

                    } else {
                        if (aadharNo.getText().toString().equals("123456789012")) {
                            Intent intent = new Intent(AadharcardActivity.this, FingerprintActivity.class);
                            startActivity(intent);

                            Toast.makeText(AadharcardActivity.this, "Success", Toast.LENGTH_SHORT).show();
                            finish();

                        } else {
                            Toast.makeText(AadharcardActivity.this, "Invalid Aadhar number", Toast.LENGTH_SHORT).show();
                        }
                    }
                }

            }

            ;
        });
    }
}
