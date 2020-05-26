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
public class Enseres {
    private String nombreEnser;
    private String material;
    private int precio;
    private String tipo;
    private int peso;
    private int anio;
    private ImageIcon imagen;

    public Enseres(String nombreEnser, String material, String tipo, int precio, int peso, int anio, ImageIcon imagen) {
        this.nombreEnser = nombreEnser;
        this.material = material;
        this.tipo = tipo;
        this.precio = precio;
        this.peso = peso;
        this.anio = anio;
        this.imagen = imagen;
    }

    public ImageIcon getImagen() {
        return imagen;
    }

    public void setImagen(ImageIcon imagen) {
        this.imagen = imagen;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getNombreEnser() {
        return nombreEnser;
    }

    public void setNombreEnser(String nombreEnser) {
        this.nombreEnser = nombreEnser;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
}
