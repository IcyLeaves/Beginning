package com.example.leaves.firstapplication;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView txtval;
    private TextView txtcav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtval=findViewById(R.id.txtValkyrie);
        Drawable[] drawables_Val=txtval.getCompoundDrawables();
        drawables_Val[1].setBounds(0,0,400,400);
        txtval.setCompoundDrawables(drawables_Val[0],drawables_Val[1],drawables_Val[2],drawables_Val[3]);

        txtcav=findViewById(R.id.txtCaveria);
        Drawable[] drawables_Cav=txtcav.getCompoundDrawables();
        drawables_Cav[1].setBounds(0,0,400,400);
        txtcav.setCompoundDrawables(drawables_Cav[0],drawables_Cav[1],drawables_Cav[2],drawables_Cav[3]);
    }
}