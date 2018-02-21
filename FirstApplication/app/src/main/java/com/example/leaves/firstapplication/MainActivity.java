package com.example.leaves.firstapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txtLink;
    private TextView txtCall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtLink=findViewById(R.id.txtR6);
        txtLink.setMovementMethod(LinkMovementMethod.getInstance());
        txtCall=findViewById(R.id.txtPhone);
        txtCall.setMovementMethod(LinkMovementMethod.getInstance());
    }
}