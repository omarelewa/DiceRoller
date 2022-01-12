package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myButtonListenerMethod();
    }

    public void myButtonListenerMethod(){
        Button button = (Button) findViewById(R.id.rollButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rand = new Random();
                int roller = rand.nextInt(6) + 1;

                TextView diceResult = (TextView) findViewById(R.id.rollResult);
                diceResult.setText(Integer.toString(roller));

                ImageView img = (ImageView) findViewById(R.id.diceImage);

                switch (roller) {
                    case 1:
                        img.setImageResource(R.drawable.dice_1);
                        break;
                    case 2:
                        img.setImageResource(R.drawable.dice_2);
                        break;
                    case 3:
                        img.setImageResource(R.drawable.dice_3);
                        break;
                    case 4:
                        img.setImageResource(R.drawable.dice_4);
                        break;
                    case 5:
                        img.setImageResource(R.drawable.dice_5);
                        break;
                    case 6:
                        img.setImageResource(R.drawable.dice_6);
                        break;
                }
            }
        });
    }
}