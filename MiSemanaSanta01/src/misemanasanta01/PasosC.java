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
public class PasosC {

    public PasosC(int precio, int costaleros, int altura, int peso, ImageIcon imagen) {
        this.precio = precio;
        this.costaleros = costaleros;
        this.altura = altura;
        this.peso = peso;
        this.imagen = imagen;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCostaleros() {
        return costaleros;
    }

    public void setCostaleros(int costaleros) {
        this.costaleros = costaleros;
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
    private int precio;
    private int costaleros;
    private int altura;
    private int peso;
    private ImageIcon imagen;
}
