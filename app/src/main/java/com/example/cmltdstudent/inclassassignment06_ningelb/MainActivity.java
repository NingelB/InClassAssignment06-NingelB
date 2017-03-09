package com.example.cmltdstudent.inclassassignment06_ningelb;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView displayText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayText = (TextView) findViewById(R.id.display_text);
    }

    public void addMathSkill(View view)
    {
        Intent intent = new Intent (this, SecondActivity.class);
        startActivityForResult(intent, RequestCodes.ADD_MATHSKILL);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == RequestCodes.ADD_MATHSKILL && resultCode == RESULT_OK)
        {
            MathSkills mathSkills = (MathSkills) data.getSerializableExtra(KEYS.MATHSKILL);
            displayText.setText(mathSkills.toString() + displayText.getText().toString());
        }
    }
}

