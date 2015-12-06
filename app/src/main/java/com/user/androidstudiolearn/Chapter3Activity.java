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

        button = (Button)findViewById(R.id.chapter3_button);
        button.setOnClickListener(this);
        editText = (EditText)findViewById(R.id.chapter3_edit_text);
        imageView = (ImageView)findViewById(R.id.chapter3_image_view);
        progressBar = (ProgressBar)findViewById(R.id.chapter3_progress_bar);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.chapter3_button:
                //String inputStr = editText.getText().toString();
                //Toast.makeText(Chapter3Activity.this, inputStr, Toast.LENGTH_LONG).show();
                //imageView.setImageResource(R.mipmap.jelly_bean);
                /*
                if (progressBar.getVisibility() == View.GONE) {
                    progressBar.setVisibility(View.VISIBLE);
                }
                else {
                    progressBar.setVisibility(View.GONE);
                }
                */
                /*
                int progress = progressBar.getProgress();
                progress = progress + 10;
                progressBar.setProgress(progress);
                */
                /*
                AlertDialog.Builder dialog = new AlertDialog.Builder(Chapter3Activity.this);
                dialog.setTitle("This is a dialog");
                dialog.setMessage("Somethign important");
                dialog.setCancelable(false);
                dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                dialog.show();
                */
                ProgressDialog progressDialog = new ProgressDialog(Chapter3Activity.this);
                progressDialog.setTitle("This is a ProgressDialog");
                progressDialog.setMessage("Loading.....");
                progressDialog.setCancelable(true);
                //Back 键不能取消 ProgressDialog, 需要调用 dismiss
                //progressDialog.setCancelable(false);
                progressDialog.show();
                break;
            default:
                //to do something default
        }
    }
}
