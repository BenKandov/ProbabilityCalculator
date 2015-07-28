package com.comeOn.benkandov.probabilitycalculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class findSingleOption1Activity extends ActionBarActivity {
    EditText input;
    Button it;
    TextView result;

    private boolean isEmpty(EditText etText) {
        return etText.getText().toString().trim().length() == 0;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_single_option1);

        it = (Button)findViewById(R.id.findIt);



    }
    public void getResult(View view){
        input = (EditText)findViewById(R.id.findSingleOption1Input);
        if(!isEmpty(input)) {
            Float temp = Float.valueOf(input.getText().toString());
            result = (TextView) findViewById(R.id.findSingleOption1Result);
            Float value = 1 - temp;
            if((value>0)&&(value<=1)) {
                result.setText(Float.toString(value));
            }else{
                result.setText("Please enter a valid decimal input.");
            }
        }


    }
    public void firstPage(View view){
        Intent intent = new Intent(this,findSingleActivity.class);
        startActivity(intent);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_find_single_option1, menu);
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
