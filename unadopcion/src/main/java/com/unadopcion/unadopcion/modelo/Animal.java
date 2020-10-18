package com.unadopcion.unadopcion.modelo;

import com.fasterxml.jackson.annotation.JsonInclude;


import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Animal implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int animId;
    private int animEdad;
    private Integer adopId;
    private Integer regisId;
    private String animNombre;
    private String animTipo;
    private String animLugar;
    private String animDescrip;
    private String animSexo;
    @Lob
    @Column(columnDefinition = "LONGBLOB")
    private byte[] animFoto;



    public Animal(){
        regisId = null;


    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getAnimId() {
        return animId;
    }

    public void setAnimId(int animId) {
        this.animId = animId;
    }

    public int getAnimEdad() {
        return animEdad;
    }

    public void setAnimEdad(int animEdad) {
        this.animEdad = animEdad;
    }

    public Integer getAdopId() {
        return adopId;
    }

    public void setAdopId(Integer adopId) {
        this.adopId = adopId;
    }

    public Integer getRegisId() {
        return regisId;
    }

    public void setRegisId(Integer regisId) {
        this.regisId = regisId;
    }

    public String getAnimNombre() {
        return animNombre;
    }

    public void setAnimNombre(String animNombre) {
        this.animNombre = animNombre;
    }

    public String getAnimTipo() {
        return animTipo;
    }

    public void setAnimTipo(String animTipo) {
        this.animTipo = animTipo;
    }

    public String getAnimLugar() {
        return animLugar;
    }

    public void setAnimLugar(String animLugar) {
        this.animLugar = animLugar;
    }

    public String getAnimDescrip() {
        return animDescrip;
    }

    public void setAnimDescrip(String animDescrip) {
        this.animDescrip = animDescrip;
    }

    public String getAnimSexo() {
        return animSexo;
    }

    public void setAnimSexo(String animSexo) {
        this.animSexo = animSexo;
    }

    public byte[] getAnimFoto() {
        return animFoto;
    }

    public void setAnimFoto(byte[] animFoto) {
        this.animFoto = animFoto;
    }
}
