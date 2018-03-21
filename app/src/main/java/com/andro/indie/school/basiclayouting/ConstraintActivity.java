package com.andro.indie.school.basiclayouting;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

/**
 * Created by herisulistiyanto on 3/20/18.
 */

public class ConstraintActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constraint);
    }

    public void btnClickA(View view) {
        Toast.makeText(this, "HELLO CONSTRAINT", Toast.LENGTH_SHORT).show();
    }

    public void btnClickB(View view) {
    }
}
