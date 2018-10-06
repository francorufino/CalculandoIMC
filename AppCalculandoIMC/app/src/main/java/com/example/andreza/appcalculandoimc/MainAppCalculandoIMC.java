package com.example.andreza.appcalculandoimc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainAppCalculandoIMC extends AppCompatActivity {
    private EditText pesoDigitado;
    private EditText alturaDigitada;
    private EditText sexoDigitado;
    private TextView texto;
    private Button botaoCalcularClicado;
    private Button botaoLimparClicado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_app_calculando_imc);

//        Toast.makeText(this, "Executando o metodo onCreate()", Toast.LENGTH_SHORT).show();
//        Log.e("primeiro app", "executando onCreate()");

        this.pesoDigitado = findViewById(R.id.peso_digitado_id);
        this.alturaDigitada = findViewById(R.id.altura_digitada_id);
        this.texto = findViewById(R.id.sexo_digitado_id);
        this.sexoDigitado = findViewById(R.id.sexo_digitado_id);
        this.botaoCalcularClicado = findViewById(R.id.botaoCalcularClicado_id);
        this.botaoLimparClicado = findViewById(R.id.botaoLimparClicado_id);

    }


//    @Override
//    protected void onStart() {
//        super.onStart();
//        Toast.makeText(this, "Executando o metodo onStart()", Toast.LENGTH_SHORT).show();
//        Log.e("primeiro app","Executando o metodo onStart()");
//    }
//
//
//    @Override
//    protected void onResume() {
//        super.onResume();
//        Log.e("primerio app", "exeutando o metodo onResume");
//        Toast.makeText(this, "executando o metodo onResume", Toast.LENGTH_SHORT).show();
//    }
//
//    @Override
//    protected void onPause() {
//        super.onPause();
//        Log.e("primeiro app", "executando o metodo onPause()");
//        Toast.makeText(this, "executando o metodo onPause()", Toast.LENGTH_SHORT).show();
//
//    }
//
//    @Override
//    protected void onStop() {
//        super.onStop();
//        Log.e("primeiro app", "executando o metodo onStop()");
//        Toast.makeText(this, "Executando o metodo onStop()", Toast.LENGTH_SHORT).show();
//
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        Log.e("primeiro app", "executando o metodo onDestroy()");
//        Toast.makeText(this, "Executando o metodo onDestroy()", Toast.LENGTH_SHORT).show();
//    }


    public void botaoCalcularClicado(View view) {
        float imc = 0F;
        float peso = Float.parseFloat(pesoDigitado.getText().toString());
        float altura = Float.parseFloat(alturaDigitada.getText().toString());
        String sexo = sexoDigitado.getText().toString();

        imc = peso / (altura * altura);

        if (sexoDigitado.getText() != null && alturaDigitada.getText() != null) {

            if (sexoDigitado.equals("m")) {
                if (imc < 15) {
                    Toast.makeText(this, "Resultado: Você está extremamente abaixo do peso ideal", Toast.LENGTH_LONG).show();

                } else if (imc == 15 || imc == 16) {
                    Toast.makeText(this, "Resultado: Você está muito abaixo do peso ideal", Toast.LENGTH_LONG).show();

                } else if (imc > 16 && imc < 18.5) {
                    Toast.makeText(this, "Resultado: Você está abaixo do peso ideal", Toast.LENGTH_LONG).show();

                } else if (imc >= 18.5 && imc <= 25) {
                    Toast.makeText(this, "Resultado: Você está no seu peso ideal", Toast.LENGTH_LONG).show();

                } else if (imc > 25 && imc < 30) {
                    Toast.makeText(this, "Resultado: Você está acima do peso ideal", Toast.LENGTH_LONG).show();

                } else if (imc >= 30 && imc <= 35) {
                    Toast.makeText(this, "Resultado: Você apresenta obesidade do grau 1", Toast.LENGTH_LONG).show();

                } else if (imc > 35 && imc < 40) {
                    Toast.makeText(this, "Resultado: Você apresenta obesidade do grau 2 (grave)", Toast.LENGTH_LONG).show();

                } else {
                    Toast.makeText(this, "Resultado: Você apresenta obesidade do grau 3 (mórbida)", Toast.LENGTH_LONG).show();

                }

                if (sexoDigitado.equals("f")) {
                    if (imc < 15) {
                        Toast.makeText(this, "Resultado: Você está extremamente abaixo do peso ideal", Toast.LENGTH_LONG).show();

                    } else if (imc == 15 || imc == 16) {
                        Toast.makeText(this, "Resultado: Você está muito abaixo do peso ideal", Toast.LENGTH_LONG).show();

                    } else if (imc > 16 && imc < 18.5) {
                        Toast.makeText(this, "Resultado: Você está abaixo do peso ideal", Toast.LENGTH_LONG).show();

                    } else if (imc >= 18.5 && imc <= 25) {
                        Toast.makeText(this, "Resultado: Você está no seu peso ideal", Toast.LENGTH_LONG).show();

                    } else if (imc > 25 && imc < 30) {
                        Toast.makeText(this, "Resultado: Você está acima do peso ideal", Toast.LENGTH_LONG).show();

                    } else if (imc >= 30 && imc <= 35) {
                        Toast.makeText(this, "Resultado: Você apresenta obesidade do grau 1", Toast.LENGTH_LONG).show();

                    } else if (imc > 35 && imc < 40) {
                        Toast.makeText(this, "Resultado: Você apresenta obesidade do grau 2 (grave)", Toast.LENGTH_LONG).show();

                    } else {
                        Toast.makeText(this, "Resultado: Você apresenta obesidade do grau 3 (mórbida)", Toast.LENGTH_LONG).show();

                    }
                }
            } else {
                Toast.makeText(this, "Você precisa preencher os dados para continuar", Toast.LENGTH_LONG).show();
            }

        }

        }
    public void botaoLimparClicado (View view){
        texto.setText("");
        sexoDigitado.setText("");
        alturaDigitada.setText("");
        pesoDigitado.setText("");
    }
}

