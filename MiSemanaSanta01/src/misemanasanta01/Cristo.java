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
public class Cristo {
    private String nombreCristo;

    public Cristo(String nombreCristo, String material, int precio, int fe, int altura, int peso, ImageIcon imagen) {
        this.nombreCristo = nombreCristo;
        this.material = material;
        this.precio = precio;
        this.fe = fe;
        this.altura = altura;
        this.peso = peso;
        this.imagen = imagen;
    }

    public String getNombreCristo() {
        return nombreCristo;
    }

    public void setNombreCristo(String nombreCristo) {
        this.nombreCristo = nombreCristo;
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

    public int getFe() {
        return fe;
    }

    public void setFe(int fe) {
        this.fe = fe;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public ImageIcon getImagen() {
        return imagen;
    }

    public void setImagen(ImageIcon imagen) {
        this.imagen = imagen;
    }
    private String material;
    private int precio;
    private int fe;
    private int altura;
    private int peso;
    private ImageIcon imagen;
}
