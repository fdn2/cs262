package edu.calvin.cs262.fdn2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText input1;
    EditText input2;
    Spinner operationsbox;
    Button calc_butt;
    TextView resulttextview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input1 = findViewById(R.id.number1);
        input2 = findViewById(R.id.number2);
        calc_butt =  findViewById(R.id.calc_button);
        resulttextview = findViewById(R.id.result);
        operationsbox = findViewById(R.id.operationsbox);

        //populating the spinner box
        String[] operators = new String[] {"+","-","*","/"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_spinner_dropdown_item,operators);
        operationsbox.setAdapter(adapter);
    }

    public void Calculate(View view) {
        int num1 = Integer.parseInt(input1.getText().toString());
        int num2 = Integer.parseInt(input2.getText().toString());
        int result=0;
        String returnValue;
        String operation = operationsbox.getSelectedItem().toString();

        switch (operation){
            case "+":
                result = num1 + num2;
                returnValue = String.valueOf(result);
                break;
            case "-":
                result = num1 - num2;
                returnValue = String.valueOf(result);
                break;

            case "*":
                result = num1 * num2;
                returnValue = String.valueOf(result);
                break;

            default:
                if (num2 == 0) {
                    returnValue = "Out of range.";
                }
                else{
                    result = num1 / num2;
                    returnValue = String.valueOf(result);
                }
                break;
        }


        resulttextview.setText(returnValue);

    }
}
