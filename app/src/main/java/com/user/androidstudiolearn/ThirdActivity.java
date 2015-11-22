package com.user.androidstudiolearn;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.util.Log;

import com.garretthh07.androidstudiolearn.R;

public class ThirdActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);

        Log.d("ThirdActivity", "Task id is " + getTaskId());

        setContentView(R.layout.third_layout);
        Button button3 = (Button)findViewById(R.id.button_3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 退出所有 Activity
                ActivityCollector.finishAll();

                //杀掉当前进程
                android.os.Process.killProcess(android.os.Process.myPid());
            }
        });
    }
}
