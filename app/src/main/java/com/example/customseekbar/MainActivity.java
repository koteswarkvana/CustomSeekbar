package com.example.customseekbar;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private SeekBar sbLevelSelect;
    private LinearLayout lvFirstCircleSelect;
    private LinearLayout lvSecondCircleSelect;
    private LinearLayout lvThirdCircleSelect;
    private LinearLayout ll_default;
    private TextView tv_low;
    private TextView tv_medium;
    private TextView tv_high;

    private void init() {
        ll_default = findViewById(R.id.ll_default);
        tv_low = findViewById(R.id.tv_low);
        tv_medium = findViewById(R.id.tv_medium);
        tv_high = findViewById(R.id.tv_high);

        lvFirstCircleSelect = findViewById(R.id.ll_first_item);
        lvSecondCircleSelect = findViewById(R.id.ll_second_item);
        lvThirdCircleSelect = findViewById(R.id.ll_third_item);

        lvFirstCircleSelect.setOnClickListener(this);
        lvSecondCircleSelect.setOnClickListener(this);
        lvThirdCircleSelect.setOnClickListener(this);

        tv_low.setOnClickListener(this);
        tv_medium.setOnClickListener(this);
        tv_high.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ll_first_item:
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                    ll_default.setBackground(getResources().getDrawable(R.drawable.ic_group_select_one));
                }
                break;
            case R.id.ll_second_item:
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                    ll_default.setBackground(getResources().getDrawable(R.drawable.ic_group_select_two));
                }
                break;
            case R.id.ll_third_item:
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                    ll_default.setBackground(getResources().getDrawable(R.drawable.ic_group_select_three));
                }
                break;
            case R.id.tv_low:
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                    ll_default.setBackground(getResources().getDrawable(R.drawable.ic_group_select_one));
                }
                break;
            case R.id.tv_medium:
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                    ll_default.setBackground(getResources().getDrawable(R.drawable.ic_group_select_two));
                }
                break;
            case R.id.tv_high:
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                    ll_default.setBackground(getResources().getDrawable(R.drawable.ic_group_select_three));
                }
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seekbar);
        init();
    }

}
