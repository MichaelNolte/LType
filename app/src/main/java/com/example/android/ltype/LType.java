package com.example.android.ltype;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;

import static android.R.attr.checked;
import static android.R.attr.id;

public class LType extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ltype);
    }

    int vis_li;
    int vis_lii;
    int vis_liii;
    int vis_si;
    int vis_sii;
    int vis_siii;

    int aud_i;
    int aud_ii;
    int aud_iii;
    int aud_iv;
    int aud_v;
    int aud_vi;

    int kin_i;
    int kin_ii;
    int kin_iii;
    int kin_iv;
    int kin_v;
    int kin_vi;

    /**
     * Makes app description visible after pushing app description button
     *
     */

    public void popUpAppDescription(View view) {
        TextView appDescriptionTextView = (TextView) findViewById(R.id.app_description_text_view);
        toggle(appDescriptionTextView);
    }


    /**
     * Makes type description visible after pushing learning type button
     *
     */

    public void popUpLearningTypeInfo(View view) {
        LinearLayout typeDescriptionLinearLayout = (LinearLayout) findViewById(R.id.type_description_linear_layout);
        toggle(typeDescriptionLinearLayout);
    }

    /**
     * Makes questionaire visible after pushing questionaire button
     *
     */

    public void popUpQuestionaire(View view) {
        LinearLayout questionaireLinearLayout = (LinearLayout) findViewById(R.id.questionaire_linear_layout);
        toggle(questionaireLinearLayout);
    }

    /**
     * RadioButton Functions assigning question score to question variables
     *
     */

    public void questionButtonVisLi(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.ques_vis_li1:
                if (checked)
                    vis_li=0;
                    break;
            case R.id.ques_vis_li2:
                if (checked)
                    vis_li=1;
                    break;
            case R.id.ques_vis_li3:
                if (checked)
                    vis_li=2;
                    break;
        }
    }

    public void questionButtonVisLii(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.ques_vis_lii1:
                if (checked)
                    vis_lii=0;
                break;
            case R.id.ques_vis_lii2:
                if (checked)
                    vis_lii=1;
                break;
            case R.id.ques_vis_lii3:
                if (checked)
                    vis_lii=2;
                break;
        }
    }

    public void questionButtonVisLiii(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.ques_vis_liii1:
                if (checked)
                    vis_liii=0;
                break;
            case R.id.ques_vis_liii2:
                if (checked)
                    vis_liii=1;
                break;
            case R.id.ques_vis_liii3:
                if (checked)
                    vis_liii=2;
                break;
        }
    }

    public void questionButtonVisSi(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.ques_vis_si1:
                if (checked)
                    vis_si=0;
                break;
            case R.id.ques_vis_si2:
                if (checked)
                    vis_si=1;
                break;
            case R.id.ques_vis_si3:
                if (checked)
                    vis_si=2;
                break;
        }
    }

    public void questionButtonVisSii(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.ques_vis_sii1:
                if (checked)
                    vis_sii=0;
                break;
            case R.id.ques_vis_sii2:
                if (checked)
                    vis_sii=1;
                break;
            case R.id.ques_vis_sii3:
                if (checked)
                    vis_sii=2;
                break;
        }
    }

    public void questionButtonVisSiii(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.ques_vis_siii1:
                if (checked)
                    vis_siii=0;
                break;
            case R.id.ques_vis_siii2:
                if (checked)
                    vis_siii=1;
                break;
            case R.id.ques_vis_siii3:
                if (checked)
                    vis_siii=2;
                break;
        }
    }


    public void questionButtonAudI(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.ques_aud_i1:
                if (checked)
                    aud_i=0;
                break;
            case R.id.ques_aud_i2:
                if (checked)
                    aud_i=1;
                break;
            case R.id.ques_aud_i3:
                if (checked)
                    aud_i=2;
                break;
        }
    }

    public void questionButtonAudII(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.ques_aud_ii1:
                if (checked)
                    aud_ii=0;
                break;
            case R.id.ques_aud_ii2:
                if (checked)
                    aud_ii=1;
                break;
            case R.id.ques_aud_ii3:
                if (checked)
                    aud_ii=2;
                break;
        }
    }


    public void questionButtonAudIII(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.ques_aud_iii1:
                if (checked)
                    aud_iii=0;
                break;
            case R.id.ques_aud_iii2:
                if (checked)
                    aud_iii=1;
                break;
            case R.id.ques_aud_iii3:
                if (checked)
                    aud_iii=2;
                break;
        }
    }


    public void questionButtonAudIV(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.ques_aud_iv1:
                if (checked)
                    aud_iv=0;
                break;
            case R.id.ques_aud_iv2:
                if (checked)
                    aud_iv=1;
                break;
            case R.id.ques_aud_iv3:
                if (checked)
                    aud_iv=2;
                break;
        }
    }


    public void questionButtonAudV(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.ques_aud_v1:
                if (checked)
                    aud_v=0;
                break;
            case R.id.ques_aud_v2:
                if (checked)
                    aud_v=1;
                break;
            case R.id.ques_aud_v3:
                if (checked)
                    aud_v=2;
                break;
        }
    }

    public void questionButtonAudVI(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.ques_aud_vi1:
                if (checked)
                    aud_vi=0;
                break;
            case R.id.ques_aud_vi2:
                if (checked)
                    aud_vi=1;
                break;
            case R.id.ques_aud_vi3:
                if (checked)
                    aud_vi=2;
                break;
        }
    }


    public void questionButtonKinI(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.ques_kin_i1:
                if (checked)
                    kin_i=0;
                break;
            case R.id.ques_kin_i2:
                if (checked)
                    kin_i=1;
                break;
            case R.id.ques_kin_i3:
                if (checked)
                    kin_i=2;
                break;
        }
    }

    public void questionButtonKinII(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.ques_kin_ii1:
                if (checked)
                    kin_ii=0;
                break;
            case R.id.ques_kin_ii2:
                if (checked)
                    kin_ii=1;
                break;
            case R.id.ques_kin_ii3:
                if (checked)
                    kin_ii=2;
                break;
        }
    }


    public void questionButtonKinIII(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.ques_kin_iii1:
                if (checked)
                    kin_iii=0;
                break;
            case R.id.ques_kin_iii2:
                if (checked)
                    kin_iii=1;
                break;
            case R.id.ques_kin_iii3:
                if (checked)
                    kin_iii=2;
                break;
        }
    }


    public void questionButtonKinIV(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.ques_kin_iv1:
                if (checked)
                    kin_iv=0;
                break;
            case R.id.ques_kin_iv2:
                if (checked)
                    kin_iv=1;
                break;
            case R.id.ques_kin_iv3:
                if (checked)
                    kin_iv=2;
                break;
        }
    }


    public void questionButtonKinV(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.ques_kin_v1:
                if (checked)
                    kin_v=0;
                break;
            case R.id.ques_kin_v2:
                if (checked)
                    kin_v=1;
                break;
            case R.id.ques_kin_v3:
                if (checked)
                    kin_v=2;
                break;
        }
    }

    public void questionButtonKinVI(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.ques_kin_vi1:
                if (checked)
                    kin_vi=0;
                break;
            case R.id.ques_kin_vi2:
                if (checked)
                    kin_vi=1;
                break;
            case R.id.ques_kin_vi3:
                if (checked)
                    kin_vi=2;
                break;
        }
    }




    /**
     * Switches visibility of a View
     *
     * @param layoutName of view to switch visibility
     */

    private void toggle (View layoutName) {
        if(layoutName.getVisibility() == View.GONE) {
            layoutName.setVisibility(View.VISIBLE);
        }
        else {
            layoutName.setVisibility(View.GONE);
        }
    }

}
