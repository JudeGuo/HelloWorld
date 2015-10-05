package com.jude.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button sendAgainButton;
    public static final String MESSAGE = "message";
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sendAgainButton = (Button)
                findViewById(R.id.btn_send_again);
        sendAgainButton.setOnClickListener ( new View.OnClickListener(){

            public void onClick(View view) {
                Toast.makeText(view.getContext(), "You Clicked me again!", Toast.LENGTH_SHORT)
                        .show();
            }
        });
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

    public void sendData(View v) {
        Toast.makeText(this, "You Clicked me!", Toast.LENGTH_SHORT)
                .show();
        EditText msgText = (EditText) findViewById(R.id.txt_hello);
        String msg = msgText.getText().toString();
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(MESSAGE, msg);
        startActivity(intent);

    }
}
