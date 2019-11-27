package com.example.s3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class family extends AppCompatActivity {
    Button button;
    TextView textView;
    String[] familyquotes={"I sustain myself with the love of family.",
            "Happiness is having a large, loving, caring, close-knit family in another city.",
            "All happy families are alike; each unhappy family is unhappy in its own way.",
            "A dysfunctional family is any family with more than one person in it.",
            "My mother used to tell me that when push comes to shove, you always know who to turn to. That being a family isn't a social construct but an instinct.",
            "What can you do to promote world peace? Go home and love your family.",
            "Home is where you are loved the most and act the worst.",
            "So much of what is best in us is bound up in our love of family, that it remains the measure of our stability because it measures our sense of loyalty.",
            "You are born into your family and your family is born into you. No returns. No exchanges.",
            "There is no doubt that it is around the family and the home that all the greatest virtues, the most dominating virtues of human, are created, strengthened and maintained.",
            "In truth a family is what you make it. It is made strong, not by number of heads counted at the dinner table, but by the rituals you help family members create, by the memories you share, by the commitment of time, caring, and love you show to one another, and by the hopes for the future you have as individuals and as a unit.",
            "The world, we'd discovered, doesn't love you like your family loves you.",
            "A family is one of nature's solubles; it dissolves in time like salt in rainwater.",
            "Our most basic instinct is not for survival but for family.",
            "When all the dust is settled and all the crowds are gone, the things that matter are faith, family, and friends.",
            "In every conceivable manner, the family is a link to our past, bridge to our future.",
            "A family doesn't have to perfect; it just needs to be united.",
            "Everyone needs a house to live in, but a supportive family is what builds a home.",
            "Everyone needs a house to live in, but a supportive family is what builds a home.",
            "Family is the most important thing in the world.",
            "Families are the compass that guides us. They are the inspiration to reach great heights, and our comfort when we occasionally falter.",
            "My greatest pleasure is spending time with my family.",
            "A man travels the world over in search of what he needs, and returns home to find it.",
            "Family is a life jacket in the stormy sea of life.",
            "The only rock I know that stays steady, the only institution I know that works, is the family.",
            "There's only one thing more precious than our time and that's what we spend it on.",
            "Home should be an anchor, a port in a storm, a refuge, a happy place in which to dwell, a place where we are loved and where we can love.",
            "Families are like branches on a tree. We grow in different directions yet our roots remain as one.",
            "The greatest moments in life are not concerned with selfish achievements but rather with the things we do for the people we love and esteem.",
            "Family and friends are hidden treasures, seek them and enjoy their riches.",
            "Other things may change us, but we start and end with the family.",
            "You don't choose your family. They are God's gift to you, as you are to them.",
            "A happy family is but an earlier heaven.",
            "Sticking with your family is what makes it a family.",
            "Ohana means family. Family means no one gets left behind or forgotten.",
            "The family is one of nature's masterpieces.",
            "Having somewhere to go is home. Having someone to love is family. Having both is a blessing.",
            "Family: where life begins and love never ends.",
            "Being a family means you are a part of something very wonderful. It means you will love and be loved for the rest of your life.",
            "The bond that links your true family is not one of blood, but of respect and joy in each other's life.",
            "Family is not an important thing. It's everything.",
            "Peace is the beauty of life. It is sunshine. It is the smile of a child, the love of a mother, the joy of a father, the togetherness of a family. It is the advancement of man, the victory of just cause, the triumph of truth.",


    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);
        button=(Button)findViewById(R.id.more_family);
        textView=(TextView)findViewById(R.id.family_txt);
        textView.setText(familyquotes[0]);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random r2;
                int output;


                r2 = new Random();
                output = r2.nextInt(41);
                String st=familyquotes[output];
                textView.setText(st);

            }
        });
    }
    public void simpleToastClick(View v) {
        Toast.makeText(this, "\uD83D\uDE0A", Toast.LENGTH_LONG).show();
    }
    @Override
    public void finish(){
        super.finish();
        overridePendingTransition(R.anim.slite_in_lft,R.anim.slide_out_right);

    }
    }

