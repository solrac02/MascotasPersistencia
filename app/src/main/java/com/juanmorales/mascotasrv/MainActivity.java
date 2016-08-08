package com.juanmorales.mascotasrv;

import android.app.Activity;
import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.juanmorales.mascotasrv.adapter.MascotaAdaptador;
import com.juanmorales.mascotasrv.adapter.PagerAdapter;
import com.juanmorales.mascotasrv.fragment.PerfilMascotaFragment;
import com.juanmorales.mascotasrv.fragment.RecyclerViewMascotasFragment;
import com.juanmorales.mascotasrv.fragment.RecyclerViewTopMascotas;
import com.juanmorales.mascotasrv.menu.Acerca_de;
import com.juanmorales.mascotasrv.menu.ContactoActivity;
import com.juanmorales.mascotasrv.pojo.Mascota;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    // Se llevan las variables al RecyclerViewMascotasFragment
    /*private RecyclerView listaMascotas;
    ArrayList<Mascota> mascotas;
    public MascotaAdaptador adaptador;
    Activity activity;
    */

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Incluyendo la barra a cada activitie
        //Toolbar miActionBar = (Toolbar)findViewById(R.id.miActionBar);
        //setSupportActionBar(miActionBar);

        toolbar = (Toolbar)findViewById(R.id.toolbar);
        tabLayout = (TabLayout)findViewById(R.id.tabLayout);
        viewPager = (ViewPager)findViewById(R.id.viewPager);

        //llamar el metotdo Pager
        setUpViewPager();


        //Se llevan las declaraciones al RecyclerViewMascotasFragment
        /*
        listaMascotas = (RecyclerView)findViewById(R.id.rvMascotas);
        LinearLayoutManager llm_mascotas = new LinearLayoutManager(this);
        llm_mascotas.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(llm_mascotas);
        inicializarListaMascotas();
        inicializarAdaptador();
        */
        ImageButton btnStart = (ImageButton)findViewById(R.id.btnStart);
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Top 5 Mascotas", Toast.LENGTH_SHORT).show(); // Mensaje al darle click a la imagen
                Intent intent = new Intent(MainActivity.this,MascotasFavoritasActivity.class);
                startActivity(intent);

            }
        });

        if (toolbar != null){
            setSupportActionBar(toolbar);
        }

    }

    //Se llevan estos metodos al RecyclerviewMascotasFragment
    /*
    public void inicializarAdaptador(){
        adaptador = new MascotaAdaptador(mascotas,this);
        listaMascotas.setAdapter(adaptador);
    }

    public void inicializarListaMascotas(){
        mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota("Dashita", R.drawable.mascota_1, "3", R.drawable.dogbone_1, R.drawable.dogbone_2));
        mascotas.add(new Mascota("Aldo", R.drawable.maecota_2, "2",R.drawable.dogbone_1, R.drawable.dogbone_2));
        mascotas.add(new Mascota("Grenitas", R.drawable.mascota_3, "4",R.drawable.dogbone_1, R.drawable.dogbone_2));
        mascotas.add(new Mascota("Dona", R.drawable.mascota_4, "4",R.drawable.dogbone_1, R.drawable.dogbone_2));
        mascotas.add(new Mascota("manchas", R.drawable.mascota_5, "1",R.drawable.dogbone_1, R.drawable.dogbone_2));
        mascotas.add(new Mascota("Deisy", R.drawable.mascota_6, "5",R.drawable.dogbone_1, R.drawable.dogbone_2));
        mascotas.add(new Mascota("Laydi", R.drawable.mascota_7, "5",R.drawable.dogbone_1, R.drawable.dogbone_2));
        mascotas.add(new Mascota("Mister", R.drawable.mascota_8, "5",R.drawable.dogbone_1, R.drawable.dogbone_2));
        mascotas.add(new Mascota("Sauer", R.drawable.mascota_9, "5",R.drawable.dogbone_1, R.drawable.dogbone_2));
        mascotas.add(new Mascota("Dino", R.drawable.mascota_10, "5",R.drawable.dogbone_1, R.drawable.dogbone_2));

    }
    */
    // paqra pintar los menus de opciones
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_opciones, menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){

            case R.id.mContacto:
                Toast.makeText(getApplicationContext(), getResources().getString(R.string.menu_contacto), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this,ContactoActivity.class);
                startActivity(intent);
                break;

            case R.id.mAcercaDe:
                Toast.makeText(getApplicationContext(), getResources().getString(R.string.menu_acercade), Toast.LENGTH_SHORT).show();
                Intent i = new Intent(this,Acerca_de.class);
                startActivity(i);
                break;
        }
        return super.onOptionsItemSelected(item);
    }


    // devolviendo una lista de Fragments
    private ArrayList<Fragment> agregarFragments(){
        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(new RecyclerViewMascotasFragment());
        fragments.add(new PerfilMascotaFragment());
        //fragments.add(new RecyclerViewTopMascotas());
        return fragments;

    }

    //Creare metodo para  el view pager
    private void setUpViewPager(){
        viewPager.setAdapter(new PagerAdapter(getSupportFragmentManager(),agregarFragments()));
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_action_home);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_action_perfil);


    }
}
