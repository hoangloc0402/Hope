package com.sunset.hope.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.sunset.hope.fragments.FragmentDonate;
import com.sunset.hope.fragments.FragmentRequest;

public class AdapterMainTab extends FragmentPagerAdapter {
        int numberOfTabs;
        public AdapterMainTab(FragmentManager fm, int NumOfTabs) {
            super(fm);
            this.numberOfTabs = NumOfTabs;
        }
        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    Fragment tab1 = new FragmentDonate();
                    return tab1;
                case 1:
                    Fragment tab2 = new FragmentRequest();
                    return tab2;
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            return numberOfTabs;
        }
    }