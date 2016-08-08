package com.juanmorales.mascotasrv.fragment;

import com.juanmorales.mascotasrv.adapter.MascotaAdaptador;
import com.juanmorales.mascotasrv.pojo.Mascota;

import java.util.ArrayList;

/**
 * Created by juan.morales on 07/08/2016.
 */
public interface IRecyclerViewTopMascotas {

    public void generarLinearLayoutVertical();

    public MascotaAdaptador crearAdaptador(ArrayList<Mascota> mascotas);

    public void inicializarAdaptadorRV(MascotaAdaptador adaptador);

}
