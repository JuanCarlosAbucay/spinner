package com.example.layout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Spinner;
import android.widget.TextView;

public class ResumFormulariActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_resumformulari);

        TextView textView = (TextView) findViewById(R.id.nom);
        TextView textView2 = (TextView) findViewById(R.id.cognom);
        TextView textView3 = (TextView) findViewById(R.id.tel);
        TextView textView4 = (TextView) findViewById(R.id.mail);
        TextView textView5 = (TextView) findViewById(R.id.spinner);

        String nom = ResumFormulariActivity.this.getIntent().getStringExtra("nom");
        textView.setText(nom);
        String cognom = ResumFormulariActivity.this.getIntent().getStringExtra("cognom");
        textView2.setText(cognom);
        String tel = ResumFormulariActivity.this.getIntent().getStringExtra("tel");
        textView3.setText(tel);
        String mail = ResumFormulariActivity.this.getIntent().getStringExtra("mail");
        textView4.setText(mail);
        String jogo = ResumFormulariActivity.this.getIntent().getStringExtra("jogo");
        textView5.setText(jogo);
    }
}
