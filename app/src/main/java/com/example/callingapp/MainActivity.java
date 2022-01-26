package com.example.callingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1= (EditText) findViewById(R.id.number);
    }

    public void makeCall(View view) {
      String num = et1.getText().toString();
      Intent call = new Intent(Intent.ACTION_CALL);
      call.setData(Uri.parse("tel:"+num));
      startActivity(call);
    }
}