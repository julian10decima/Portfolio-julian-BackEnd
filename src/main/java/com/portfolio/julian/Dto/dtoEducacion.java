
package com.portfolio.julian.Dto;

import javax.validation.constraints.NotBlank;


public class dtoEducacion {
    @NotBlank
    private String nombreEdu;
    @NotBlank
    private String nombreInstituto;
    @NotBlank
    private String imgEdu;
    @NotBlank
    private String periodo;
    //Constructores

    public dtoEducacion() {
    }
    public dtoEducacion(String nombreEdu, String nombreInstituto, String imgEdu, String periodo) {
        this.nombreEdu = nombreEdu;
        this.nombreInstituto = nombreInstituto;
        this.imgEdu = imgEdu;
        this.periodo = periodo;
    }
    
    
    //Getter y Setter 

    public String getNombreEdu() {
        return nombreEdu;
    }

    public void setNombreEdu(String nombreEdu) {
        this.nombreEdu = nombreEdu;
    }

    public String getNombreInstituto() {
        return nombreInstituto;
    }

    public void setNombreInstituto(String nombreInstituto) {
        this.nombreInstituto = nombreInstituto;
    }

    public String getImgEdu() {
        return imgEdu;
    }

    public void setImgEdu(String imgEdu) {
        this.imgEdu = imgEdu;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

   

   
}
