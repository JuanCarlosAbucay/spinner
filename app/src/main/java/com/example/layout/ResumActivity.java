package com.example.layout;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ResumActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_resum);

        TextView textView = (TextView) findViewById(R.id.resumCheckBox);
        TextView textView2 = (TextView) findViewById(R.id.resumRadioButton);

        String checkBoxText = ResumActivity.this.getIntent().getStringExtra("GOTY");
        textView.setText(checkBoxText);
        String roundButtonText = ResumActivity.this.getIntent().getStringExtra("CheckBoxText");
        textView2.setText(roundButtonText);
    }
}
