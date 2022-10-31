
package com.portfolio.julian.Dto;

import javax.validation.constraints.NotBlank;


public class dtoExperiencia {
    @NotBlank // no pueden estar vacios estos campos
    private String nombreE;
    @NotBlank // no pueden estar vacios estos campos
    private String descripcionE;
    @NotBlank
    private String periodoExp;
    @NotBlank
    private String imgExp;
    //Constructores

    public dtoExperiencia() {
    }

    public dtoExperiencia(String nombreE, String descripcionE, String imgExp, String periodoExp) {
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.imgExp = imgExp;
        this.periodoExp = periodoExp;
    }
    
    //Getter y Stter

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return descripcionE;
    }

    public void setDescripcionE(String descripcionE) {
        this.descripcionE = descripcionE;
    }

    public String getPeriodoExp() {
        return periodoExp;
    }

    public void setPeriodoExp(String periodoExp) {
        this.periodoExp = periodoExp;
    }

    public String getImgExp() {
        return imgExp;
    }

    public void setImgExp(String imgExp) {
        this.imgExp = imgExp;
    }

  
}
