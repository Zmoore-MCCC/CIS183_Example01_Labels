package com.example.cis183_example01_labels;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

//All of our variables will be global


public class MainActivity extends AppCompatActivity {

    TextView lbl_j_greeting;
    EditText et_j_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        //all of our code will be put after the setContentView()

        //assign all xml variables to java variables
        lbl_j_greeting = findViewById(R.id.lbl_v_greeting);
        et_j_name      = findViewById(R.id.et_v_name);
        //call the setGreetingMessage function
        setGreetingMessage();
        String nameFromTextbox = getNameFromTextbox();
        Log.d("The name is: " , nameFromTextbox);

    }

    public void setGreetingMessage()
    {
        //set the greeting message to something else
        lbl_j_greeting.setText("Welcome to my App!");
    }

    public String getNameFromTextbox()
    {
        return et_j_name.getText().toString();
    }
}