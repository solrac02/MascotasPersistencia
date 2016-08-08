package com.juanmorales.mascotasrv.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by juan.morales on 02/08/2016.
 */
public class PagerAdapter extends FragmentPagerAdapter {

    private ArrayList<Fragment> fragments;

    public PagerAdapter(FragmentManager fm, ArrayList<Fragment> fragments){
        super(fm);
        this.fragments = fragments;
    }

    public Fragment getItem(int position){
        return fragments.get(position);
    }

    public int getCount(){
        return fragments.size();
    }

}
