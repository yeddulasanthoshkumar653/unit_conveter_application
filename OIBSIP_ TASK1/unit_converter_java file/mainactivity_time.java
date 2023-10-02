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

public class MainActivity_time extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    EditText input;
    Spinner spinner;
    TextView result;
    Button b;
    int val=0;
    int out=0;

    String ops="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_time);
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


                if(out!=0)
                    result.setText(out+" "+ops);


            }
        });





    }




    public void init(){
        String in = spinner.getSelectedItem().toString();
        String inputString = input.getText().toString();
        if(!input.getText().toString().equals("")){
            val = Integer.parseInt(inputString);

            if(in.equals("SECONDS TO HOURS")){
                out = val / 3600;
                ops = "Hour";

            }else if(in.equals("MINUTES TO HOURS")){
                out = val /60;
                ops = "Hour";
            }
            else if(in.equals("HOURS TO SECONDS")){
                out = val*3600;
                ops = "SECONDS";
            }
            else if(in.equals("HOURS TO MINUTES")){
                out = val *60;
                ops = "MINUTES";
            }
        }
    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String in = spinner.getSelectedItem().toString();
        String inputString = input.getText().toString();

        if(!input.getText().toString().equals("")){
            val = Integer.parseInt(inputString);

            if(in.equals("SECONDS TO HOURS")){
                out = val / 3600;
                ops = "Hour";

            }else if(in.equals("MINUTES TO HOURS")){
                out = val /60;
                ops = "Hour";
            }
            else if(in.equals("HOURS TO SECONDS")){
                out = val*3600;
                ops = "SECONDS";
            }
            else if(in.equals("HOURS TO MINUTES")){
                out = val *60;
                ops = "MINUTES";
            }
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

}