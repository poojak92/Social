package com.social.Fragment;

import android.content.Context;
import android.support.v4.app.Fragment;

import com.social.Callback.Fragment.FragmentPresenter;
import com.social.Fragment.base.BaseFragment;
import com.social.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class GalleryFragment extends BaseFragment {
    public static String TAG = GalleryFragment.class.getName();
    FragmentPresenter fragmentPresenter;

    public GalleryFragment() {
        // Required empty public constructor
    }

    public static GalleryFragment newInstance() {
        return new GalleryFragment();
    }

    @Override
    protected int getRootView() {
        return R.layout.fragment_gallery;
    }


    @Override
    protected void init() {
    }
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        fragmentPresenter = (FragmentPresenter) mParentActivity;
    }

    @Override
    public void onResume() {
        super.onResume();
        fragmentPresenter.passFragmentTag(GalleryFragment.TAG);
    }

}