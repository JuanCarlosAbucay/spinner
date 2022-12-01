package com.example.layout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

public class FormulariActivity extends Activity {
    ListView simpleListView;
    // array objects
    String[] courseList = {"Elden Ring", "Dark Souls", "Sekiro", "Bloodborne",
            "Demon Souls"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_formulari);
        simpleListView = (ListView) findViewById(R.id.simpleListView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                R.layout.item_view, R.id.itemTextView, courseList);
        simpleListView.setAdapter(arrayAdapter);

        ArrayAdapter<String> arrayAdapter2 = new ArrayAdapter<String>(this,
                R.layout.item_view, R.id.itemTextView, courseList);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.valors_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        Button button = (Button) findViewById(R.id.button);
        EditText et1 = (EditText) findViewById(R.id.Nom);
        EditText et2 = (EditText) findViewById(R.id.CogNom);
        EditText et3 = (EditText) findViewById(R.id.Tel);
        EditText et4 = (EditText) findViewById(R.id.Mail);
        Spinner spinner2 = (Spinner) findViewById(R.id.spinner);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FormulariActivity.this, ResumFormulariActivity.class);

                intent.putExtra("nom", et1.getText().toString());
                intent.putExtra("cognom", et2.getText().toString());
                intent.putExtra("tel", et3.getText().toString());
                intent.putExtra("mail", et4.getText().toString());
                intent.putExtra("jogo", spinner.getSelectedItem().toString());

                startActivity(intent);
            }
        });
    }
}
