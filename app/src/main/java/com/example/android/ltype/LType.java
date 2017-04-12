package com.example.android.ltype;


import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;



public class LType extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ltype);
    }

    int vis_li = 0;
    int vis_lii = 0;
    int vis_liii = 0;
    int vis_si = 0;
    int vis_sii = 0;
    int vis_siii = 0;

    int vis_l = 0;
    int vis_s = 0;

    int vis = 0;


    int aud_i = 0;
    int aud_ii = 0;
    int aud_iii = 0;
    int aud_iv = 0;
    int aud_v = 0;
    int aud_vi = 0;

    int aud = 0;


    int kin_i = 0;
    int kin_ii = 0;
    int kin_iii = 0;
    int kin_iv = 0;
    int kin_v = 0;
    int kin_vi = 0;

    int kin = 0;


    String name;
    String analysisMessage;
    String major_type;
    String major_type2 = "empty";
    String equally_distributed = "negative";
    int learning_type_number = 1;



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
        System.out.println(vis_li);
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

        System.out.println(vis_li);
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
     * Composes E-Mail with analysis results
     *
     */

    public void composeEmail(View view) {

        String uriText =
                "mailto:" + "?subject=" + Uri.encode(getString(R.string.analysis_for, name)) + "&body=" + Uri.encode(analysisSummary());

        Uri uri = Uri.parse(uriText);

        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(uri);

        try {
            startActivity(Intent.createChooser(intent, getString(R.string.send_mail)));
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(LType.this, getString(R.string.toast_no_clients),Toast.LENGTH_SHORT).show();
        }
    }


    /**
     * Creates analysis result message
     *
     */

    private String analysisSummary() {
        setNameVariable();
        setMajorType();
        createMessagePart1();
        createMessagePart2();

        return analysisMessage;
    }


    /**
     * Sets name variable
     *
     */

    private void setNameVariable() {
        EditText nameTxt = (EditText) findViewById(R.id.name_view);
        name = nameTxt.getText().toString();
    }

    /**
     * Sets major_type variable
     *
     */

    public void setMajorType() {
        vis_l=vis_li+vis_lii+vis_liii;
        vis_s=vis_si+vis_sii+vis_siii;
        vis=vis_l+vis_s;
        aud=aud_i+aud_ii+aud_iii+aud_iv+aud_v+aud_iv;
        kin=kin_i+kin_ii+kin_iii+kin_iv+kin_v+kin_iv;

        if (vis == aud && vis == kin) {
            equally_distributed = getString(R.string.equally_distributed);
        }

        else if (vis > aud &&  vis > kin) {

            if (vis_l > vis_s && vis_s <= 3) {
                major_type = getString(R.string.vis_lin);
            }
            else if (vis_l < vis_s & vis_l <= 3) {
                major_type = getString(R.string.vis_spa);
            }
            else {
                major_type = getString(R.string.vis_lin_vis_spa);
            }
        }

        else if (vis == aud & vis > kin) {
            learning_type_number = 2;
            major_type = getString(R.string.vis_abbrev);
            major_type2 = getString(R.string.aud);
        }

        else if (vis == kin && vis > aud) {
            learning_type_number = 2;
            major_type = getString(R.string.vis_abbrev);
            major_type2 = getString(R.string.kin);
        }


        else if (aud > vis &&  aud > kin) {
            major_type = getString(R.string.aud);
        }

        else if (aud == kin && aud > vis) {
            learning_type_number = 2;
            major_type = getString(R.string.aud_abbrev);
            major_type2 = getString(R.string.kin);
        }

        else if (kin > vis &&  kin > aud) {
            major_type = getString(R.string.kin);
        }
    }

    /**
     * Creates first part of result message (major learning type)
     *
     */


    private void createMessagePart1() {

        analysisMessage = getString(R.string.analysis_for, name);

        analysisMessage = analysisMessage + getString(R.string.double_break) + getString(R.string.result) + getString(R.string.double_break);
        analysisMessage = analysisMessage + getString(R.string.results_visual) + vis + getString(R.string.of_points);
        analysisMessage = analysisMessage + getString(R.string.results_auditory) + aud + getString(R.string.of_points);
        analysisMessage = analysisMessage + getString(R.string.results_kinesthetic) + kin + getString(R.string.of_points) + getString(R.string.double_break);
        analysisMessage = analysisMessage + getString(R.string.description) + getString(R.string.double_break);



        if (equally_distributed.equals("negative"))  {
             if (major_type2.equals("empty")) {
                 analysisMessage = analysisMessage + name + getString(R.string.is_a) + addN() + major_type + "." + getString(R.string.double_break);
                 addLTypeDescription1();
             }
             else {
                 analysisMessage = analysisMessage + name + getString(R.string.is_a) + addN() + major_type + getString(R.string.and) + major_type2 + getString(R.string.double_break);
                 addLTypeDescription2();
             }
        }
        else {
            analysisMessage = analysisMessage + "\n\n" + equally_distributed + ".\n\n";
        }
    }


    /**
     * Adds descriptions of learning types to first part of result message for 1 major learning type
     *
     */

    private void addLTypeDescription1() {
        if(major_type.equals(getString(R.string.vis_lin_vis_spa)) || major_type.equals(getString(R.string.vis_lin)) || major_type.equals(getString(R.string.vis_spa))) {
            analysisMessage = analysisMessage + getString(R.string.visual_style)  + ".\n\n";
        }

        else if(major_type.equals(getString(R.string.aud))) {
            analysisMessage = analysisMessage + getString(R.string.auditory_style)  + ".\n\n";
        }

        else if(major_type.equals(getString(R.string.kin))) {
            analysisMessage = analysisMessage + getString(R.string.kinesthetic_style)  + ".\n\n";
        }

    }


    /**
     * Adds descriptions of learning types to first part of result message for 2 major learning types
     *
     */

    private void addLTypeDescription2() {
        if(major_type.equals(getString(R.string.vis_abbrev)) && major_type2.equals(getString(R.string.aud))) {
            analysisMessage = analysisMessage + getString(R.string.visual_style)  + ".\n\n";
            analysisMessage = analysisMessage + getString(R.string.auditory_style)  + ".\n\n";
        }

        else if(major_type.equals(getString(R.string.vis_abbrev)) && major_type2.equals(getString(R.string.kin))) {
            analysisMessage = analysisMessage + getString(R.string.visual_style)  + ".\n\n";
            analysisMessage = analysisMessage + getString(R.string.kinesthetic_style)  + ".\n\n";
        }

        else if(major_type.equals(getString(R.string.aud_abbrev)) && major_type2.equals(getString(R.string.vis))) {
            analysisMessage = analysisMessage + getString(R.string.auditory_style)  + ".\n\n";
            analysisMessage = analysisMessage + getString(R.string.visual_style)  + ".\n\n";

        }

        else if(major_type.equals(getString(R.string.aud_abbrev)) && major_type2.equals(getString(R.string.kin))) {
            analysisMessage = analysisMessage + getString(R.string.auditory_style)  + ".\n\n";
            analysisMessage = analysisMessage + getString(R.string.kinesthetic_style)  + ".\n\n";

        }

    }

    /**
     * Adds "n" to article "a" if following string is "auditory learning type"
     *
     */

    private String addN() {
        if (major_type.equals(getString(R.string.aud)))   {
            return getString(R.string.add_n);
        }
        else {
            return getString(R.string.add_space);
        }
    }


    /**
     * Creates second part of result message
     *
     */

    public void createMessagePart2() {
        if(major_type.equals(getString(R.string.vis_lin_vis_spa)) && kin > 6 && aud < 7 || major_type.equals(getString(R.string.vis_lin)) && kin > 6 && aud < 7|| major_type.equals(getString(R.string.vis_spa)) && kin > 6 && aud < 7|| major_type.equals(getString(R.string.aud)) && kin > 6 && vis < 7) {
            analysisMessage = analysisMessage + name + getString(R.string.also_shows_kin) + getString(R.string.double_break);
            analysisMessage = analysisMessage + getString(R.string.kinesthetic_style)  + "." + getString(R.string.double_break);
        }

        else if(major_type.equals(getString(R.string.vis_lin_vis_spa)) && aud > 6 && kin < 7 || major_type.equals(getString(R.string.vis_lin)) && aud > 6 && kin < 7 || major_type.equals(getString(R.string.vis_spa)) && aud > 6 && kin < 7 || major_type.equals(getString(R.string.kin)) && aud > 6 && vis < 7) {
            analysisMessage = analysisMessage + name + getString(R.string.also_shows_aud) + getString(R.string.double_break);
            analysisMessage = analysisMessage + getString(R.string.auditory_style)  + "." + getString(R.string.double_break);
        }

        else if(major_type.equals(getString(R.string.aud)) && vis > 6 && kin < 7|| major_type.equals(getString(R.string.kin)) && vis > 6 && aud < 7) {
            analysisMessage = analysisMessage + name + getString(R.string.also_shows_vis) + getString(R.string.double_break);
            analysisMessage = analysisMessage + getString(R.string.visual_style)  + "." + getString(R.string.double_break);
        }
        else {
            analysisMessage = analysisMessage + getString(R.string.other_features) + getString(R.string.double_break);
        }

    }


    /**
     * Switches visibility of a View
     *
     * @param layoutName of view
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
