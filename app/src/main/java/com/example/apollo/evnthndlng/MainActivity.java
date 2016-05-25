package com.example.apollo.evnthndlng;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button pallobsButton = (Button)findViewById(R.id.pallobsButton);
        pallobsButton.setOnClickListener(
                new Button.OnClickListener(){

                    public void onClick(View v){

                        TextView pallobsText = (TextView)findViewById(R.id.pallobsText);
                        pallobsText.setText("Thank you");

                    }
                }

        );

        pallobsButton.setOnLongClickListener(

                new Button.OnLongClickListener(){

                    @Override
                    public boolean onLongClick(View v) {
                        TextView pallobsText = (TextView)findViewById(R.id.pallobsText);
                        pallobsText.setText("Its a long click man !!");
                        return false;
                    }
                }
        );
    }
}
