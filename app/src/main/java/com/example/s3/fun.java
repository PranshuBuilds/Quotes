package com.example.s3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class fun extends AppCompatActivity {
    String[] funquote={"The sea, once it casts its spell, holds one in its net of wonder forever.",
            "Because there’s nothing more beautiful than the way the ocean refuses to stop kissing the shoreline, no matter how many times it’s sent away.",
            "To escape and sit quietly on the beach — that’s my idea of paradise.",
            "I followed my heart, and it led me to the beach.",
            "I love the beach. I love the sea. All my life I live within — in front of the sea.",
            "There’s no place like home except for the beach.",
            "Why do we love the sea? It is because it has some potent power to make us think things we like to think.",
            "On the beach, you can live in bliss.",
            "Adults are just outdated children.",
            "Hugs can do great amounts of good, especially for children.",
            "There can be no keener revelation of a society’s soul than the way in which it treats its children.",
            "If you want your children to be intelligent, read them fairy tales. If you want them to be more intelligent, read them more fairy tales.",
            "Children have one kind of silliness, as you know, and grown-ups have another kind.",
            "The soul is healed by being with children.",


    };
    Button button;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun);
        button=(Button)findViewById(R.id.more_fun);
        textView=(TextView)findViewById(R.id.fun_txt);
        textView.setText(funquote[0]);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random r2;
                int output;


                r2 = new Random();
                output = r2.nextInt(14);
                String st=funquote[output];
                textView.setText(st);

            }
        });
    }

    public void simpleToastClick3(View v) {
        Toast.makeText(this, "\uD83D\uDE0A", Toast.LENGTH_LONG).show();
    }
    @Override
    public void finish(){
        super.finish();
        overridePendingTransition(R.anim.slite_in_lft,R.anim.slide_out_right);}
}
