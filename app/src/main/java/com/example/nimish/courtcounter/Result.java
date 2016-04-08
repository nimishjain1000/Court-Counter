package com.example.nimish.courtcounter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Bundle bundle = getIntent().getExtras();
        String message = bundle.getString("message");
      TextView  resultView = (TextView) findViewById(R.id.final_result);
        resultView.setText(message);

    }
    public void callMain(View v)
    {
        Intent i=new Intent(this,MainActivity.class);
        startActivity(i);

    }
}
