package com.comeOn.benkandov.probabilitycalculator;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class findSingleOption3Activity extends ActionBarActivity {
    Button find;
    TextView result;
    EditText AB;
    EditText AnB;


    private boolean isEmpty(EditText etText) {
        return etText.getText().toString().trim().length() == 0;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_single_option3);
    }
    public void firstPage(View view){
        Intent intent = new Intent(this,findSingleActivity.class);
        startActivity(intent);

    }
    public void getResult(View view){
        result = (TextView)findViewById(R.id.singleOption3Result);
        AB = (EditText)findViewById(R.id.singleOption3AB);
        AnB = (EditText)findViewById(R.id.UnionOption2PB);
        if(!isEmpty(AB)&&(!isEmpty(AnB))){
            Float ab = Float.valueOf(AB.getText().toString());
            Float aNb = Float.valueOf(AnB.getText().toString());
            Float r = aNb/ab;
            if((r>0)&&(r<=1)){
                result.setText(Float.toString(r));
            }else{
                result.setText("The value is either negative or greater than 1. Please enter valid decimal inputs.");
            }
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_find_single_option3, menu);
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
