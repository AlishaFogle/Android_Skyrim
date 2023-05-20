package com.haman.skyrimcalculator;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class SkillsActivity extends AppCompatActivity {
    EditText alchemySkill;
    RadioButton alchemist1;

    CheckBox chkPhysician;
    CheckBox chkBenefactor;
    CheckBox chkPoisoner;
    CheckBox chkPurity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skills);

        alchemySkill = (EditText) findViewById(R.id.edtAlchemySkill);

        alchemist1 = (RadioButton) findViewById(R.id.rdo1);
        chkPhysician = (CheckBox) findViewById(R.id.chkPhysicianPerk);
        chkBenefactor = (CheckBox) findViewById(R.id.chkBenefactorPerk);
        chkPoisoner = (CheckBox) findViewById(R.id.chkPoisonerPerk);
        chkPurity = (CheckBox) findViewById(R.id.chkPurityPerk);
    }
}