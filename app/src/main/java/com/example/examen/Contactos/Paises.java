package com.example.examen.Contactos;

public class Paises {

    private Integer id;
    private String pais;
    private String idpais;

    public Paises(String pais, Integer id, String codigopais) {
        this.id = id;
        this.pais = pais;
        this.idpais = codigopais;
    }//Contactos con parametros

    public Paises() {

    }//el constructor vacio

    public Paises(String valueOf, int parseInt) {
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCodigopais() {
        return idpais;
    }

    public String setCodigopais(String idpais) {
        this.idpais = idpais;
        return idpais;
    }
}
