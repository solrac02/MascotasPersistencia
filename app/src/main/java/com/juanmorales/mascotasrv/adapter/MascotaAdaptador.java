package com.juanmorales.mascotasrv.adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.juanmorales.mascotasrv.db.ConstructorMascotas;
import com.juanmorales.mascotasrv.pojo.Mascota;
import com.juanmorales.mascotasrv.R;

import java.util.ArrayList;

/**
 * Created by juan.morales on 27/07/2016.
 */
public class MascotaAdaptador extends RecyclerView.Adapter<MascotaAdaptador.MascotaViewHolder>{

    ArrayList<Mascota> mascotas;
    Activity activity;
    int likes = 0;

    // Construye nuestra lista de mascotas
    public MascotaAdaptador(ArrayList<Mascota> mascotas, Activity activity){

        this.mascotas = mascotas;
        this.activity = activity;

    }
    // Se infla el layout y pasa al ViewHolder para obtener los views
    @Override
    public MascotaViewHolder onCreateViewHolder(ViewGroup parent, int viewType){

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascota,parent,false);
        return new MascotaViewHolder(v);

    }

    //Para pasar a la pantalla del detalle de la mascota
    @Override
    public void onBindViewHolder(final MascotaAdaptador.MascotaViewHolder mascotaViewHolder, int position) {

        final Mascota mascota = mascotas.get(position);
        mascotaViewHolder.imgMascota.setImageResource(mascota.getFotoMascota());
        mascotaViewHolder.tvNombreMascota.setText(mascota.getNombreMascota());
        mascotaViewHolder.tvNumLikes.setText(String.valueOf(mascota.getLikes()));
        //mascotaViewHolder.btnHueso1.setImageResource(mascota.getFotoHueso1());
        //mascotaViewHolder.btnHueso2.setImageResource(mascota.getFotoHueso2());



        //boton Hueso en blanco

        mascotaViewHolder.btnHueso1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(activity, "No puede ser Raiteada", Toast.LENGTH_SHORT).show(); // Mensaje al darle click a la imagen
            }
        });

        //boton Hueso en Amarillo
        //ImageButton btnHueso2 = (ImageButton)findViewById(R.id.btnHueso1);
        mascotaViewHolder.btnHueso2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                likes++;
                Toast.makeText(activity, "Diste Like a " + mascota.getNombreMascota() , Toast.LENGTH_SHORT).show(); // Mensaje al darle click a la imagen
                //mascota.setContador(likes);
                ConstructorMascotas constructorMascotas = new ConstructorMascotas(activity);
                constructorMascotas.darLikeMascota(mascota);

                mascotaViewHolder.tvNumLikes.setText(String.valueOf(constructorMascotas.obtenerLikesMascotas(mascota)));

            }
        });

    }

    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    // se crea un clase interna para asignar los elementos a los views
    public static class MascotaViewHolder extends RecyclerView.ViewHolder{

        private ImageView imgMascota;
        private TextView  tvNombreMascota;
        private TextView  tvNumLikes;
        private  ImageButton btnHueso1;
        private ImageButton btnHueso2;

        public MascotaViewHolder(View itemView) {
            super(itemView);

            imgMascota      = (ImageView)itemView.findViewById(R.id.imgMascota);
            tvNombreMascota = (TextView) itemView.findViewById(R.id.tvNombreMascota);
            tvNumLikes      = (TextView)itemView.findViewById(R.id.tvNumLikes);
            btnHueso1       = (ImageButton)itemView.findViewById(R.id.btnHueso1);
            btnHueso2       = (ImageButton)itemView.findViewById(R.id.btnHueso2);

        }
    }


}
