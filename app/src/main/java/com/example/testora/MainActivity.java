package com.example.testora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "TAG";
    Persoana[] person = new Persoana[100];
    Spinner spinner;
    TextView txt;
    EditText eNume,eVarsta,eSpecial1,eSpecial2,eVechime;
    Button btn;
    int counter = 0;
    int ceva=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner=findViewById(R.id.spinner);
        txt=findViewById(R.id.textView);
        btn=findViewById(R.id.button);
        eNume=findViewById(R.id.editTextTextPersonName);
        eVarsta=findViewById(R.id.editTextTextPersonName2);
        eSpecial1=findViewById(R.id.editTextTextPersonName3);
        eSpecial2=findViewById(R.id.editTextTextPersonName4);
        eVechime=findViewById(R.id.editTextTextPersonName5);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    if(i==0){
                        txt.setText("");
                        ceva=0;
                        eSpecial1.setText("Numar Cazuri");
                        eSpecial2.setText("Pacienti");
                        if(counter>=1){
                            for(int j=0;j<counter;j++){
                                if(person[j] instanceof Doctor){
                                    txt.setText(txt.getText().toString()+((Doctor)person[j]).nume+" "+((Doctor)person[j]).varsta+" "+((Doctor)person[j]).nr_cazuri+" "+((Doctor)person[j]).pacienti+" "+((Doctor)person[j]).vechime+"\n");
                                }
                            }
                        }
                    }
                if(i==1){
                    ceva=1;
                    txt.setText("");
                    eSpecial1.setText("barou");
                    eSpecial2.setText("numeCaz");
                    if(counter>=1){
                        for(int j=0;j<counter;j++){
                            if(person[j] instanceof Avocat){
                                txt.setText(txt.getText().toString()+((Avocat)person[j]).nume+" "+((Avocat)person[j]).varsta+" "+((Avocat)person[j]).barou+" "+((Avocat)person[j]).numeCaz+" "+((Avocat)person[j]).vechime+"\n");
                            }
                        }
                    }
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                ceva=0;
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(int i=0;i<counter;i++){
                    Log.d("TAG","abcd => "+ person[i].nume+" "+person[i].varsta+" ");
                }
                if(ceva==0){
                    person[counter]=new Doctor(eNume.getText().toString(),eVarsta.getText().toString(),eSpecial1.getText().toString(),eSpecial2.getText().toString(),eVechime.getText().toString());
                    counter++;

                }else{
                    person[counter]=new Avocat(eNume.getText().toString(),eVarsta.getText().toString(),eSpecial1.getText().toString(),eSpecial2.getText().toString(),eVechime.getText().toString());
                    counter++;
                }
            }
        });
    }
}