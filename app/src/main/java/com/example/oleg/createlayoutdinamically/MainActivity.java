package com.example.oleg.createlayoutdinamically;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.view.ViewGroup.LayoutParams;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout linear = new LinearLayout(this);
        linear.setOrientation(LinearLayout.VERTICAL);
        LayoutParams params =  new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
        setContentView(linear, params);

        TextView header = new TextView(this);
        LayoutParams params1 =  new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);

        header.setText("Hello World");
        header.setTextSize(18);
        linear.addView(header,params1);

        LayoutParams params2 =  new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
        TextView body = new TextView(this);
        body.setText("Hello shkjhzsrjftjzhsjtdstyzujckcxyzhdtseyshdrhrdyatgg");
        linear.addView(body,params2);

        LayoutParams params3 =  new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
        ImageView image = new ImageView(this);
        image.setImageResource(R.mipmap.ic_launcher_round);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, KotlinActivity.class));
            }
        });
        linear.addView(image,params3);

    }
}
