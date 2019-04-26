package com.social.activity;

import android.os.Bundle;

import com.social.R;
import com.social.activity.base.BaseToolbarActivity;

public class FollwersActivity extends BaseToolbarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_follwer);
        super.onCreate(savedInstanceState);
        showLeftButton(R.drawable.ic_toolbar_back, new ILeftClickListener() {
            @Override
            public void onLeftButtonClicked() {
                onBackPressed();
            }
        });
        showTitle(getResources().getString(R.string.followers));
    }


}