package com.manuni.fragdatagetfromactifromedittxtwithbundle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editTxt);
    }

    public void sendData(View view) {
        String getData = editText.getText().toString().trim();
        editText.setText("");
        GetDataFragment fragment = new GetDataFragment();
        Bundle bundleData = new Bundle();
        bundleData.putString("key",getData);
        fragment.setArguments(bundleData);

        getSupportFragmentManager().beginTransaction().add(R.id.containerId,fragment).commit();

    }
}