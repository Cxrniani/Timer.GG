package com.example.timergg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Chronometer;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Timer;
import java.util.TimerTask;

public class StartScreen extends AppCompatActivity implements Chronometer.OnChronometerTickListener {

    private ImageView imgFTop, imgFJungle, imgFMid, imgFAdc, imgFSup, imgDragon, imgBaron;
    private TextView txtTop, txtJungle, txtMid, txtAdc, txtSup, txtDragon, txtBaron;
    private Chronometer tempoTop, tempoJungle, tempoMid, tempoAdc, tempoSup, tempoDragon, tempoBaron;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen);

        iniciarComponentes();

        Chronometer chronometer = findViewById(R.id.cronometro);
        chronometer.setOnChronometerTickListener(this);
        chronometer.start();


        imgFTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txtTop.setVisibility(View.INVISIBLE);
                tempoTop.setVisibility(View.VISIBLE);
                tempoTop.setBase(SystemClock.elapsedRealtime() + 30 * 10000);
                tempoTop.start();


            }
        });

        imgFJungle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txtJungle.setVisibility(View.INVISIBLE);
                tempoJungle.setVisibility(View.VISIBLE);
                tempoJungle.setBase(SystemClock.elapsedRealtime() + 30 * 10000);
                tempoJungle.start();


            }
        });
        imgFMid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txtMid.setVisibility(View.INVISIBLE);
                tempoMid.setVisibility(View.VISIBLE);
                tempoMid.setBase(SystemClock.elapsedRealtime() + 30 * 10000);
                tempoMid.start();


            }
        });

        imgFAdc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txtAdc.setVisibility(View.INVISIBLE);
                tempoAdc.setVisibility(View.VISIBLE);
                tempoAdc.setBase(SystemClock.elapsedRealtime() + 30 * 10000);
                tempoAdc.start();


            }
        });

        imgFSup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txtSup.setVisibility(View.INVISIBLE);
                tempoSup.setVisibility(View.VISIBLE);
                tempoSup.setBase(SystemClock.elapsedRealtime() + 30 * 10000);
                tempoSup.start();


            }
        });

        imgFSup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txtSup.setVisibility(View.INVISIBLE);
                tempoSup.setVisibility(View.VISIBLE);
                tempoSup.setBase(SystemClock.elapsedRealtime() + 30 * 10000);
                tempoSup.start();


            }
        });

        imgDragon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txtDragon.setVisibility(View.INVISIBLE);
                tempoDragon.setVisibility(View.VISIBLE);
                tempoDragon.setBase(SystemClock.elapsedRealtime() + 30 * 10000);
                tempoDragon.start();


            }
        });

        imgBaron.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                txtBaron.setVisibility(View.INVISIBLE);
                tempoBaron.setVisibility(View.VISIBLE);
                tempoBaron.setBase(SystemClock.elapsedRealtime() + 30 * 10000);
                tempoBaron.start();


            }
        });





    }


    @Override
    public void onChronometerTick(Chronometer chronometer) {
        if ("00:00".equals(chronometer.getText())) {
            // Create Intent and start the new Activity here
            TextView txtAlerta = findViewById(R.id.textAlertaTemporizador);
            txtAlerta.setText("Protect jungle entry");
        }
        if ("01:20".equals(chronometer.getText())) {
            // Create Intent and start the new Activity here
            TextView txtAlerta = findViewById(R.id.textAlertaTemporizador);
            txtAlerta.setText("Buff spawns in 10 secs");
        }
        if ("01:30".equals(chronometer.getText())) {
            // Create Intent and start the new Activity here
            TextView txtAlerta = findViewById(R.id.textAlertaTemporizador);
            txtAlerta.setText("Leash until 01:38 MAX (if the jungler starts on your side)");
        }
        if ("01:38".equals(chronometer.getText())) {
            // Create Intent and start the new Activity here
            TextView txtAlerta = findViewById(R.id.textAlertaTemporizador);
            txtAlerta.setText("Stop leash and go farm");
        }
        if ("02:55".equals(chronometer.getText())) {
            // Create Intent and start the new Activity here
            TextView txtAlerta = findViewById(R.id.textAlertaTemporizador);
            txtAlerta.setText("Beware the gank");
        }
        if ("03:15".equals(chronometer.getText())) {
            // Create Intent and start the new Activity here
            TextView txtAlerta = findViewById(R.id.textAlertaTemporizador);
            txtAlerta.setText("if you do not leashed, help the jungler in the scuttle");
        }
        if ("03:30".equals(chronometer.getText())) {
            // Create Intent and start the new Activity here
            TextView txtAlerta = findViewById(R.id.textAlertaTemporizador);
            txtAlerta.setText("Beware the gank");
        }
        if ("06:30".equals(chronometer.getText())) {
            // Create Intent and start the new Activity here
            TextView txtAlerta = findViewById(R.id.textAlertaTemporizador);
            txtAlerta.setText("Enemy first buff spawning in about 00:15");
        }
        if ("06:45".equals(chronometer.getText())) {
            // Create Intent and start the new Activity here
            TextView txtAlerta = findViewById(R.id.textAlertaTemporizador);
            txtAlerta.setText("Enemy first buff spawned");
        }
        if ("06:55".equals(chronometer.getText())) {
            // Create Intent and start the new Activity here
            TextView txtAlerta = findViewById(R.id.textAlertaTemporizador);
            txtAlerta.setText("Beware the gank");
        }
        if ("00:00".equals(tempoTop.getText())) {

            tempoTop.setVisibility(View.INVISIBLE);
            tempoTop.stop();
            txtTop.setVisibility(View.VISIBLE);

        }
        if ("00:00".equals(tempoJungle.getText())) {

            tempoJungle.setVisibility(View.INVISIBLE);
            tempoJungle.stop();
            txtJungle.setVisibility(View.VISIBLE);

        }
        if ("00:00".equals(tempoMid.getText())) {

            tempoMid.setVisibility(View.INVISIBLE);
            tempoMid.stop();
            txtMid.setVisibility(View.VISIBLE);

        }
        if ("00:00".equals(tempoAdc.getText())) {

            tempoAdc.setVisibility(View.INVISIBLE);
            tempoAdc.stop();
            txtAdc.setVisibility(View.VISIBLE);

        }
        if ("00:00".equals(tempoSup.getText())) {

            tempoSup.setVisibility(View.INVISIBLE);
            tempoSup.stop();
            txtSup.setVisibility(View.VISIBLE);

        }
        if ("00:00".equals(tempoDragon.getText())) {

            tempoDragon.setVisibility(View.INVISIBLE);
            tempoDragon.stop();
            txtDragon.setVisibility(View.VISIBLE);

        }
        if ("00:00".equals(tempoBaron.getText())) {

            tempoBaron.setVisibility(View.INVISIBLE);
            tempoBaron.stop();
            txtBaron.setVisibility(View.VISIBLE);

        }
    }

    private void iniciarComponentes(){
        imgFTop = findViewById(R.id.flashTop);
        imgFJungle = findViewById(R.id.flashJungle);
        imgFMid = findViewById(R.id.flashMid);
        imgFAdc = findViewById(R.id.flashAdc);
        imgFSup = findViewById(R.id.flashSup);
        imgDragon = findViewById(R.id.dragon);
        imgBaron = findViewById(R.id.baron);
        txtTop = findViewById(R.id.txtFTop);
        txtJungle = findViewById(R.id.txtFJungle);
        txtMid = findViewById(R.id.txtFMid);
        txtAdc = findViewById(R.id.txtFAdc);
        txtSup = findViewById(R.id.txtFSup);
        txtDragon = findViewById(R.id.txtDragon);
        txtBaron = findViewById(R.id.txtBaron);
        tempoTop = findViewById(R.id.tempoFTop);
        tempoJungle = findViewById(R.id.tempoFJungle);
        tempoMid = findViewById(R.id.tempoFMid);
        tempoAdc = findViewById(R.id.tempoFAdc);
        tempoSup = findViewById(R.id.tempoFSup);
        tempoDragon = findViewById(R.id.tempoDragon);
        tempoBaron = findViewById(R.id.tempoBaron);


    }
}