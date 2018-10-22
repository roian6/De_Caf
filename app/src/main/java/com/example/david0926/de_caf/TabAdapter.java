package com.example.david0926.de_caf;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.david0926.de_caf.Caffeine.Tab_Caffeine;
import com.example.david0926.de_caf.Health.Tab_Health;
import com.example.david0926.de_caf.Log.Tab_Log;

public class TabAdapter extends FragmentStatePagerAdapter{

    int tabNum;

    public TabAdapter(FragmentManager fm, int tabNum) {
        super(fm);
        this.tabNum = tabNum;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                Tab_Caffeine tab1 = new Tab_Caffeine();
                return tab1;
            case 1:
                Tab_Log tab2 = new Tab_Log();
                return tab2;
            case 2:
                Tab_Health tab3 = new Tab_Health();
                return tab3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabNum;
    }
}
