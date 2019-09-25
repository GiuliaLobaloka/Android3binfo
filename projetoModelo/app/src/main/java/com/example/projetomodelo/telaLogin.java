package com.example.projetomodelo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class telaLogin extends AppCompatActivity {

    Button btnLogar;
    Button btnSair;
    Button btnCadastrar;

   EditText edtSenha;
   EditText edtUsuario;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        inicializarObjeto();
        abrirActivityMenu();
        setContentView(R.layout.activity_tela_login);
    }



    public void inicializarObjeto(){
        btnLogar= (Button) findViewById(R.id.btnLogar);
        btnSair= (Button) findViewById(R.id.btnSair);
        btnCadastrar= (Button) findViewById(R.id.btnCadastrar);
        edtSenha = (EditText) findViewById(R.id.edtSenha);
        edtUsuario = (EditText) findViewById(R.id.edtUsuario);
    }


    private void abrirActivityMenu(){
        btnLogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentActivityMenu = new Intent(getApplicationContext(), telaMenu.class);
                startActivity(intentActivityMenu);
            }
        });




    }
}
