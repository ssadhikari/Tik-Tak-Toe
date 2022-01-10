package com.example.tictaktoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView score1,score2,status;
    private Button[] buttons =new  Button[9];
    private Button reset;

    private int player1score , player2score , roundcount;
    boolean activeplayer;

    int[] gamestae = {2,2,2,2,2,2,2,2,2};
    int[][] winningPositions = {
            {0,1,2},{3,4,5},{6,7,8},
            {0,3,6},{1,4,7},{2,5,8},
            {0,4,8},{2,4,6}
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        score1 = (TextView) findViewById(R.id.pointsof1);
        score2 = (TextView) findViewById(R.id.pointsof2);
        status = (TextView) findViewById(R.id.matchstatus);

        reset = (Button) findViewById(R.id.resetbtn);

        for (int i=0 ; i< buttons.length;i++){
            String buttonUUid = "btn_" + i;
            int resourceID = getResources().getIdentifier(buttonUUid,"id",getPackageName());
            buttons[i] = (Button) findViewById(resourceID);
            buttons[i].setOnClickListener(this);



        }
        roundcount = 0;
        player1score = 0;
        player2score= 0;
        activeplayer = true;


    }

    @Override
    public void onClick(View view) {

    }
}