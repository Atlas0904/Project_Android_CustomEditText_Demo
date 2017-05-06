package com.example.atlas_huang.pinlocktm;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText ed1 = (EditText) findViewById(R.id.ed1);
        EditText ed2 = (EditText) findViewById(R.id.ed2);
        EditText ed3 = (EditText) findViewById(R.id.ed3);
        EditText ed4 = (EditText) findViewById(R.id.ed4);

        ed2.getBackground().setColorFilter(getResources().getColor(R.color.colorPincodeEnter), PorterDuff.Mode.SRC_IN);

    }
}
