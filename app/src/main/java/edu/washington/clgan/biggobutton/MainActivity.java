package edu.washington.clgan.biggobutton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    int numOfPushes = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pushed(View view){
        numOfPushes++;
        Button tempButton = (Button)findViewById(R.id.gobutton);
        tempButton.setText("You have pushed me " + numOfPushes + " times!");
    }


}
