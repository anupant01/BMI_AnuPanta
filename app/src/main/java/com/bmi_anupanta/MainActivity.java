package com.bmi_anupanta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etheight, etweight,etbmi;
    Button btncompute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        etheight= findViewById(R.id.etheight);
        etweight= findViewById(R.id.etweight);
        btncompute=findViewById(R.id.btnCompute);
        etbmi=findViewById(R.id.etBMI);


        btncompute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    double height,weight, result;

                    height=Double.parseDouble(etheight.getText().toString());
                    weight=Double.parseDouble(etweight.getText().toString());


                    BMI_AnuPanta calculate = new BMI_AnuPanta(height,weight);
                    result = calculate.Calculate();

                    etbmi.setText("" + result);

                    if (result<18.5)
                    {
                        Toast.makeText(MainActivity.this,"Under Weight",Toast.LENGTH_LONG).show();
                    }
                    else if(result>18.5 && result<24.9){
                        Toast.makeText(MainActivity.this,"Normal Weight",Toast.LENGTH_LONG).show();

                    }
                    else if (result>25 && result<29.9){
                        Toast.makeText(MainActivity.this,"Over Weight",Toast.LENGTH_LONG).show();
                    }
                    else if (result>30)
                    {
                        Toast.makeText(MainActivity.this,"Obseity",Toast.LENGTH_LONG).show();
                    }

            }
        });

    }
}
