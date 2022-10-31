
package com.portfolio.julian.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombreP;
    private String descripcionP;
    private String fecha;
    private String urlimgP;
    private String urlP;
    
    //constructor

    public Proyecto() {
    }

    public Proyecto(String nombreP, String descripcionP, String fecha, String urlimgP, String urlP) {
        this.nombreP = nombreP;
        this.descripcionP = descripcionP;
        this.urlimgP = urlimgP;
        this.fecha = fecha;
        this.urlP = urlP;
    }
    
    //Getter y Setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
