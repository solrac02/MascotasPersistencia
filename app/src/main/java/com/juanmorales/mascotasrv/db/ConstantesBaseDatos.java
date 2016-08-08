package com.juanmorales.mascotasrv.db;

/**
 * Created by juan.morales on 07/08/2016.
 */
public class ConstantesBaseDatos {

    //Nombre Base datos
    public static final String DATABASE_NAME= "mascotas";
    public static final int DATABASE_VERSION = 1;

    //Tabla mascota
    public static final String TABLE_MASCOTA = "mascota";
    public static final String TABLE_MASCOTA_ID = "id";
    public static final String TABLE_MASCOTA_NOMBRE = "nombre";
    public static final String TABLE_MASCOTA_FOTO = "foto";
    public static final String TABLE_MASCOTA_HUESO_1 = "hueso1";
    public static final String TABLE_MASCOTA_HUESO_2 = "hueso2";

    //Tabla Likes MAscotas
    public static final String TABLE_LIKES_MASCOTA = "mascota_likes";
    public static final String TABLE_LIKES_MASCOTA_ID = "id";
    public static final String TABLE_LIKES_MASCOTA_ID_MASCOTA = "id_mascota";
    public static final String TABLE_LIKES_MASCOTA_NUMERO_LIKES = "numero_likes";

}
