package com.dispositivosmoviles.obligatorio.opticompras;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void verMapa(View v) {
        Intent intent = new Intent(v.getContext(), MapaActivity.class);
        startActivity(intent);
    }
}
