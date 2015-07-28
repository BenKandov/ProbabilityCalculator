package com.comeOn.benkandov.probabilitycalculator;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class findSingleActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_single);
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_find_single, menu);
        return true;
    }
    public void firstPage(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);

    }
    public void findSingleOption1(View view){
        Intent intent = new Intent(this,findSingleOption1Activity.class);
        startActivity(intent);
    }
    public void findSingleOption2(View view){
        Intent intent = new Intent(this,findSingleOption2Activity.class);
        startActivity(intent);
    }
    public void findSingleOption3(View view){
        Intent intent = new Intent(this,findSingleOption3Activity.class);
        startActivity(intent);
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
