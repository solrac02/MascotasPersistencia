package com.juanmorales.mascotasrv;

import android.app.Activity;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.juanmorales.mascotasrv.adapter.MascotaAdaptador;
import com.juanmorales.mascotasrv.adapter.PagerAdapter;
import com.juanmorales.mascotasrv.fragment.PerfilMascotaFragment;
import com.juanmorales.mascotasrv.fragment.RecyclerViewMascotasFragment;
import com.juanmorales.mascotasrv.fragment.RecyclerViewTopMascotas;
import com.juanmorales.mascotasrv.pojo.Mascota;

import java.util.ArrayList;

public class MascotasFavoritasActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private Toolbar toolbar;
    public MascotaAdaptador adaptador;
    Activity activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascotas_favoritas);

        //Incluyendo la barra a cada activitie
        //Toolbar miActionBar = (Toolbar)findViewById(R.id.miActionBar);
        //setSupportActionBar(miActionBar);
        toolbar = (Toolbar)findViewById(R.id.toolbar);
        tabLayout = (TabLayout)findViewById(R.id.tabLayout);
        viewPager = (ViewPager)findViewById(R.id.viewPager);

        //llamar el metotdo Pager
        setUpViewPager();

        if (toolbar != null){
            setSupportActionBar(toolbar);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    private ArrayList<Fragment> agregarFragments(){
        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(new RecyclerViewTopMascotas());
        return fragments;

    }
    //Creare metodo para  el view pager
    private void setUpViewPager(){
        viewPager.setAdapter(new PagerAdapter(getSupportFragmentManager(),agregarFragments()));
        tabLayout.setupWithViewPager(viewPager);

    }
}
