
package com.portfolio.julian.Dto;

import javax.validation.constraints.NotBlank;


public class dtoProyecto {
    @NotBlank
    private String nombreP;
    @NotBlank
    private String descripcionP;
    @NotBlank
    private String urlimgP;
    @NotBlank
    private String fecha;
    @NotBlank
    private String urlP;

    //Constructores

    public dtoProyecto() {
    }

    public dtoProyecto(String nombreP, String descripcionP, String fecha, String urlimgP, String urlP) {
        this.nombreP = nombreP;
        this.descripcionP = descripcionP;
        this.urlimgP = urlimgP;
        this.fecha = fecha;
        this.urlP = urlP;
    }
    //Getter y Setter

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getDescripcionP() {
        return descripcionP;
    }

    public void setDescripcionP(String descripcionP) {
        this.descripcionP = descripcionP;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getUrlimgP() {
        return urlimgP;
    }

    public void setUrlimgP(String urlimgP) {
        this.urlimgP = urlimgP;
    }

    public String getUrlP() {
        return urlP;
    }

    public void setUrlP(String urlP) {
        this.urlP = urlP;
    }

    
    
}
