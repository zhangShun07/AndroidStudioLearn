package com.user.androidstudiolearn;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.util.Log;
import android.widget.Toast;

import com.garretthh07.androidstudiolearn.R;

/**
 * Created by Administrator on 2015/11/20.
 */  
public class SecondActivity extends BaseActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);

        setContentView(R.layout.second_layout);

        //Intent intent = getIntent();
        //String data = intent.getStringExtra("extra_data");
        //Log.d("SecondActivity", data);
        //Toast.makeText(SecondActivity.this, data, Toast.LENGTH_LONG).show();

        Log.d("SecondActivity", "Task id is " + getTaskId());
        Button button = (Button)findViewById(R.id.button_2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Intent intent = new Intent(Intent.ACTION_DIAL);
                //intent.setData(Uri.parse("tel:10086"));
                //startActivity(intent);
                // 返回数据给上一个 Activity
                //Intent intent = new Intent();
                //intent.putExtra("data_return", "Hello FirstActivity");
                //setResult(RESULT_OK, intent);
                //finish();
                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("SecondActivity", "onDestroy");
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("data_return", "Hello FirstActivity");
        setResult(RESULT_OK, intent);
        finish();
    }
}
