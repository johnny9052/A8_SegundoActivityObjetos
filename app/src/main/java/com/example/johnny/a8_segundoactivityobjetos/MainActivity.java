package com.example.johnny.a8_segundoactivityobjetos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtUsuario;
    EditText txtPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtUsuario = (EditText) findViewById(R.id.txtNombre);
        txtPassword = (EditText) findViewById(R.id.txtPassword);
    }


    public void validar(View view) {
        String usuario = txtUsuario.getText().toString();
        String password = txtPassword.getText().toString();

        if (!usuario.equals("") && !password.equals("")) {

            ClsUsuario login = new ClsUsuario(usuario, password);

            Intent intent = new Intent(this, MenuActivity.class);
            intent.putExtra("usuario", login);
            startActivity(intent);
        }else{
            Toast.makeText(getApplicationContext(),
                    "Ingrese los datos solicitados", Toast.LENGTH_SHORT).show();
        }
    }
}
