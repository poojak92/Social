package com.social.Utils;

import android.content.Context;


import com.social.Model.BottomBarItem;
import com.social.R;
import com.social.constants.AppConstants;

import java.util.HashMap;
import java.util.Map;

public class BottomBarSingleton {


    private Map<String, BottomBarItem> bottomBarItemMap;
    private static Context mContext;

    private static BottomBarSingleton bottomBarUtils;

    public static BottomBarSingleton getInstance(Context context) {

        if (bottomBarUtils == null) {
            bottomBarUtils = new BottomBarSingleton();
            mContext = context;
        }
        return bottomBarUtils;
    }

    public void setBottomData() {

        bottomBarItemMap = new HashMap<>();

        BottomBarItem bottomBarhome = new BottomBarItem(mContext);
        bottomBarhome.setDrawablesFromId(R.drawable.ic_b_home, R.drawable.ic_home);
        bottomBarItemMap.put(AppConstants.BottomBar.ViewTags.VIEW_TAG_HOME, bottomBarhome);

        BottomBarItem bottomBarGallery = new BottomBarItem(mContext);
        bottomBarGallery.setDrawablesFromId(R.drawable.ic_b_gallery,R.drawable.ic_gallery);
        bottomBarItemMap.put(AppConstants.BottomBar.ViewTags.VIEW_TAG_GALLERY, bottomBarGallery);


        BottomBarItem bottomBarCreate = new BottomBarItem(mContext);
        bottomBarCreate.setDrawablesFromId( R.drawable.ic_comment,R.drawable.ic_comment);
        bottomBarItemMap.put(AppConstants.BottomBar.ViewTags.VIEW_TAG_CREATE, bottomBarCreate);

        BottomBarItem bottomBarVideo = new BottomBarItem(mContext);
        bottomBarVideo.setDrawablesFromId(R.drawable.ic_b_video,R.drawable.ic_video);
        bottomBarItemMap.put(AppConstants.BottomBar.ViewTags.VIEW_TAG_VIDEO, bottomBarVideo);

        BottomBarItem bottomBarProfile = new BottomBarItem(mContext);
        bottomBarProfile.setDrawablesFromId(R.drawable.ic_b_user,R.drawable.ic_profile);
        bottomBarItemMap.put(AppConstants.BottomBar.ViewTags.VIEW_TAG_PROFILE, bottomBarProfile);


    }

    public Map<String, BottomBarItem> getBottomBarItemMap() {
        return bottomBarItemMap;
    }
}
