package com.sajeewamalith.sqlitedatabase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText name,collage;
    MyCoreDatabase myData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=(EditText)findViewById(R.id.edit1);
        collage = (EditText)findViewById(R.id.edit2);

        myData = new MyCoreDatabase(this);
    }

    public void doSave(View view) {
        myData.inserDate(name.getText().toString(),collage.getText().toString());
    }

    public void doLoad(View view) {
        myData.getAll();
    }
}