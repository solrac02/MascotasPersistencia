package com.juanmorales.mascotasrv.fragment;


import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.juanmorales.mascotasrv.R;
import com.juanmorales.mascotasrv.adapter.MascotaAdaptador;
import com.juanmorales.mascotasrv.pojo.Mascota;
import com.mikhaellopez.circularimageview.CircularImageView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class PerfilMascotaFragment extends Fragment {

    private RecyclerView listaMascotas;
    ArrayList<Mascota> mascotas;
    public MascotaAdaptador adaptador;
    Activity activity;



    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =inflater.inflate(R.layout.fragment_perfil_mascota, container, false);
        listaMascotas = (RecyclerView)v.findViewById(R.id.rvTopMascotasFrag);
        GridLayoutManager glm_mascotas = new GridLayoutManager(getContext(),3);
        listaMascotas.setLayoutManager(glm_mascotas);
        inicializarListaMascotasGrid();
        inicializarAdaptador();

        CircularImageView circularImageView = (CircularImageView)v.findViewById(R.id.civ_mascota);
        circularImageView.setBorderColor(getResources().getColor(R.color.colorPrimaryDark));
        circularImageView.setBorderWidth(10);
        // Add Shadow with default param
        circularImageView.addShadow();
         // or with custom param
        circularImageView.setShadowRadius(15);
        circularImageView.setShadowColor(Color.GREEN);

        // Inflate the layout for this fragment
        return v;
    }

    public void inicializarAdaptador(){
        adaptador = new MascotaAdaptador(mascotas,getActivity());
        listaMascotas.setAdapter(adaptador);
    }

    public void inicializarListaMascotasGrid(){
        mascotas = new ArrayList<Mascota>();
        mascotas.add(new Mascota(R.drawable.mascota_3, 5, R.drawable.dogbone_2));
        mascotas.add(new Mascota(R.drawable.mascota_3, 0, R.drawable.dogbone_2));
        mascotas.add(new Mascota(R.drawable.mascota_3, 4, R.drawable.dogbone_2));
        mascotas.add(new Mascota(R.drawable.mascota_3, 7, R.drawable.dogbone_2));
        mascotas.add(new Mascota(R.drawable.mascota_3, 4, R.drawable.dogbone_2));
        mascotas.add(new Mascota(R.drawable.mascota_3, 3, R.drawable.dogbone_2));
        mascotas.add(new Mascota(R.drawable.mascota_3, 8, R.drawable.dogbone_2));
        mascotas.add(new Mascota(R.drawable.mascota_3, 1, R.drawable.dogbone_2));
        mascotas.add(new Mascota(R.drawable.mascota_3, 3, R.drawable.dogbone_2));

    }


}
