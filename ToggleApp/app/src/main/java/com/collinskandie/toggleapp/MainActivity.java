package com.collinskandie.toggleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    private ToggleButton toggleButton3,toggleButton4;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //on click listener.
        addListenerOnButtonClick();
    }

    private void addListenerOnButtonClick() {
        //getting the buttons from the layout.
        toggleButton3=(ToggleButton)findViewById(R.id.toggleButton3);
        toggleButton4=(ToggleButton)findViewById(R.id.toggleButton4);
        button=(Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener());
        @Override
                public void onClick(View View){
            StringBuilder result= new StringBuilder();
            result.append("ToggleButton1:").append(toggleButton3.getText());
            result.append("\n ToggleButton4").append(toggleButton4.getText());
            //display the message in toast
            Toast.makeText(getApplicationContext(), result.toString(),Toast.LENGTH_LONG).show();

        }
    }

}