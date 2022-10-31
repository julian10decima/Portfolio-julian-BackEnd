
package com.portfolio.julian.Dto;

import javax.validation.constraints.NotBlank;


public class dtoHys {
    @NotBlank
    private String nombre;
    @NotBlank
    private int porcentaje;
    @NotBlank
    private String urlimagen;
    
    //Constructores

    public dtoHys() {
    }

    public dtoHys(String nombre, int porcentaje, String urlimagen) {
        this.nombre = nombre;
        this.porcentaje = porcentaje;
        this.urlimagen = urlimagen;
    }
    
    //Getter y Setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    public String getUrlimagen() {
        return urlimagen;
    }

    public void setUrlimagen(String urlimagen) {
        this.urlimagen = urlimagen;
    }
    
}
