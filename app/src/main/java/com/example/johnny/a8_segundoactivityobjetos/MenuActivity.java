package com.example.johnny.a8_segundoactivityobjetos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {

    TextView lblSaludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        lblSaludo = (TextView) findViewById(R.id.lblSaludo);


        Bundle bundle = getIntent().getExtras();
        ClsUsuario usuario = (ClsUsuario) bundle.getSerializable("usuario");

        lblSaludo.setText("Hola Sr(a) " +usuario.getUsuario()+ ", su password es: " +usuario.getPassword());
    }
}
