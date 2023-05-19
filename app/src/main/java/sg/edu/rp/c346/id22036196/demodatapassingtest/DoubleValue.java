package sg.edu.rp.c346.id22036196.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DoubleValue extends AppCompatActivity {
    TextView tvAnswer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_double_value);

        //Step 2:
        tvAnswer=findViewById(R.id.textViewDoubleV);
        Intent intentReceived=getIntent();
        double value=intentReceived.getDoubleExtra("value",99.99);
        tvAnswer.setText("Double value received is: "+value);
    }
}