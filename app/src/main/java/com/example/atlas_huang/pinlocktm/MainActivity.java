package com.example.atlas_huang.pinlocktm;

import android.graphics.PorterDuff;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        EditText ed1 = (EditText) findViewById(R.id.ed1);
//        EditText ed2 = (EditText) findViewById(R.id.ed2);
//        EditText ed3 = (EditText) findViewById(R.id.ed3);
//        EditText ed4 = (EditText) findViewById(R.id.ed4);
//        ed2.getBackground().setColorFilter(getResources().getColor(R.color.colorPincodeEnter), PorterDuff.Mode.SRC_IN);

        Fragment fr = new PinCodeFragment();
        getSupportFragmentManager().beginTransaction().replace(android.R.id.content, fr, PinCodeFragment.class.getSimpleName()).commit();

    }
}
