package com.example.teste2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

     Button bt_calcular ;
     Button bt_limpar;
     EditText lb_numero;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt_calcular = (Button) findViewById(R.id.bt_calcular);
        bt_calcular.setOnClickListener(this);
        bt_limpar = (Button) findViewById(R.id.bt_limpar);
        bt_limpar.setOnClickListener(this);

        lb_numero = (EditText) findViewById(R.id.lb_numero);

    }



    @Override
    public void onClick(View v) {

        if(v.getId()== R.id.bt_calcular) {

            AlertDialog.Builder msgdocalc = new AlertDialog.Builder(MainActivity.this);
            msgdocalc.setTitle("Resultado do calculo");


            try {

                String valorString = lb_numero.getText().toString();
                long n1 = Long.parseLong(valorString);


                if (n1 <= 0) {

                    msgdocalc.setMessage("Você não está doido !! Pode voltar e por um valor decente ");
                } else if (n1 > 0 && n1 <= 5) {
                    msgdocalc.setMessage("Ainda está muito pouco !! Pode fazer de novo !");
                } else if (n1 > 5 && n1 <= 10) {
                    msgdocalc.setMessage("Eu te amo mais !!");
                } else if (n1 > 10 && n1 <= 100) {
                    msgdocalc.setMessage("Seu amor pode até ser grande ,mas eu ainda te amo mais !!");
                } else if (n1 > 100) {
                    msgdocalc.setMessage("Boa tentativa ,mas seu(a) namorado(a) ainda te amo muito mais !!");
                }

            } catch (Exception e) {
                msgdocalc.setMessage("Nâo adianta apelar ,eu ainda te amo mais !!!!!");
            }
            msgdocalc.show().create();

        } else if (v.getId() == R.id.bt_limpar) {

            lb_numero.getText().clear();

        }

    }
}