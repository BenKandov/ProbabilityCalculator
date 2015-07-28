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


public class findUnionOption1Activity extends ActionBarActivity {
    Button get;
    TextView result;
    EditText a;
    EditText b;
    EditText aNb;

    private boolean isEmpty(EditText etText) {
        return etText.getText().toString().trim().length() == 0;
    }
    public void findResult(View view){
        result = (TextView)findViewById(R.id.UnionOption1Result);
        a = (EditText)findViewById(R.id.UnionOption1PA);
        b = (EditText)findViewById(R.id.UnionOption1PB);
        aNb = (EditText)findViewById(R.id.UnionOption1PAB);
        if(    !(isEmpty(a))    &&    !(isEmpty(b))   &&  !(isEmpty(aNb))){
            Float A = Float.valueOf(a.getText().toString());
            Float B = Float.valueOf(b.getText().toString());
            Float AnB = Float.valueOf(aNb.getText().toString());
            Float r = A + B - AnB;
            if((r>0)&&(r<=1)){
                result.setText(Float.toString(r));
            }else{
                result.setText("The value is either negative or greater than 1. Please enter valid decimal inputs.");
            }

        }




    }


    public void firstPage(View view){
        Intent intent = new Intent(this,findUnionActivity.class);
        startActivity(intent);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_union_option1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_find_union_option1, menu);
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
