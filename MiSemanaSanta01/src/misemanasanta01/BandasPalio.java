/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misemanasanta01;

import javax.swing.ImageIcon;

/**
 *
 * @author ManuSobremesa
 */
public class BandasPalio {
    private String nombreAgrupacion;
    private String ciudad;
    private int componentes;
    private int precio;
    private boolean tipo;

    public BandasPalio(String nombreAgrupacion, String ciudad, int componentes, int precio, boolean tipo) {
        this.nombreAgrupacion = nombreAgrupacion;
        this.ciudad = ciudad;
        this.componentes = componentes;
        this.precio = precio;
        this.tipo = tipo;
    }

    public String getNombreAgrupacion() {
        return nombreAgrupacion;
    }

    public void setNombreAgrupacion(String nombreAgrupacion) {
        this.nombreAgrupacion = nombreAgrupacion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getComponentes() {
        return componentes;
    }

    public void setComponentes(int componentes) {
        this.componentes = componentes;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public boolean isTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }
  
    
}
