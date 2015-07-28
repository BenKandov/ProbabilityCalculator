package com.comeOn.benkandov.probabilitycalculator;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class findIntersectionOption1Activity extends ActionBarActivity {

    TextView result;
    EditText a;
    EditText b;
    EditText ab;

    public void getResult(View view){
        result = (TextView)findViewById(R.id.result);
        a = (EditText)findViewById(R.id.Option1);
        b = (EditText)findViewById(R.id.UnionOption2PB);
        ab = (EditText)findViewById(R.id.UnionOption2PAB);
        if(    !(isEmpty(a))    &&    !(isEmpty(b))   &&  !(isEmpty(ab)) ){
            Float A = Float.valueOf(a.getText().toString());
            Float B = Float.valueOf(b.getText().toString());
            Float AB = Float.valueOf(ab.getText().toString());
            Float r = -(AB-A-B);
            if((r>0)&&(r<=1)){
                result.setText(Float.toString(r));
            }else{
                result.setText("The value is either negative or greater than 1. Please enter valid decimal inputs.");
            }

        }




    }


    private boolean isEmpty(EditText etText) {
        return etText.getText().toString().trim().length() == 0;
    }
    public void firstPage(View view){
        Intent intent = new Intent(this,findIntersectionActivity.class);
        startActivity(intent);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_intersection_option1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_find_intersection_option1, menu);
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
