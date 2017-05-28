package com.example.a2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        TextView textView = (TextView) findViewById(R.id.textview);
        passwordValidater p = new passwordValidater();
        if(p.isInsensitive(message)==false){
            textView.setText("case insensitive.");
        }
        else if(p.isShort(message)==false){
            textView.setText("you need enter at least 8 characters long.");
        }
        else if(p.isUpperCase(message)==false){
            textView.setText("your password must include at least one capital letter.");
        }
        else if(p.isMix(message)==false){
            textView.setText("your password must include number and letters.");
        }
        else if(p.includeIllegal(message)==false){
            textView.setText("your password cannot include !, @, #, $, %, ^, &, *, (, )");
        }
        else
            textView.setText("your password has been set successfully!");
    }
}
