package com.example.layout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class DobleLayoutActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_doble);
        ImageButton btn = (ImageButton) findViewById(R.id.imageButton2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DobleLayoutActivity.this, FormulariActivity.class);
                startActivity(intent);
            }
        });
    }
}
