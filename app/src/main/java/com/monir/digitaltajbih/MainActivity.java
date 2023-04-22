package com.monir.digitaltajbih;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //global variable
    int count = 0;
    TextView tvCount;
    Button buttonAdd, buttonSub, buttonReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //call by id

        tvCount = findViewById(R.id.tvCount);
        buttonAdd = findViewById(R.id.buttonAdd);
        buttonSub = findViewById(R.id.buttonSub);
        buttonReset = findViewById(R.id.buttonReset);

        //set onclick event

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "আল্লাহু আকবার", Toast.LENGTH_SHORT).show();
                count = count + 1;
                tvCount.setText(""+count);
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count != 0) {
                    Toast.makeText(MainActivity.this, "সুবাহানাল্লাহ", Toast.LENGTH_SHORT).show();
                    count = count - 1;
                    tvCount.setText(""+count);

                }
            }
        });

        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Thank you !", Toast.LENGTH_SHORT).show();
                count = 0;
                tvCount.setText(""+count);
            }
        });




    }
}