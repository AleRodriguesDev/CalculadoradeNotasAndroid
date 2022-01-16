package com.ale.calculadoradenotas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText n1, n2, n3, n4, numeroFaltas;
    private Button btnCalcular;
    private TextView txtResultado;

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1 = findViewById(R.id.nota1);
        n2 = findViewById(R.id.nota2);
        n3 = findViewById(R.id.nota3);
        n4 = findViewById(R.id.nota4);
        String test = "";
        numeroFaltas = findViewById(R.id.numerodeFaltas);
        btnCalcular = findViewById(R.id.bt_calcular);
        txtResultado = findViewById(R.id.txt_result);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int nota1 = Integer.parseInt(n1.getText().toString());
                int nota2 = Integer.parseInt(n2.getText().toString());
                int nota3 = Integer.parseInt(n3.getText().toString());
                int nota4 = Integer.parseInt(n4.getText().toString());
                int numero_Faltas = Integer.parseInt(numeroFaltas.getText().toString());
                int media = (nota1 + nota2 + nota3 + nota4) /4;


                if(media >= 5 && numero_Faltas <= 20){
                    txtResultado.setText("Aluno foi Aprovado!\n" + "Média final: " + media);
                    txtResultado.setTextColor(getColor(R.color.green));
                }else if(numero_Faltas > 20){
                    txtResultado.setText("Aluno foi reprovado por faltas!\n" + "Média final: " + media);
                    txtResultado.setTextColor(getColor(R.color.red));
                }else if(media < 5){
                txtResultado.setText("Aluno foi reprovado por nota!\n" + "Média final: " + media);
                txtResultado.setTextColor(getColor(R.color.red));
                }
                /*else if (){
                 txtResultado.setText("Digite alguma nota");
                 txtResultado.setTextColor(getColor(R.color.red));
                }*/
            }
        });
    }
}