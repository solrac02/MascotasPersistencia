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
import com.juanmorales.mascotasrv.presentador.IRecyclerViewFragmentPresenter;
import com.juanmorales.mascotasrv.presentador.RecyclerViewFragmentPresenter;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RecyclerViewTopMascotas extends Fragment implements IRecyclerViewTopMascotas {

    private RecyclerView listaMascotas;
    ArrayList<Mascota> mascotas;
    private IRecyclerViewFragmentPresenter presenter;


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v =inflater.inflate(R.layout.fragment_recycler_view_top_mascotas, container, false);
        listaMascotas = (RecyclerView)v.findViewById(R.id.rvMascotas);
        presenter = new RecyclerViewFragmentPresenter(this, getContext());

        return v;
    }

    @Override
    public void generarLinearLayoutVertical() {

        LinearLayoutManager llm_mascotas = new LinearLayoutManager(getContext());
        llm_mascotas.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(llm_mascotas);

    }

    @Override
    public MascotaAdaptador crearAdaptador(ArrayList<Mascota> mascotas) {
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas, getActivity());
        return adaptador;
    }

    @Override
    public void inicializarAdaptadorRV(MascotaAdaptador adaptador) {
        listaMascotas.setAdapter(adaptador);
    }
}
