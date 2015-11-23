package com.user.androidstudiolearn;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;

import com.garretthh07.androidstudiolearn.R;

public class Chapter3Activity extends Activity {
    /**
     * 提供给外部的类方法, 快速创建这个 Activity, 可以不用协商传递参数的命名
     * @param context
     */
    public static void actionStart(Context context) {
        Intent intent = new Intent(context, Chapter3Activity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chapter3_activity_main);
    }
}
