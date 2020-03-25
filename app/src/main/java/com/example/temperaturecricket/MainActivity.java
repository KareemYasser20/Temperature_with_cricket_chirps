package com.example.temperaturecricket;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText temputereNumber;
    Button calaculationButton;
    TextView viewresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        temputereNumber = findViewById(R.id.ET_TemNumber);
        calaculationButton= findViewById(R.id.BT_calculate);
        viewresult = findViewById(R.id.TV_result);

        viewresult.setVisibility(View.GONE);

        calaculationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String  temp_Number =temputereNumber.getText().toString();

                int convert_number = Integer.parseInt(temp_Number);

                double temp_result = (convert_number / 3) + 4;

                viewresult.setText(" The approximate temperature outside is" + "\n" +"               "+ temp_result + " degrees Celsius." );

                viewresult.setVisibility(View.VISIBLE);
            }
        });

    }
}
