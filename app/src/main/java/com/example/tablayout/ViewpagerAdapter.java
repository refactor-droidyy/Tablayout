package com.example.tablayout;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewpagerAdapter extends FragmentPagerAdapter {

    // creating list of fragment titles
    private final List<Fragment> Fragmentlist = new ArrayList<>();
    private final List<String>  Fragmentlisttitles = new ArrayList<>();




    public ViewpagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return Fragmentlist.get(position);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return Fragmentlisttitles.get(position);
    }

    @Override
    public int getCount() {
        return Fragmentlisttitles.size();
    }

    public void AddFragment(Fragment fragment,String Titles){

        Fragmentlist.add(fragment);
        Fragmentlisttitles.add(Titles);

    }

}
