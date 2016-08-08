package com.juanmorales.mascotasrv.db;

import android.content.ContentValues;
import android.content.Context;

import com.juanmorales.mascotasrv.R;
import com.juanmorales.mascotasrv.pojo.Mascota;

import java.util.ArrayList;

/**
 * Created by juan.morales on 07/08/2016.
 */
public class ConstructorMascotas {

    private static final Integer LIKE = 1;
    private Context context;

    public ConstructorMascotas(Context context){
        this.context= context;
    }

    public ArrayList<Mascota> obtenerMacostas(){

        BaseDatos db = new BaseDatos(context);
        insertarMascotas(db);

        return db.obtenerTodasLasMascotas();

    }
    public void insertarMascotas (BaseDatos db){

        ContentValues contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_NOMBRE , "Dashita" );
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_FOTO  , R.drawable.mascota_1);
        //contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_HUESO_1, R.drawable.dogbone_1 );
        //contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_HUESO_2, R.drawable.dogbone_2 );
        db.insertarMascota(contentValues);


        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_NOMBRE , "Aldo" );
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_FOTO  , R.drawable.maecota_2);
        //contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_HUESO_1, R.drawable.dogbone_1 );
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_NOMBRE , "Grenitas" );
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_FOTO  , R.drawable.mascota_3);
        //contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_HUESO_1, R.drawable.dogbone_1 );
        db.insertarMascota(contentValues);


        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_NOMBRE , "Dona" );
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_FOTO  , R.drawable.mascota_4);
        //contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_HUESO_1, R.drawable.dogbone_1 );
        db.insertarMascota(contentValues);


        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_NOMBRE , "manchas" );
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_FOTO  , R.drawable.mascota_5);
        //contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_HUESO_1, R.drawable.dogbone_1 );
        db.insertarMascota(contentValues);

        /*contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_NOMBRE , "Deisy" );
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_FOTO  , R.drawable.mascota_6);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_HUESO_1, R.drawable.dogbone_1 );
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_NOMBRE , "Laydi" );
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_FOTO  , R.drawable.mascota_7);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_HUESO_1, R.drawable.dogbone_1 );
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_NOMBRE , "Mister" );
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_FOTO  , R.drawable.mascota_8);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_HUESO_1, R.drawable.dogbone_1 );
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_NOMBRE , "Sauer" );
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_FOTO  , R.drawable.mascota_9);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_HUESO_1, R.drawable.dogbone_1 );
        db.insertarMascota(contentValues);

        contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_NOMBRE , "Dino" );
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_FOTO  , R.drawable.mascota_10);
        contentValues.put(ConstantesBaseDatos.TABLE_MASCOTA_HUESO_1, R.drawable.dogbone_1 );
        db.insertarMascota(contentValues);
        */

    }
    
    public void darLikeMascota(Mascota mascota){
        BaseDatos db = new BaseDatos(context);
        ContentValues contentValues = new ContentValues();
        contentValues.put(ConstantesBaseDatos.TABLE_LIKES_MASCOTA_ID_MASCOTA, mascota.getId());
        contentValues.put(ConstantesBaseDatos.TABLE_LIKES_MASCOTA_NUMERO_LIKES, LIKE);
        db.insertarLikeMascota(contentValues);
    }
    public  int obtenerLikesMascotas(Mascota mascota){
        BaseDatos db = new BaseDatos(context);
        return db.obtenerLikesContacto(mascota);

    }


}
