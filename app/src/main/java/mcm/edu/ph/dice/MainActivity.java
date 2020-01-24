package mcm.edu.ph.dice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import java.lang.Runnable;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView imageViewDice;
    private Random rng = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewDice = findViewById(R.id.image_view_dice);
        imageViewDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                new Handler(getMainLooper()).postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        rollDice();
                    }
                },2000);

            }

        });

    }


    private void rollDice() {
        int randomn = rng.nextInt(6) + 1;

        switch (randomn) {
            case 1:
                imageViewDice.setImageResource(R.drawable.dice1);
                break;
            case 2:
                imageViewDice.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imageViewDice.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imageViewDice.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imageViewDice.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imageViewDice.setImageResource(R.drawable.dice6);
                break;


            }

            if (randomn <=3) {
                Toast.makeText(MainActivity.this, "The number is "+randomn+" ! It is low!!",
                        Toast.LENGTH_LONG).show();
            }
            else {
                Toast.makeText(MainActivity.this, "The number is "+randomn+" ! It is high!!",
                        Toast.LENGTH_LONG).show();
            }
        }

    }

