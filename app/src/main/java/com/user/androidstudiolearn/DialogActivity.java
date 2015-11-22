package com.user.androidstudiolearn;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

import com.garretthh07.androidstudiolearn.R;

public class DialogActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dialog_layout);

    }
}
