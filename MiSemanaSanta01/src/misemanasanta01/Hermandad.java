package misemanasanta01;

import java.io.Serializable;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ManuSobremesa
 */
public class Hermandad implements Serializable {
    //Datos de la hermandad
    private int dinero;
    private int hermanos;
    private int nazarenos;
    private int popularidad;
    private int fervor;
    
    //Datos de las finanzas-precio de ventas
    private int precioPapeletaSitio;
    private int precioPenitenteMini;
    private int precioMedalla;
    private int precioTunica;
    private int precioLoteriaNavidad;
    private int precioCuotaHermano;
    
    //Datos de la Sede Canónica
    private String sedeCanonica;
    private int semanaCultos;
    private int festividadCristo;
    private int festividadVirgen;
    
    //Datos de las imágenes
    private int cristo;
    private int virgen;
    
    //Datos de los pasos
    private int pasoCristo;
    private int pasoVirgen;
    
    //Datos de las bandas
    private int bandaCristo;
    private int bandaPalio;

    public int getBandaCristo() {
        return bandaCristo;
    }

    public void setBandaCristo(int bandaCristo) {
        this.bandaCristo = bandaCristo;
    }

    public int getBandaPalio() {
        return bandaPalio;
    }

    public void setBandaPalio(int bandaPalio) {
        this.bandaPalio = bandaPalio;
    }

    public int getPasoCristo() {
        return pasoCristo;
    }

    public void setPasoCristo(int pasoCristo) {
        this.pasoCristo = pasoCristo;
    }

    public int getPasoVirgen() {
        return pasoVirgen;
    }

    public void setPasoVirgen(int pasoVirgen) {
        this.pasoVirgen = pasoVirgen;
    }

    public int getSemanaCultos() {
        return semanaCultos;
    }

    public void setSemanaCultos(int semanaCultos) {
        this.semanaCultos = semanaCultos;
    }

    public int getFestividadCristo() {
        return festividadCristo;
    }

    public void setFestividadCristo(int festividadCristo) {
        this.festividadCristo = festividadCristo;
    }

    public int getFestividadVirgen() {
        return festividadVirgen;
    }

    public void setFestividadVirgen(int festividadVirgen) {
        this.festividadVirgen = festividadVirgen;
    }
    
    //Datos de la hermadad
    private String tituloHermandad;
    private String diaEstacionP;

    public String getDiaEstacionP() {
        return diaEstacionP;
    }

    public void setDiaEstacionP(String diaEstacionP) {
        this.diaEstacionP = diaEstacionP;
    }

    public String getTituloHermandad() {
        return tituloHermandad;
    }

    public void setTituloHermandad(String tituloHermandad) {
        this.tituloHermandad = tituloHermandad;
    }
    
    //Para nuestros numeros aleatorios
    Random numeroAle;
    int numero1;
    
    String historico1, historico2, historico3, historico4;
    
    private int colorCaperuz;
    private int colorCapa;
    private int colorTunica;
    
    //Instancia del Cristo de la Hermandad
    private Cristo miCristo;

    public Cristo getMiCristo() {
        return miCristo;
    }

    public void setMiCristo(Cristo miCristo) {
        this.miCristo = miCristo;
    }

    public int getColorCaperuz() {
        return colorCaperuz;
    }

    public void setColorCaperuz(int colorCaperuz) {
        this.colorCaperuz = colorCaperuz;
    }

    public int getColorCapa() {
        return colorCapa;
    }

    public void setColorCapa(int colorCapa) {
        this.colorCapa = colorCapa;
    }

    public int getColorTunica() {
        return colorTunica;
    }

    public void setColorTunica(int colorTunica) {
        this.colorTunica = colorTunica;
    }

    public String getSedeCanonica() {
        return sedeCanonica;
    }

    public void setSedeCanonica(String sedeCanonica) {
        this.sedeCanonica = sedeCanonica;
    }

    public int getPrecioPapeletaSitio() {
        return precioPapeletaSitio;
    }

    public void setPrecioPapeletaSitio(int precioPapeletaSitio) {
        this.precioPapeletaSitio = precioPapeletaSitio;
    }

    public int getPrecioPenitenteMini() {
        return precioPenitenteMini;
    }

    public void setPrecioPenitenteMini(int precioPenitenteMini) {
        this.precioPenitenteMini = precioPenitenteMini;
    }

    public int getPrecioMedalla() {
        return precioMedalla;
    }

    public void setPrecioMedalla(int precioMedalla) {
        this.precioMedalla = precioMedalla;
    }

    public int getPrecioTunica() {
        return precioTunica;
    }

    public void setPrecioTunica(int precioTunica) {
        this.precioTunica = precioTunica;
    }

    public int getPrecioLoteriaNavidad() {
        return precioLoteriaNavidad;
    }

    public void setPrecioLoteriaNavidad(int precioLoteriaNavidad) {
        this.precioLoteriaNavidad = precioLoteriaNavidad;
    }

    public int getPrecioCuotaHermano() {
        return precioCuotaHermano;
    }

    public void setPrecioCuotaHermano(int precioCuotaHermano) {
        this.precioCuotaHermano = precioCuotaHermano;
    }

