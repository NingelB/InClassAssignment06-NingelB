package com.example.cmltdstudent.inclassassignment06_ningelb;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    private EditText mathSkill;
    private EditText gradeLevel;
    private CheckBox mastered;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mathSkill = (EditText) findViewById(R.id.math_skill);
        gradeLevel = (EditText) findViewById(R.id.grade_level);
        mastered = (CheckBox) findViewById(R.id.mastered);
    }

    public void submitMath(View view)
    {

        String submitSkill = mathSkill.getText().toString();
        int submitGradeLevel = Integer.parseInt(gradeLevel.getText().toString());
        boolean submitMastered = mastered.isChecked();

        MathSkills mathSkill = new MathSkills (submitSkill, submitGradeLevel, submitMastered);

        Intent data = new Intent();
        data.putExtra(KEYS.MATHSKILL, mathSkill);
        setResult(RESULT_OK, data);
        finish();

    }

}

