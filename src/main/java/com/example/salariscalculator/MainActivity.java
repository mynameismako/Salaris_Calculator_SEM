package com.example.salariscalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnResultaat = (Button) findViewById(R.id.btnResultaat);
        btnResultaat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Go to another page
                //openActivity2();

                //Getting Button to Function (Edit Text)
                EditText uurLoon = (EditText) findViewById(R.id.uurLoon);
                EditText aantalUren = (EditText) findViewById(R.id.aantalUren);
                EditText weekOverUren = (EditText) findViewById(R.id.weekOverUren);
                EditText zaterdagUren = (EditText) findViewById(R.id.zaterdagUren);
                EditText zaterdagOverUren = (EditText) findViewById(R.id.zaterdagOverUren);
                EditText zondagUren = (EditText) findViewById(R.id.zondagUren);
                EditText zwampToelagen = (EditText) findViewById(R.id.zwampToelagen);

                //Text View
                TextView normaleLoon1 = (TextView) findViewById(R.id.normaleLoon1);
                TextView weekOverUren1 = (TextView) findViewById(R.id.weekOverUren1);
                TextView zaterdagUren1 = (TextView) findViewById(R.id.zaterdagUren1);
                TextView zaterdagOverUren1 = (TextView) findViewById(R.id.zaterdagOverUren1);
                TextView zondagUren1 = (TextView) findViewById(R.id.zondagUren1);
                TextView zwampToelagen1 = (TextView) findViewById(R.id.zwampToelagen1);
                TextView brutoSaldo = (TextView) findViewById(R.id.brutoSaldo);
                TextView subTotaal1 = (TextView) findViewById(R.id.subTotaal1);

                //TextField Integer convert to String
                double num1 = Double.parseDouble(uurLoon.getText().toString());
                double num2 = Double.parseDouble(aantalUren.getText().toString());
                double num3 = Double.parseDouble(weekOverUren.getText().toString());
                double num4 = Double.parseDouble(zaterdagUren.getText().toString());
                double num5 = Double.parseDouble(zaterdagOverUren.getText().toString());
                double num6 = Double.parseDouble(zondagUren.getText().toString());
                double num7 = Double.parseDouble(zwampToelagen.getText().toString());
                double num8 = Double.parseDouble(brutoSaldo.getText().toString());
                double num9 = (double) 1.50;
                double num10 = (double) 2;
                double num11 = (double) 3;

                //Giving the operator a math function

                //Normale Loon function
                double normaleLoon2 = num1 * num2;
                normaleLoon1.setText("Normale loon: " + "SRD " + normaleLoon2);

                //Door de week overuren loon function
                double weekOverUren2 = num1 * num3 * num9;
                weekOverUren1.setText("Normale overuur: " + "SRD " + weekOverUren2);

                //Zaterdag Loon function
                double zaterdagUren2 = num1 * num4 * num9;
                zaterdagUren1.setText("Zaterdag loon: " + "SRD " + zaterdagUren2);

                //zaterdag overuren function
                double zaterdagOverUren2 = num1 * num5 * num10;
                zaterdagOverUren1.setText("Zaterdag overuur: " + "SRD " + zaterdagOverUren2);

                //Zondag Loon function
                double zondagUren2 = num1 * num6 * num11;
                zondagUren1.setText("Zondag loon: " + "SRD " + zondagUren2);

                /*
                double brutoSaldo2 = normaleLoon2 + weekOverUren2 + zaterdagUren2 + zaterdagOverUren2 + zondagUren2;
                brutoSaldo.setText("Bruto Saldo: " + "SRD " + brutoSaldo2);


                //Zwamp Toelagen function
                double zwampToelagen2 = num8 * num7;
                zwampToelagen1.setText("Zwamp toelagen: " + "SRD " + zwampToelagen2);

                //Subtotaal function
                double subTotaal = zwampToelagen2 + brutoSaldo2;
                subTotaal1.setText("SubTotaal: " + "SRD " + subTotaal);*/

            }
        });
    }
}
    /*
    public void openActivity2(){
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }
}
*/
