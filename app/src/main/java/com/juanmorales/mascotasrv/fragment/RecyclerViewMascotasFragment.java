package com.juanmorales.mascotasrv.fragment;


import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.juanmorales.mascotasrv.R;
import com.juanmorales.mascotasrv.adapter.MascotaAdaptador;
import com.juanmorales.mascotasrv.pojo.Mascota;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RecyclerViewMascotasFragment extends Fragment {

    private RecyclerView listaMascotas;
    ArrayList<Mascota> mascotas;
    public MascotaAdaptador adaptador;
    Activity activity;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v =inflater.inflate(R.layout.fragment_recycler_view_mascotas_fragment, container, false);
        listaMascotas = (RecyclerView)v.findViewById(R.id.rvMascotas);
        LinearLayoutManager llm_mascotas = new LinearLayoutManager(getContext());
        llm_mascotas.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(llm_mascotas);
        inicializarListaMascotas();
        inicializarAdaptador();

        return v;


    }

    public void inicializarAdaptador(){
        adaptador = new MascotaAdaptador(mascotas,getActivity());
        listaMascotas.setAdapter(adaptador);
    }

    public void inicializarListaMascotas(){
        mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota("Grenitas", R.drawable.mascota_1, 3, R.drawable.dogbone_1, R.drawable.dogbone_2));
        mascotas.add(new Mascota("Aldo", R.drawable.maecota_2, 2,R.drawable.dogbone_1, R.drawable.dogbone_2));
        mascotas.add(new Mascota("Dashita", R.drawable.mascota_3, 4,R.drawable.dogbone_1, R.drawable.dogbone_2));
        mascotas.add(new Mascota("Dona", R.drawable.mascota_4, 4,R.drawable.dogbone_1, R.drawable.dogbone_2));
        mascotas.add(new Mascota("manchas", R.drawable.mascota_5, 1,R.drawable.dogbone_1, R.drawable.dogbone_2));
        mascotas.add(new Mascota("Deisy", R.drawable.mascota_6, 5,R.drawable.dogbone_1, R.drawable.dogbone_2));
        mascotas.add(new Mascota("Laydi", R.drawable.mascota_7, 5,R.drawable.dogbone_1, R.drawable.dogbone_2));
        mascotas.add(new Mascota("Mister", R.drawable.mascota_8, 5,R.drawable.dogbone_1, R.drawable.dogbone_2));
        mascotas.add(new Mascota("Sauer", R.drawable.mascota_9, 5,R.drawable.dogbone_1, R.drawable.dogbone_2));
        mascotas.add(new Mascota("Dino", R.drawable.mascota_10, 5,R.drawable.dogbone_1, R.drawable.dogbone_2));

    }

}