    public Hermandad(int dinero, int hermanos, int nazarenos, int popularidad, int fervor) {
        //Inicializamos el Histórico de los últimos eventos de la Hermandad
        historico1 = ""; historico2 = ""; historico3 = ""; historico4 = "";
        
        //Inicializamos los datos con los que se empieza el juego
        this.dinero = dinero;
        this.hermanos = hermanos;
        this.nazarenos = nazarenos;
        this.popularidad = popularidad;
        this.fervor = fervor;
        
        //Inicializamos los datos de los precios
        this.precioPapeletaSitio = 0;
        this.precioPenitenteMini = 0;
        this.precioMedalla = 0;
        this.precioTunica = 0;
        this.precioLoteriaNavidad = 0;
        this.precioCuotaHermano = 0;
        
        //inicializamos los datos de la iglesia
        this.sedeCanonica = "";
        
        //Inicializamos los valores delos colores para saber si ya han sido establecidos o no
        this.colorCapa = 100;
        this.colorCaperuz = 100;
        this.colorTunica = 100;
        
        //Vamos con las imágenes. Un valor negativo indica que la hermandad aún no tiene imágenes
        this.cristo = -1;
        this.virgen = -1;
        //Vamos con los pasos. Un valor negativo indica que la hermandad aún no tiene pasos
        this.pasoCristo = -1;
        this.pasoVirgen = -1;
        
        //Vamos con las bandas. Un valor negativo indica que no hay bandas contratadas
        this.bandaCristo = -1;
        this.bandaPalio = -1;
        
        //Creamos la semilla del número aleatorio
        numeroAle = new Random(System.currentTimeMillis());
        numero1 = 0;
        
    }

    public int getCristo() {
        return cristo;
    }

    public void setCristo(int cristo) {
        this.cristo = cristo;
    }

    public int getVirgen() {
        return virgen;
    }

    public void setVirgen(int virgen) {
        this.virgen = virgen;
    }

    public int getDinero() {
        return dinero;
    }

    public int getHermanos() {
        return hermanos;
    }

    public int getNazarenos() {
        return nazarenos;
    }

    public int getPopularidad() {
        return popularidad;
    }

    public int getFervor() {
        return fervor;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public void setHermanos(int hermanos) {
        this.hermanos = hermanos;
    }

    public void setNazarenos(int nazarenos) {
        this.nazarenos = nazarenos;
    }

    public void setPopularidad(int popularidad) {
        this.popularidad = popularidad;
    }

    public void setFervor(int fervor) {
        this.fervor = fervor;
    }
    
    //función para re-calcular la popularidad tras algún acto
    public int calcularPopularidad(int dinero) {
        //System.out.println("dinero donado" + dinero);
        int subidaPopularidad = 0;
        if(dinero < 50) { //Se ha donado muy poco dinero. La popularidad casi seguro que no varía
            numero1 = numeroAle.nextInt(99)+1;
            if(numero1 < 10) { //Creamos un numero aleatorio entre 1 y 100
                subidaPopularidad = numeroAle.nextInt(3)+1;//La Popularidad sube entre 1 y 3 puntos
                this.setPopularidad(this.getPopularidad() + subidaPopularidad);
                MiSemanaSanta01.ventanaPrincipal.jTextFieldPopularidad.setText("" + this.getPopularidad());
            }
        }
        if(dinero < 2000) { //Se ha donado bastante. La popularidad seguro que varía mucho
            numero1 = numeroAle.nextInt(99)+1;
            if(numero1 < 98) { //Creamos un numero aleatorio entre 1 y 100
                subidaPopularidad = numeroAle.nextInt(400)+100;//La Popularidad sube entre 100 y 500 puntos
                this.setPopularidad(this.getPopularidad() + subidaPopularidad);
                MiSemanaSanta01.ventanaPrincipal.jTextFieldPopularidad.setText("" + this.getPopularidad());
            }
        }
        System.out.println("SUBIDA POPU: " + subidaPopularidad);
        return subidaPopularidad;
    }
    
    public int calcularNuevosHermanosSegunCuota(int valor) {
        System.out.println("Valor: " + valor);
        int subidaHermanos = 0;
        if(valor <= 2) { //La cuota de hermanos es buena. Puede haber subida
            subidaHermanos = numeroAle.nextInt(4)+1 + numeroAle.nextInt(2)+1;
        }
        if(valor > 2 && valor <=4) { //La cuota de hermanos no es buena. Puede pasar cualquier cosa
            subidaHermanos = numeroAle.nextInt(4)+1 - numeroAle.nextInt(6)+1;
        }
        if(valor > 5 && valor <=10) { //La cuota de hermanos es muy mala. Habrá bajada casi seguro
            subidaHermanos = numeroAle.nextInt(2)+1 - numeroAle.nextInt(10)+1;
        }
        if(valor > 10 && valor <=50) { //La cuota de hermanos es pésima. Habrá bajada casi seguro
            subidaHermanos = numeroAle.nextInt(4)+1 - numeroAle.nextInt(30)+1;
        }
        System.out.println("" + subidaHermanos);
        return subidaHermanos;
        
    }

    @Override
    public String toString() {
        return "Hermandad{" + "dinero=" + dinero + ", hermanos=" + hermanos + ", nazarenos=" + nazarenos + ", popularidad=" + popularidad + ", fervor=" + fervor + ", precioPapeletaSitio=" + precioPapeletaSitio + ", precioPenitenteMini=" + precioPenitenteMini + ", precioMedalla=" + precioMedalla + ", precioTunica=" + precioTunica + ", precioLoteriaNavidad=" + precioLoteriaNavidad + ", precioCuotaHermano=" + precioCuotaHermano + ", sedeCanonica=" + sedeCanonica + ", numeroAle=" + numeroAle + ", numero1=" + numero1 + ", colorCaperuz=" + colorCaperuz + ", colorCapa=" + colorCapa + ", colorTunica=" + colorTunica + ", miCristo=" + miCristo + '}';
    }
    
    
   
}
