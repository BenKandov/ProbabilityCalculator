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


public class findSingleOption2Activity extends ActionBarActivity {
    Button find;
    TextView result;
    EditText PB;
    EditText AnB;
    EditText AuB;

    private boolean isEmpty(EditText etText) {
        return etText.getText().toString().trim().length() == 0;
    }

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_single_option2);




    }
    public void getResult(View view){
        result = (TextView)findViewById(R.id.singleOption2Result);
        PB = (EditText)findViewById(R.id.SingleOption2PB);
        AnB = (EditText)findViewById(R.id.UnionOption2PB);
        AuB = (EditText)findViewById(R.id.UnionOption2PAB);

        if((!isEmpty(PB))&&(!isEmpty(AnB))&&(!isEmpty(AuB))) {
            Float B = Float.valueOf(PB.getText().toString());
            Float PAnB = Float.valueOf(AnB.getText().toString());
            Float PAuB = Float.valueOf(AuB.getText().toString());
            Float r = PAuB - B + PAnB;
            if((r>0)&&(r<=1)) {
                result.setText(Float.toString(r));
            }else{
                result.setText("The value is either negative or greater than 1. Please enter valid decimal inputs.");
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
        getMenuInflater().inflate(R.menu.menu_find_single_option2, menu);
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
