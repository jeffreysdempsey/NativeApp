package com.example.jeffdempsey.nativeapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.view.View;

public class MainActivity extends Activity {

    final RadioGroup group1 = (RadioGroup) findViewById(R.id.orientation);
    group1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup.group, int checkedId) {
            switch (checkedId) {
                case R.id.horizontal:
                    group.setOrientation(LinearLayout.HORIZONTAL);
                    break;
                case R.id.vertical:
                    group.setOrientation(LinearLayout.VERTICAL);
                    break;
            }
        }
    });

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick (View view) {
        EditText input = (EditText) findViewById(R.id.main_input);
        String string = input.getText().toString();
        Toast.makeText(this, string, Toast.LENGTH_LONG).show();
    }

}
