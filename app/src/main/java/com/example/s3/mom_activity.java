package com.example.s3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class mom_activity extends AppCompatActivity {
    String[] motherquote={"Children are the anchors of a mother's life.",
            "There is an endearing tenderness in the love of a mother to a son that transcends all other affections of the heart.",
            "Men are what their mothers made them.",
            "There has never been, nor will there ever be, anything quite so special as the love between the mother and a son",
            "Child's best friend is his mother.",
            "Moms are as relentless as the tides. They don't just drive us to practice, they drive us to greatness.",
            "All I am I owe to my mother.",
            "All women become like their mothers. That is their tragedy. No man does. That’s his.",
            "If love is as sweet as a flower, then my mother is that sweet flower of love.",
            "A mother’s love doesn’t make her son more dependent and timid; it actually makes him stronger and more independent.",
            "To a mother, a son is never a fully grown man; and a son is never a fully grown man until he understands and accepts this about his mother.",
            "A mother’s arms are made of tenderness and children sleep soundly in them.",
            "A man never sees all that his mother has been to him until it's too late to let her know that he sees it.",
            "The most important mark I will leave on this world is my son.",
            "Mothers are inscrutable beings to their sons, always.",
            "My mother is my root, my foundation. She planted the seed that I base my life on, and that is the belief that the ability to achieve starts in your mind.",
            "The heart of a mother is a deep abyss at the bottom of which you will always find forgiveness.",
            "Mother is her son's first god; she must teach him the most important lesson of all — how to love",
            "If love is as sweet as a flower, then my mother is that sweet flower of love.",
            "A mother is she who can take the place of all others but whose place no one else can take.",
            "A man loves his sweetheart the most, his wife the best, but his mother the longest.",
            "Life began with waking up and loving my mother's face.",
            "We are born of love; Love is our mother.",
            "My mother was my role model before I even knew what that word was.",
            "Sometimes the strength of motherhood is greater than natural laws.",
            "There’s no way to be a perfect mother, and a million ways to be a good one.",
            "Motherhood is the biggest gamble in the world. It is the glorious life force. It’s huge and scary — it’s an act of infinite optimism.",
            "I can imagine no heroism greater than motherhood.",
            "A mother is the one who fills your heart in the first place",
            "The natural state of motherhood is unselfishness.",
            "Life doesn't come with a manual. It comes with a mother",
            "My mom is definitely my rock.",
            "A mother's love endures through all.",
            "All I am I owe to my mother.",
            "God could not be everywhere, and therefore he made mothers.",
            "The influence of a mother in the lives of her children is beyond calculation.",
            "When you look into your mother's eyes, you know that is the purest love you can find.",
            "Motherhood: All love begins and ends there.",
            "Most mothers are instinctive philosophers.",
            "A mother understands what a child does not say.",
            "Mothers don't sleep. They just worry with their eyes closed.",
            "Sooner or later, we all quote our mothers.",
            "A mother is your first friend, your best friend, your forever friend.",
            "Nothing is really lost until your mom can't find it.",
            "A mother's arms are more comforting than anyone else's.",
            "Moms are like buttons — they hold everything together.",
            "I can only hope to be 10% of the mom mine was to me.",
            "A mother's hug lasts long after she lets go.",

    };

    Button button;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mom_activity);

        button=(Button)findViewById(R.id.more_fun);
        textView=(TextView)findViewById(R.id.fun_txt);
        textView.setText(motherquote[0]);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Random r;
                int output;


                r = new Random();
                output = r.nextInt(30);
                String st=motherquote[output];
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