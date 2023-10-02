package com.example.unitconvertor;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity_distance extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    EditText input;
    Spinner spinner;
    TextView result;
    Button b;
    double val=0;
    double out=0;

    String ops="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_distance);
        input = findViewById(R.id.input);
        spinner = findViewById(R.id.spinner);
        result = findViewById(R.id.result);
        b = findViewById(R.id.convert);
        spinner.setSelection(0);
        Log.d("item",spinner.getSelectedItem().toString());

        spinner.setOnItemSelectedListener(this);



        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                init();

                String v = String.format("%.2f",out);
                if(!v.equals("0.00"))
                    result.setText(v+" "+ops);


            }
        });
    }

    public void init(){
        String in = spinner.getSelectedItem().toString();
        String inputString = input.getText().toString();
        if(!input.getText().toString().equals("")){
            val = Double.parseDouble(inputString);

            if(in.equals("KM TO M")){
                out = val * 1000;
                ops = "Metres";

            }else if(in.equals("M TO KM")){
                out = val / 1000;
                ops = "kilometre";
            }
            else if(in.equals("MILES TO KM")){
                out = val * 1.61;
                ops = "Kilometre";
            }
            else if(in.equals("KM TO MILES")){
                out = val / 1.61;
                ops = "Miles";
            }
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String in = spinner.getSelectedItem().toString();
        String inputString = input.getText().toString();
        if(!input.getText().toString().equals("")){
            val = Double.parseDouble(inputString);

            if(in.equals("KM TO M")){
                out = val * 1000;
                ops = "Metres";

            }else if(in.equals("M TO KM")){
                out = val / 1000;
                ops = "kilometre";
            }
            else if(in.equals("MILES TO KM")){
                out = val * 1.61;
                ops = "Kilometre";
            }
            else if(in.equals("KM TO MILES")){
                out = val / 1.61;
                ops = "Miles";
            }
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}