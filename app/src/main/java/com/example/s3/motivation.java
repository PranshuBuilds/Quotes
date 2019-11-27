package com.example.s3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class motivation extends AppCompatActivity {
    String[] motivationalquotes={"Act as if what you do makes a difference. It does.",
            "Success is not final, failure is not fatal: it is the courage to continue that counts.",
            "Never bend your head. Always hold it high. Look the world straight in the eye.",
            "What you get by achieving your goals is not as important as what you become by achieving your goals.",
            "Believe you can and you're halfway there.",
            "When you have a dream, you've got to grab it and never let go.",
            "I can't change the direction of the wind, but I can adjust my sails to always reach my destination.",
            "No matter what you're going through, there's a light at the end of the tunnel.",
            "It is our attitude at the beginning of a difficult task which, more than anything else, will affect its successful outcome.",
            "Life is like riding a bicycle. To keep your balance, you must keep moving.",
            "Just don't give up trying to do what you really want to do. Where there is love and inspiration, I don't think you can go wrong.",
            "Limit your \"always\" and your \"nevers.\"",
            "Nothing is impossible. The word itself says \"I'm possible!\"",
            "You are never too old to set another goal or to dream a new dream.",
            "Try to be a rainbow in someone else's cloud.",
            "You do not find the happy life. You make it.",
            "Inspiration comes from within yourself. One has to be positive. When you're positive, good things happen.",
            "Sometimes you will never know the value of a moment, until it becomes a memory.",
            "The most wasted of days is one without laughter.",
            "You must do the things you think you cannot do.",
            "It isn't where you came from. It's where you're going that counts.",
            "It is never too late to be what you might have been.",
            "Stay close to anything that makes you glad you are alive.",
            "You get what you give.",
            "Some people look for a beautiful place. Others make a place beautiful.",
            "Happiness often sneaks in through a door you didn't know you left open.",
            "We must be willing to let go of the life we planned so as to have the life that is waiting for us.",
            "Happiness is not by chance, but by choice.",
            "Life changes very quickly, in a very positive way, if you let it.",
            "Keep your face to the sunshine and you cannot see a shadow.",
            "Never limit yourself because of others’ limited imagination; never limit others because of your own limited imagination.",
            "Be the change that you wish to see in the world.",
            "Let us make our future now, and let us make our dreams tomorrow's reality.",
            "You don't always need a plan. Sometimes you just need to breathe, trust, let go, and see what happens.",
            "If I cannot do great things, I can do small things in a great way.",
            "My mission in life is not merely to survive, but to thrive.",
            "You are enough just as you are.",
            "The bad news is time flies. The good news is you're the pilot.",
            "Spread love everywhere you go.",
            "Don't wait. The time will never be just right.",
            "Life has got all those twists and turns. You've got to hold on tight and off you go.",
            "If you look at what you have in life, you'll always have more.",
            "Inspiration is some mysterious blessing which happens when the wheels are turning smoothly.",
            "With the right kind of coaching and determination you can accomplish anything.",
            "If you have good thoughts they will shine out of your face like sunbeams and you will always look lovely.",
            "No matter what people tell you, words and ideas can change the world.",
            "Each person must live their life as a model for others.",
            "A champion is defined not by their wins but by how they can recover when they fall.",
            "Motivation comes from working on things we care about.",
            "Keep your face always toward the sunshine, and shadows will fall behind you."


    };
    Button button;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motivation);
        button=(Button)findViewById(R.id.more_motivation);
        textView=(TextView)findViewById(R.id.motivation_txt);
        textView.setText(motivationalquotes[0]);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random r2;
                int output;


                r2 = new Random();
                output = r2.nextInt(50);
                String st=motivationalquotes[output];
                textView.setText(st);

            }
        });
    }

    public void simpleToastClick(View v) {
        Toast.makeText(this, "\uD83D\uDE0A.", Toast.LENGTH_LONG).show();
    }
    @Override
    public void finish(){
        super.finish();
        overridePendingTransition(R.anim.slite_in_lft,R.anim.slide_out_right);}
}
