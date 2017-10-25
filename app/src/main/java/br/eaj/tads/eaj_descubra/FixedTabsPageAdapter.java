package br.eaj.tads.eaj_descubra;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class FixedTabsPageAdapter extends FragmentPagerAdapter {


    public FixedTabsPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new FragmentRecycler();
            case 1:
                return new FragmentDetalhes();
            case 2:
                return new FragmentMapa();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    public CharSequence getPageTitle(int position){
        switch (position){
            case 0:
                return "Setor EAJ";
            case 1:
                return "Detalhes";
            case 2:
                return "Mapa";
            default:
                return null;
        }
    }
}
