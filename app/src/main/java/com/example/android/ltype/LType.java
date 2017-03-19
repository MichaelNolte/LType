package com.example.android.ltype;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class LType extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ltype);
    }

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
