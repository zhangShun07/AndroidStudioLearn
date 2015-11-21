package com.user.androidstudiolearn;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.garretthh07.androidstudiolearn.R;

/**
 * Created by Administrator on 2015/11/20.
 */
public class FirstActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);

        Button button1 = (Button)findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // todo: 添加点击事件, 现在弹出提示
                //Toast.makeText(FirstActivity.this, "You Click Button 1", Toast.LENGTH_LONG).show();
                //finish();
                // 启动自己定义的应用
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //todo: 显示用户自定义菜单
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public  boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.add_item:
                Toast.makeText(FirstActivity.this, "Add a item", Toast.LENGTH_LONG).show();
                break;
            case R.id.remove_item:
                Toast.makeText(FirstActivity.this, "Remove a item", Toast.LENGTH_LONG).show();
                break;
            default:
                //todo: do something
        }
        return true;
    }
}
