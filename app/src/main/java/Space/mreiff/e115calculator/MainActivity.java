//Guide to getting button & text inputs https://www.youtube.com/watch?v=kp0DefpSMYw

package Space.mreiff.e115calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //declare all text, buttons, and floats
    TextView result;
    float res;
    EditText number1;
    float n1;
    EditText number2;
    float n2;
    Button add;
    Button subtract;
    Button multiply;
    Button divide;
    Button clear;
    Button mapButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //assigning the texts and buttons to simple names
        result = (TextView)findViewById(R.id.result);
        number1 = (EditText)findViewById(R.id.number1);
        number2 = (EditText)findViewById(R.id.number2);
        add = (Button)findViewById(R.id.add);
        subtract = (Button)findViewById(R.id.subtract);
        multiply = (Button)findViewById(R.id.multiply);
        divide = (Button)findViewById(R.id.divide);
        clear = (Button)findViewById(R.id.clear);
        mapButton = (Button)findViewById(R.id.mapButton);

        //addition
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1 = Float.parseFloat(number1.getText().toString()); //assign numbers 1 and 2 to already defined floats
                n2 = Float.parseFloat(number2.getText().toString());
                res = n1 + n2; //do math on floats

                result.setText("Sum: " + String.valueOf(res)); //print result to text field as a string
            }
        });

        //subtraction
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1 = Float.parseFloat(number1.getText().toString());
                n2 = Float.parseFloat(number2.getText().toString());
                res = n1 - n2;

                result.setText("Difference: " + String.valueOf(res));
            }
        });

        //multiplication
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1 = Float.parseFloat(number1.getText().toString());
                n2 = Float.parseFloat(number2.getText().toString());
                res = n1 * n2;

                result.setText("Product: " + String.valueOf(res));
            }
        });

        //division
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1 = Float.parseFloat(number1.getText().toString());
                n2 = Float.parseFloat(number2.getText().toString());
                res = n1 / n2;

                result.setText("Quotient: " + String.valueOf(res));
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                number1.setText("");
                number2.setText("");
                result.setText("Result");
            }
        });

        mapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActvityMap();
            }
        });

    }

    public void openActvityMap() {
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);

    }

}
