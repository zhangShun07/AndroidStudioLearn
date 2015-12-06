package com.user.androidstudiolearn;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.garretthh07.androidstudiolearn.R;

public class Chapter3Activity extends Activity implements View.OnClickListener {
    private Button button;
    private EditText editText;
    private ImageView imageView;
    private ProgressBar progressBar;
    /**
     * 提供给外部的类方法, 快速创建这个 Activity, 可以不用协商传递参数的命名
     * @param context: 前一个Activity的句柄
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

    @Override
    public void onClick(View v) {

    }
}
