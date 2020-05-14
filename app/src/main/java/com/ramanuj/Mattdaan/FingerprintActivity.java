package com.ramanuj.Mattdaan;

import android.content.DialogInterface;
import android.content.Intent;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import static android.view.View.OnClickListener;

public class FingerprintActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fingerprint);

        final Executor executor= Executors.newSingleThreadExecutor();
        final BiometricPrompt biometricPrompt=new BiometricPrompt.Builder(this)

                //Fingerprint prompt details can be edited manually
                .setTitle("FINGERPRINT AUTHENTICATION")
                .setSubtitle("Authentication for voting")
                .setDescription("Your Fingerprint data will be recorded for security reasons")
                .setNegativeButton("Cancel", executor, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                }).build();
        ImageButton authenticate = findViewById(R.id.fingerprint_auth);

        final FingerprintActivity activity =  this;
        authenticate.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                biometricPrompt.authenticate(new CancellationSignal(), executor, new BiometricPrompt.AuthenticationCallback() {
                    @Override
                    public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult result) {
                        super.onAuthenticationSucceeded(result);
                        activity.runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                Toast.makeText(FingerprintActivity.this,"Authenticated",Toast.LENGTH_LONG).show();
                                Intent partyactivity=new Intent(FingerprintActivity.this,PartyActivity.class);
                                startActivity(partyactivity);
                                finish();

                            }
                        });
                    }
                });
            }
        });


    }
}

