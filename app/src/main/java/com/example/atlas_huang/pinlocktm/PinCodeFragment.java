package com.example.atlas_huang.pinlocktm;

import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.EditText;

import com.example.atlas_huang.pinlocktm.custom.AutoJumpTextWatcher;
import com.example.atlas_huang.pinlocktm.custom.NumericKeyBoardTransformationMethod;

/**
 * Created by atlas_huang on 2017/5/6.
 */

public class PinCodeFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_pinlock, container, false);

        EditText ed1 = (EditText) rootView.findViewById(R.id.ed1);
        EditText ed2 = (EditText) rootView.findViewById(R.id.ed2);
        EditText ed3 = (EditText) rootView.findViewById(R.id.ed3);
        EditText ed4 = (EditText) rootView.findViewById(R.id.ed4);

        setupInputType(ed1);
        setupInputType(ed2);
        setupInputType(ed3);
        setupInputType(ed4);

        ed1.addTextChangedListener(new AutoJumpTextWatcher(ed1, ed2));
        ed2.addTextChangedListener(new AutoJumpTextWatcher(ed2, ed3));
        ed3.addTextChangedListener(new AutoJumpTextWatcher(ed3, ed4));
        ed4.addTextChangedListener(new AutoJumpTextWatcher(ed4, null));

        getActivity().getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        return rootView;
    }

    private void setupInputType(EditText editText) {
        editText.setInputType(InputType.TYPE_CLASS_NUMBER);
        editText.setTransformationMethod(new NumericKeyBoardTransformationMethod());
        editText.setCursorVisible(false);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            editText.setLetterSpacing((float) 0.5);
        }
    }
}
