package com.user.androidstudiolearn;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.garretthh07.androidstudiolearn.R;

public class ChapterActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.chapter_layout);

        Button chapter2Btn = (Button)findViewById(R.id.chapter_2);
        chapter2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ChapterActivity.this, FirstActivity.class);
                startActivity(intent);
            }
        });
    }
}
