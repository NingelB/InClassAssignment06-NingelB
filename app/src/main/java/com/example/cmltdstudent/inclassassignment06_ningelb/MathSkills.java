package com.example.cmltdstudent.inclassassignment06_ningelb;

import java.io.Serializable;

public class MathSkills implements Serializable
{
    private String skill;
    private int grade;
    private boolean mastered;

    public MathSkills(String skill, int grade, boolean mastered) {
        this.skill = skill;
        this.grade = grade;
        this.mastered = mastered;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public boolean isMastered() {
        return mastered;
    }

    public void setMastered(boolean mastered) {
        this.mastered = mastered;
    }

    @Override
    public String toString() {
        return "Math Skill: " + skill + "" + "\n" + "Grade Level: " + grade + "" + "\n" + "Mastered: " + mastered + "\n";
    }
}
