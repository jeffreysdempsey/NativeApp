package com.example.jeffdempsey.nativeapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.view.View;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.ArrayAdapter;

public class MainActivity extends Activity {
        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RadioGroup group1 = (RadioGroup) findViewById(R.id.orientation);
        group1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
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
        Spinner spinner = (Spinner) findViewById(R.id.ides);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.ides_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);
    }

    public void button1onClick (View view) {
        EditText input = (EditText) findViewById(R.id.main_input);
        String string = input.getText().toString();
        Toast.makeText(this, string, Toast.LENGTH_LONG).show();
    }

    public void button2onClick (View view) {
        ImageView pic1 = (ImageView) findViewById(R.id.pic1);
        pic1.setImageDrawable(getResources().getDrawable(R.drawable.blue, null));
    }

}
