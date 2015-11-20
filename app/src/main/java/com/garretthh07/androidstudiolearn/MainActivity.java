package com.garretthh07.androidstudiolearn;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;

import com.user.androidstudiolearn.FirstActivity;

public class MainActivity extends AppCompatActivity {
    /**
     * 当前类的 tag 值
     */
    private final String  TAG = "MainActivity";
    /**
     * 隐式启动FirstActivity 的条件
     */
    private  final  String FIRSTACTIVITY_INTENT = "com.garretthh07.androidstudiolearn.ACTION_START";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /**
         * 隐藏标题栏
         */
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                //显式启动 Activity
                Intent intent = new Intent(MainActivity.this, FirstActivity.class);
                //隐式启动 Activity
                //Intent intent = new Intent(FIRSTACTIVITY_INTENT);
                //intent.addCategory("com.garretthh07.androidstudiolearn.MY_CATEGORY");
                //启动浏览器
                //Intent intent = new Intent(Intent.ACTION_VIEW);
                //intent.setData(Uri.parse("http://www.baidu.com"));
                startActivity(intent);
            }
        });
        Log.d(TAG, "onCreate execute");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
