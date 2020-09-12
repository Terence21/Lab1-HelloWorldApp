package edu.temple.helloworld;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView helloText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.clickMeButton);
        helloText = findViewById(R.id.helloText);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeText(helloText,"You have clicked the button");
            }
        });
    }

    private void changeText(TextView view, String new_output){
        view.setText(new_output);
    }
}
