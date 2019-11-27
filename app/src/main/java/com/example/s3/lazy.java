package com.example.s3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class lazy extends AppCompatActivity {
    String[] lazyqquotes={"The best thing to do first thing in the morning is to go right back to sleep.",
            "Sleep is the best meditation.",
            "Learn from yesterday, live for today, look to tomorrow, rest this afternoon.",
            "Don’t give up on your dreams. Keep sleeping.",
            "There is no sunrise so beautiful that it is worth waking me up to see it.",
            "\"Go to bed you’ll feel better tomorrow\" is the human version of \"Did you try turning it off and on again?\"",
            "A good laugh and a long sleep are the two best cures for anything.",
            "You miss 100% of the naps you don’t take",
            "I love sleep because it’s like a time machine to breakfast.",
            "Let’s start by taking a smallish nap or two …",
            "I love sleep. My life has the tendency to fall apart when I'm awake, you know?",
            "I usually take a two-hour nap from one to four.",
            "Laugh and the world laughs with you. Snore and you sleep alone",
            "When the going gets tough, the tough take a nap.",
            "I don't feel old. I don't feel anything till noon. That's when it's time for my nap.",
            "The nicest thing for me is sleep. Then at least I can dream.",
            "When I wake up, I am reborn.",
            "There is a time for many words, and there is also a time for sleep.",
            "We are such stuff as dreams are made on.",
            "You know you're in love when you can't fall asleep because reality is finally better than your dreams."

    };
    ViewGroup tcon;
    Button button,fire,back;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lazy);
        button=(Button)findViewById(R.id.more_lazy);
        fire=(Button)findViewById(R.id.button7);
        back=(Button)findViewById(R.id.button5);

        tcon= findViewById(R.id.tcon);


        textView=(TextView)findViewById(R.id.lazy_txt);
        textView.setText(lazyqquotes[0]);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random r2;
                int output;


                r2 = new Random();
                output = r2.nextInt(20);
                String st=lazyqquotes[output];
                textView.setText(st);

            }
        });
        fire.setOnClickListener(new View.OnClickListener() {
            boolean visible;
            @Override
            public void onClick(View v) {
                TransitionManager.beginDelayedTransition(tcon);
                visible=!visible;
                fire.setVisibility(visible?View.VISIBLE:View.INVISIBLE);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lazy.super.finish();
                overridePendingTransition(R.anim.slite_in_lft,R.anim.slide_out_right);
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
