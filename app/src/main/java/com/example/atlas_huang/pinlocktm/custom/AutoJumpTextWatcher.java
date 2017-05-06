package com.example.atlas_huang.pinlocktm.custom;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

/**
 * Created by atlas_huang on 2017/5/6.
 */

public class AutoJumpTextWatcher implements TextWatcher {
    private final static int size = 1;

    EditText mEd1;
    EditText mEd2;

    public AutoJumpTextWatcher(EditText ed1, EditText ed2) {
        this.mEd1 = ed1;
        this.mEd2 = ed2;
    }

    @Override
    public void onTextChanged(CharSequence s, int start,int before, int count)
    {
        if (mEd2 == null)  return;

        if(mEd1.getText().toString().length() == size)     //size as per your requirement
        {
            mEd2.requestFocus();
        }
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start,
                                  int count, int after) {
    }

    @Override
    public void afterTextChanged(Editable s) {

    }
}
