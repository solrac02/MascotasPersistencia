package com.juanmorales.mascotasrv.pojo;

/**
 * Created by juan.morales on 27/07/2016.
 */
public class Mascota {

    private  int   id;
    private String nombreMascota;
    private int    fotoMascota;
    private int    likes =0;
    private int fotoHueso1;
    private int fotoHueso2;

    public Mascota(String nombreMascota, int fotoMascota, int likes, int fotoHueso1, int fotoHueso2){
        this.nombreMascota = nombreMascota;
        this.fotoMascota   = fotoMascota;
        this.likes      = likes;
        this.fotoHueso1    = fotoHueso1;
        this.fotoHueso2     = fotoHueso2;


    }

    public Mascota(int fotoMascota, int likes, int fotoHueso2){

        this.fotoMascota   = fotoMascota;
        this.likes      = likes;
        this.fotoHueso2     = fotoHueso2;

    }

    public Mascota() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreMascota() {
        return nombreMascota;
    }

    public void setNombreMascota(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    public int getFotoMascota() {
        return fotoMascota;
    }

    public void setFotoMascota(int fotoMascota) {
        this.fotoMascota = fotoMascota;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getFotoHueso1() {
        return fotoHueso1;
    }

    public void setFotoHueso1(int fotoHueso1) {
        this.fotoHueso1 = fotoHueso1;
    }

    public int getFotoHueso2() {
        return fotoHueso2;
    }

    public void setFotoHueso2(int fotoHueso2) {
        this.fotoHueso2 = fotoHueso2;
    }



}
