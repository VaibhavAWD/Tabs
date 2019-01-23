package com.vaibhavdhunde.android.tabs.adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.vaibhavdhunde.android.tabs.ui.ProfileFragment;
import com.vaibhavdhunde.android.tabs.ui.ProjectsListFragment;
import com.vaibhavdhunde.android.tabs.ui.SupportFragment;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    public SimpleFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new ProfileFragment();
            case 1:
                return new ProjectsListFragment();
            case 2:
                return new SupportFragment();
            default:
                return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Profile";
            case 1:
                return "Projects";
            case 2:
                return "Support";
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
