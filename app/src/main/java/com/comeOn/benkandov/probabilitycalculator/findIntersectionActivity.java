package com.comeOn.benkandov.probabilitycalculator;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class findIntersectionActivity extends ActionBarActivity {

    public void firstPage(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);

    }
    public void findIntersectionOption1(View view){
        Intent intent = new Intent(this,findIntersectionOption1Activity.class);
        startActivity(intent);
    }
    public void findIntersectionOption2(View view){
        Intent intent = new Intent(this,findIntersectionOption2Activity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_intersection);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_find_intersection, menu);
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
