package com.gabriel.myappportfolio;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    //The OptionsMenu has onnly one element "About"
    //When selected a Alert Dialog appears showing information about the application.
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_about){
            AlertDialog alertDialogAbout = buildAlertDialogAbout();
            alertDialogAbout.show();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    //Method that builds the Alert Dialog shown when "About" from OptionsMenu is pressed.
    private AlertDialog buildAlertDialogAbout(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("About");
        builder.setMessage("              Gabriel Pineda\nAndroid Developer Nanodegree");
        builder.setNeutralButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //This method does nothing, it's just to show the neutral button.
            }
        });
        return builder.create();
    }

    //Method that handles onClick event of all the buttons in activity_main.xml
    public void buttonOnClickListener(View view){
        switch(view.getId()){
            case R.id.spotify:
                Toast.makeText(this,"This button will launch Spotify Streamer",Toast.LENGTH_SHORT).show();
                break;
            case R.id.football:
                Toast.makeText(this,"This button will launch Football Scores",Toast.LENGTH_SHORT).show();
                break;
            case R.id.library:
                Toast.makeText(this,"This button will launch Library APP",Toast.LENGTH_SHORT).show();
                break;
            case R.id.build:
                Toast.makeText(this,"This button will launch Build It Bigger",Toast.LENGTH_SHORT).show();
                break;
            case R.id.xyz:
                Toast.makeText(this,"This button will launch XYZ Reader",Toast.LENGTH_SHORT).show();
                break;
            case R.id.capstone:
                Toast.makeText(this,"This button will launch Capstone",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
