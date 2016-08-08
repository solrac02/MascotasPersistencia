package com.juanmorales.mascotasrv.presentador;

import android.content.Context;

import com.juanmorales.mascotasrv.db.ConstructorMascotas;
import com.juanmorales.mascotasrv.fragment.IRecyclerViewTopMascotas;
import com.juanmorales.mascotasrv.pojo.Mascota;

import java.util.ArrayList;

/**
 * Created by juan.morales on 07/08/2016.
 */
public class RecyclerViewFragmentPresenter implements  IRecyclerViewFragmentPresenter {

    private IRecyclerViewTopMascotas iRecyclerViewTopMascotas;
    private Context context;
    private ConstructorMascotas constructorMascotas;
    private ArrayList<Mascota> mascotas;

    public RecyclerViewFragmentPresenter(IRecyclerViewTopMascotas iRecyclerViewTopMascotas, Context context){

        this.iRecyclerViewTopMascotas = iRecyclerViewTopMascotas;
        this.context = context;
        obtenerMascotasBaseDatos();

    }

    @Override
    public void obtenerMascotasBaseDatos() {
        constructorMascotas = new ConstructorMascotas(context);
        mascotas= constructorMascotas.obtenerMacostas();
        mostrarMascotasTopRV();

    }

    @Override
    public void mostrarMascotasTopRV() {

        iRecyclerViewTopMascotas.inicializarAdaptadorRV(iRecyclerViewTopMascotas.crearAdaptador(mascotas));
        iRecyclerViewTopMascotas.generarLinearLayoutVertical();
    }
}
