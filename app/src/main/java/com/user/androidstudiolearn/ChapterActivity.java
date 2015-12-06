package com.user.androidstudiolearn;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import com.garretthh07.androidstudiolearn.R;

public class ChapterActivity extends Activity implements View.OnClickListener {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chapter_layout);
        //添加跳转到相应章节的回调
        button = (Button)findViewById(R.id.chapter_2);
        button.setOnClickListener(this);
        button = (Button) findViewById(R.id.chapter_3);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.chapter_2:
                Intent intent = new Intent(ChapterActivity.this, FirstActivity.class);
                startActivity(intent);
                break;
            case R.id.chapter_3:
                Chapter3Activity.actionStart(ChapterActivity.this);
                break;
            default:
                //to do default thing
        }
    }
}
