package com.example.layout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class ButtonActivity extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_button);
        CheckBox checkBox = (CheckBox) findViewById(R.id.checkbox1);
        CheckBox checkBox1 = (CheckBox) findViewById(R.id.checkbox2);
        CheckBox checkBox2 = (CheckBox) findViewById(R.id.checkbox3);
        CheckBox checkBox3 = (CheckBox) findViewById(R.id.checkbox4);
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radiogroup);
        RadioButton radioButton = (RadioButton) findViewById(R.id.radiobutton);
        RadioButton radioButton2 = (RadioButton) findViewById(R.id.radiobutton2);
        RadioButton radioButton3 = (RadioButton) findViewById(R.id.radiobutton3);
        RadioButton radioButton4 = (RadioButton) findViewById(R.id.radiobutton4);
        RadioButton radioButton5 = (RadioButton) findViewById(R.id.radiobutton5);
        RadioButton radioButton6 = (RadioButton) findViewById(R.id.radiobutton6);
        Button submit = (Button) findViewById(R.id.submit);

        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkBox.isChecked()){
                    checkBox.setText("Eric García titular");
                }
                else {
                    checkBox.setText("No saques a Eric García, es muy malo");
                }
            }
        });

        checkBox1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkBox1.isChecked()){
                    checkBox1.setText("Morata titular");
                }
                else {
                    checkBox1.setText("No saques a Morata, es muy malo");
                }
            }
        });

        checkBox2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkBox2.isChecked()){
                    checkBox2.setText("Busquets titular");
                }
                else {
                    checkBox2.setText("Si no lo pones, ¿a quien pondrias entonces?");
                }
            }
        });

        checkBox3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkBox3.isChecked()){
                    checkBox3.setText("Balde titular");
                }
                else {
                    checkBox3.setText("Si no lo sacas, perdemos por 20 goles");
                }
            }
        });
        
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ButtonActivity.this, ResumActivity.class);
                String goty = "";
                String checkBoxText = "";
                if (radioButton.isChecked()){
                    goty = String.valueOf(radioButton.getText());
                }
                else if (radioButton2.isChecked()){
                    goty = String.valueOf(radioButton2.getText());
                }
                else if (radioButton3.isChecked()){
                    goty = String.valueOf(radioButton3.getText());
                }
                else if (radioButton4.isChecked()){
                    goty = String.valueOf(radioButton4.getText());
                }
                else if (radioButton5.isChecked()){
                    goty = String.valueOf(radioButton5.getText());
                }
                else if (radioButton6.isChecked()) {
                    goty = String.valueOf(radioButton6.getText());
                }

                if (checkBox.isChecked()){
                    checkBoxText += checkBox.getText() + "\n";
                }
                if (checkBox1.isChecked()){
                    checkBoxText += checkBox1.getText() + "\n";
                }
                if (checkBox2.isChecked()){
                    checkBoxText += checkBox2.getText() + "\n";
                }
                if (checkBox3.isChecked()){
                    checkBoxText += checkBox3.getText() + "\n";
                }

                intent.putExtra("GOTY", goty);
                intent.putExtra("CheckBoxText", checkBoxText);
                startActivity(intent);
            }
        });
    }
}
