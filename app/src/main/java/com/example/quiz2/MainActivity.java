package com.example.quiz2;

import android.app.Activity;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public void showCancel(View v) {
        Toast toast = Toast.makeText(this, "Cancel button was clicked...", Toast.LENGTH_LONG);
        toast.show();

    }

    public void showProceed(View v) {
        Snackbar sbar = Snackbar.make(v, "Proceed button was clicked...", Snackbar.LENGTH_LONG);
        sbar.show();
    }
}
