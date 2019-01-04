package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView storyTextView;
    private Button upButton,downButton;
    int myStoryIndex = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        storyTextView = (TextView) findViewById(R.id.storyTextView);
        upButton = (Button) findViewById(R.id.buttonTop);
        downButton = (Button) findViewById(R.id.buttonBottom);
        upButton.setOnClickListener(this);
        downButton.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch(id){

            case R.id.buttonTop:
                updateStoryForUp();
                myStoryIndex++;

                break;
            case R.id.buttonBottom:


                    updateStoryForDown();
                myStoryIndex+=2;




        }

    }
    public void updateStoryForUp() {
        if (myStoryIndex == 1 || myStoryIndex == 3) {
            storyTextView.setText(R.string.T3_Story);
            upButton.setText(R.string.T3_Ans1);
            downButton.setText(R.string.T3_Ans2);

        }
        if (myStoryIndex == 2||myStoryIndex == 4) {
            storyTextView.setText(R.string.T6_End);
            upButton.setVisibility(View.INVISIBLE);
            downButton.setVisibility(View.INVISIBLE);


        }


    }
        public void updateStoryForDown()
        {
            if(myStoryIndex==1)
            {
                storyTextView.setText(R.string.T2_Story);
                upButton.setText(R.string.T2_Ans1);
                downButton.setText(R.string.T2_Ans2);

            }
            if(myStoryIndex==2||myStoryIndex == 4)
            {
                storyTextView.setText(R.string.T5_End);
                upButton.setVisibility(View.INVISIBLE);
                downButton.setVisibility(View.INVISIBLE);



            }
            if (myStoryIndex == 3) {
                storyTextView.setText(R.string.T4_End);
                upButton.setVisibility(View.INVISIBLE);
                downButton.setVisibility(View.INVISIBLE);


            }


    }

}
