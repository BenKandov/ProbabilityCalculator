package com.comeOn.benkandov.probabilitycalculator;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    Button optionSingle;
    Button optionSim;
    Button optionSequence;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        optionSingle = (Button) findViewById(R.id.optionSingle);
        optionSim  = (Button) findViewById(R.id.optionSim);
        optionSequence = (Button) findViewById(R.id.optionSequence);


    }
    public void findSingle(View view){
        Intent intent = new Intent(this,findSingleActivity.class);
        startActivity(intent);

    }
    public void findUnion(View view){
        Intent intent = new Intent(this,findUnionActivity.class);
        startActivity(intent);
    }
    public void findConditional(View view){
        Intent intent = new Intent(this,findConditionalActivity.class);
        startActivity(intent);
    }
    public void findIntersection(View view){
        Intent intent = new Intent(this,findIntersectionActivity.class);
        startActivity(intent);
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
