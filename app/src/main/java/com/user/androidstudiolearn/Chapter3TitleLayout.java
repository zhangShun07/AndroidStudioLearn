package com.user.androidstudiolearn;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.garretthh07.androidstudiolearn.R;

public class Chapter3TitleLayout extends LinearLayout implements View.OnClickListener {

    public Chapter3TitleLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.chapter3_activity_main_title, this);

        Button titleBack = (Button) findViewById(R.id.title_back);
        titleBack.setOnClickListener(this);
        Button titleEdit = (Button) findViewById(R.id.title_edit);
        titleEdit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.title_back:
                ((Activity)v.getContext()).finish();
                break;
            case R.id.title_edit:
                Toast.makeText(v.getContext(), "You clicked the edit button", Toast.LENGTH_SHORT).show();
                break;
            default:
        }
    }
}
