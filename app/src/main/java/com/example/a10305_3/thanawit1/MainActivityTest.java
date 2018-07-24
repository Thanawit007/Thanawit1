package com.example.a10305_3.thanawit1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FilterQueryProvider;
import android.widget.RadioGroup;

public class MainActivityTest extends AppCompatActivity {
    private EditText editText;
    private Button button;
    private RadioGroup radioGroup;
    private String strTemperature;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_test);

        button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivityTest.this,ResultActivity.class);
                startActivity(intent);

                try {

                    strTemperature = editText.getText().toString().trim();
                    if (strTemperature.equals("")){
                        Log.d("Testttttt", "Have space in blank");
                    } else {
                        Log.d("Testttttt", "No spce = " +strTemperature);


                        Intent intent1 = new Intent(MainActivityTest.this,ResultActivity.class);
                        startActivity(intent);
                    }


                } catch (Exception e){

                }







            }
        });

    }
}