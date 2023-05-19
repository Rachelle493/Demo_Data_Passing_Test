package sg.edu.rp.c346.id22036196.demodatapassingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Event handlingStep 1:
    Button btnPassInteger;
    Button btnPassCharacter;
    TextView tvPassDouble;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Event handling Step 2:
        btnPassInteger=findViewById(R.id.buttonPassInteger);
        btnPassCharacter=findViewById(R.id.buttonPassChar);
        tvPassDouble=findViewById(R.id.textView);

        //Event handling Step 3:
        btnPassInteger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("value",1);
                startActivity(intent);
            }
        });

        //Event handling Step 3:
        btnPassCharacter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this, ThirdActivity.class);
                intent.putExtra("value",'a');
                startActivity(intent);
            }
        });

        //Event handling Step 3:
        tvPassDouble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this, DoubleValue.class);
                intent.putExtra("value",99.99);
                startActivity(intent);
            }
        });

    }
}