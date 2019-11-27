package com.example.s3;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends Activity {



String[] hello={"hope you are having a great day","really happy to see you again","What took you so long? I missed you","Hi \uD83D\uDE0A how's the day going?","Howdy-doody!","What’s crackin’?","I'm Batman.","Greetings and salutations!","Heeey, baaaaaby."};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }
    @Override
    public void onBackPressed(){
        final AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
        builder.setMessage("Really want to exit ??");
        builder.setCancelable(true);
        builder.setNegativeButton("no", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });builder.setPositiveButton("exit", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        AlertDialog alertDialog= builder.create();
        alertDialog.show();
    }


    public void simpleToastClick(View v) {
        Toast.makeText(this, "Help coming soon....", Toast.LENGTH_LONG).show();
    }

    public void onClick(View view){
        final AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
        builder.setMessage("Really want to exit ??");
        builder.setCancelable(true);
        builder.setNegativeButton("no", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });builder.setPositiveButton("exit", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });
        AlertDialog alertDialog= builder.create();
        alertDialog.show();
    }
    public void onClick1(View view){

        Intent intent=new Intent(MainActivity.this, about.class);
        startActivity(intent);
    overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);}

    public void simpleToastClick2(View v) {
        Random r;int output;
        r = new Random();
        output=r.nextInt(10);
        Toast.makeText(this, hello[output], Toast.LENGTH_LONG).show();
    }
    public void onClick2(View view){

        Intent intent=new Intent(MainActivity.this, mom_activity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);}
    public void onClick3(View view){

        Intent intent=new Intent(MainActivity.this, fun.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);}
    public void onClick4(View view){

        Intent intent=new Intent(MainActivity.this, lazy.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);}
    public void onClick5(View view){

        Intent intent=new Intent(MainActivity.this, motivation.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);}
    public void onClick6(View view){

        Intent intent=new Intent(MainActivity.this, family.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);}




}
