/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misemanasanta01;

import java.awt.Graphics;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author ManuSobremesa
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    
    //Creamos una instancia de la ventana del Guión de la hermandad
    static public GuionGUI guion;
    
    //Creamos una instancia de la ventana de las finanzas de la hermandad
    static public FinanzasGUI finanzas;
    
    //Creamos una instancia de la ventana de los PasosGUI de la hermandad
    static public PasosGUI pasos;
    
    //Creamos una instancia de la ventana de la Sede Canónica de la hermandad
    static public SedecanonicaGUI sedecanonica;
    
    //Vamos a crear una instancia de la ventana de las BandasGUI
    static public BandasGUI bandas;
    
    //Vamos a crear una instancia de la ventana de los EnseresGUI
    static public EnseresGUI enseres;
    
    //Vamos a crear una instancia de la ventana de la Casa de Hermandad
    static public HermandadCasaGUI casaHermandad;
    
    //Vamos a crear una instancia de nuestra Hermandad
    static public Hermandad miHermandad;
    
    //Vamos a crear una instancia de la Estación de Penitencia
    static public EstacionPenitencia estacionPenitencia;
    
    //Imagen de icono para los JOptionPane
    static public ImageIcon iconoDialogos, icono2Dialogos;
    
    //Creamos la fecha
    int mes; int anio; int semana;
    //Dinero recaudado al mes
    public int dineroCuotas;
    public int hermanosNuevos; //Variable para calcular el número de hermanos nuevos cada mes
    /**
     * Creates new form VentanaPrincipal
     */
    
    //Array con las imágenes de los Cristos disponibles
    static public Cristo arrayCristos[];
    //Array para guardar los enseres disponibles
    static public Enseres arrayEnseres[];
    //Array de las BandasGUI de Cristo
    static public Agrupaciones arrayAgrupaciones[];
    //Array de las BandasGUI de CCTT
    static public CCTT arrayCCTT[];
    
    //Vamos a crear la Ventana para Guardar la Partida
    String nombrePartida;
    JFileChooser jFileChooserGuardar;
    File archivo; //Nombre del archivo que vamos a guardar
    
    public VentanaPrincipal() {
        
        //Inicializamos la Hermandad
        miHermandad = new Hermandad(100000, 50, 30, 0, 0);
        
        //Inicializamos la variable del dinero recaudado al mes
        dineroCuotas = 0;
        
        //Inicializamos los enseres
        //Creamos un array de objetos de la clase empleados
        arrayEnseres = new Enseres[4];
        arrayEnseres[0]=new Enseres("Cruz de Guía", "Alpaca", "Cruz de Guía", 1800, 40, 1960, new ImageIcon(getClass().getResource("/misemanasanta01/Graficos/Enseres/Enser01_210x276.png")));
        arrayEnseres[1]=new Enseres("Cruz de Guía", "Madera", "Cruz de Guía", 1600, 30, 1982, new ImageIcon(getClass().getResource("/misemanasanta01/Graficos/Enseres/Enser02_210x276.png")));
        arrayEnseres[2]=new Enseres("Báculo", "Metal", "Báculo", 400, 5, 1992, new ImageIcon(getClass().getResource("/misemanasanta01/Graficos/Enseres/Enser03_210x276.png")));
        arrayEnseres[3]=new Enseres("Libro de Reglas", "Plástico", "Libro de Reglas", 220, 3, 1996, new ImageIcon(getClass().getResource("/misemanasanta01/Graficos/Enseres/Enser04_210x276.png")));
        
        
        //Inicliazamos los Cristos
        //Creamos un array de objetos de la clase empleados
        arrayCristos = new Cristo[10];
        //arrayCristos[0]=new Cristo("", "", 0, 0, 0, 0, new ImageIcon(getClass().getResource("/misemanasanta01/Graficos/Cristos/Cristo00_210x276.png")));
        arrayCristos[0]=new Cristo("Expiración", "Madera de cedro", 10000, 0, 186, 260, new ImageIcon(getClass().getResource("/misemanasanta01/Graficos/Cristos/Cristo01_210x276.png")));
        arrayCristos[1]=new Cristo("Expiración", "Escayola", 11000, 0, 182, 250, new ImageIcon(getClass().getResource("/misemanasanta01/Graficos/Cristos/Cristo02_210x276.png")));
        arrayCristos[2]=new Cristo("Expiración", "Madera de cedro", 11500, 0, 187, 250, new ImageIcon(getClass().getResource("/misemanasanta01/Graficos/Cristos/Cristo03_210x276.png")));
        arrayCristos[3]=new Cristo("Expiración", "Madera de pino", 13500, 0, 170, 210, new ImageIcon(getClass().getResource("/misemanasanta01/Graficos/Cristos/Cristo04_210x276.png")));
        arrayCristos[4]=new Cristo("Expiración", "Madera de cedro", 14000, 0, 200, 200, new ImageIcon(getClass().getResource("/misemanasanta01/Graficos/Cristos/Cristo05_210x276.png")));
        arrayCristos[5]=new Cristo("Expiración", "Madera de cedro", 15000, 0, 196, 200, new ImageIcon(getClass().getResource("/misemanasanta01/Graficos/Cristos/Cristo06_210x276.png")));
        arrayCristos[6]=new Cristo("Expiración", "Madera de pino", 16000, 0, 201, 200, new ImageIcon(getClass().getResource("/misemanasanta01/Graficos/Cristos/Cristo07_210x276.png")));
        arrayCristos[7]=new Cristo("Expiración", "Madera de pino", 17000, 0, 190, 220, new ImageIcon(getClass().getResource("/misemanasanta01/Graficos/Cristos/Cristo08_210x276.png")));
        arrayCristos[8]=new Cristo("Expiración", "Madera de nogal", 18200, 0, 192, 340, new ImageIcon(getClass().getResource("/misemanasanta01/Graficos/Cristos/Cristo09_210x276.png")));
        arrayCristos[9]=new Cristo("Expiración", "Madera de nogal", 22000, 0, 190, 250, new ImageIcon(getClass().getResource("/misemanasanta01/Graficos/Cristos/Cristo010_210x276.png")));
        
        arrayAgrupaciones = new Agrupaciones[25];
        arrayAgrupaciones[0] = new Agrupaciones("AM “San Juan Evangelista y Nuestra Señora de la Soledad” de El Bonillo", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[1] = new Agrupaciones("AM “Cruz Roja” de Tobarra", "Tobarra", 70, 1000, false);
        arrayAgrupaciones[2] = new Agrupaciones("AM “San Miguel” de Villarrobledo", "Villarrobledo", 70, 1000, false);
        arrayAgrupaciones[3] = new Agrupaciones("AM “Nuestra Señora del Rosario” de Crevillente", "Crevillente",70, 1000, false);
        arrayAgrupaciones[4] = new Agrupaciones("AM “Santísimo Cristo de la Buena Muerte” de Guadamar del Segura", "Guadamar del Segura",70, 1000, false);
        arrayAgrupaciones[5] = new Agrupaciones("AM “Nuestra Señora de los Dolores” de Villena", "Villena",70, 1000, false);
        arrayAgrupaciones[6] = new Agrupaciones("AM “Virgen del Carmen” de Cuevas de Almanzora", "Almanzora",70, 1000, false);
        arrayAgrupaciones[7] = new Agrupaciones("AM “Cristo del Amor” de El Ejido", "El Ejido",70, 1000, false);
        arrayAgrupaciones[8] = new Agrupaciones("AM “Nuestra Señora del Mar” de Huércal de Almería", "Almería",70, 1000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AM “Cristo de las Aguas” de Olula del Río", "Olula del Río",70, 1000, false);
        arrayAgrupaciones[10] = new Agrupaciones("AM “Virgen de las Mercedes” de Oria.", "Oria", 80, 2000, false);
        arrayAgrupaciones[11] = new Agrupaciones("AM “Virgen de las Angustias” de Vícar.", "Vícar", 80, 2000, false);
        arrayAgrupaciones[12] = new Agrupaciones("AM “Sagrado Corazón de Jesús” de Oviedo.", "Oviedo", 80, 2000, false);
        arrayAgrupaciones[13] = new Agrupaciones("AM “San Salvador” de Oviedo.", "Oviedo", 80, 2000, false);
        arrayAgrupaciones[14] = new Agrupaciones("AM “Santísimo Cristo de la Merced” de Almendralejo.", "Almendralejo", 80, 2000, false);
        arrayAgrupaciones[15] = new Agrupaciones("AM “Santísimo Cristo Rey” de Badajoz.", "Badajoz", 80, 2000, false);
        arrayAgrupaciones[16] = new Agrupaciones("AM “Maestro Sousa” de Jerez de los Caballeros.", "Jerez de los Caballeros", 80, 2000, false);
        arrayAgrupaciones[17] = new Agrupaciones("AM “Nuestro Padre Jesús Nazareno” de Jerez de los Caballeros.", "Jerez de los Caballeros", 80, 2000, false);
        arrayAgrupaciones[18] = new Agrupaciones("AM “15+1” de Hospitalet de Llobregat.", "Llobregar", 80, 2000, false);
        arrayAgrupaciones[19] = new Agrupaciones("AM “San Fernando Rey” de Burgos.", "Burgos", 80, 2000, false);
        arrayAgrupaciones[20] = new Agrupaciones("AM “Nuestro Padre Jesús de la Salud” de Cáceres.", "Cáceres", 80, 2000, false);
        arrayAgrupaciones[21] = new Agrupaciones("AM “Virgen del Puerto” de Plasencia.", "Plasencia", 80, 2000, false);
        arrayAgrupaciones[22] = new Agrupaciones("AM “Nuestro Padre Jesús Nazareno” de Alcalá de los Gazules.", "Alcalá de los Gazules", 80, 2000, false);
        arrayAgrupaciones[23] = new Agrupaciones("AM “Ecce Mater” de Cádiz.", "Cádiz", 80, 2000, false);
        arrayAgrupaciones[24] = new Agrupaciones("AM “Polillas” de Cádiz.", "Cádiz", 80, 2000, false);
        /*
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Sagrada Cena” de Cádiz.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Nuestra Señora de los Remedios” de Chiclana de la Frontera.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “La Sentencia” de Jerez de la Frontera.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “San Juan” de Jerez de la Frontera.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Cristo de la Buena Muerte” de Paterna de Rivera.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Lágrimas de Dolores” de San Fernando.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Nuestra Señora de la Caridad” de Sanlúcar de Barrameda.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Sagrada Resurrección” de Sanlúcar de Barrameda.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Virgen de la Oliva” de Vejer de la Frontera.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Virgen de Gracia” de Villareal.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Nuestro Padre Jesús Caído y Virgen de la Amargura” de Ceuta.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Nuestro Padre Jesús del Perdón” de Alcázar de San Juan.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Nuestro Padre Jesús Nazareno” de Calzada de Calatrava.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Santo Tomás de Villanueva” de Ciudad Real.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “San Sebastián” de La Solana.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Nuestro Padre Jesús Redentor” de Moral de Calatrava.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Javier Mayoral” de Pedro Muñoz.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “San Miguel Arcángel” de Puertollano.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Nuestra Señora de la Soledad y Santo Sepulcro” de Villanueva de lo", "El Bonillo", 80, 2000, false);s Infantes.
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Santa Cecilia” de Aguilar de la Frontera.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Imperio Romano de Nuestro Padre Jesús Nazareno” de Aguilar de la F", "El Bonillo", 80, 2000, false);rontera.
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Santa Cruz” de Benamejí.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Virgen de las Angustias” de Cabra.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Jesús Nazareno” de Cañete de las Torres.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Los Dolores” de Carcabuey.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Nuestro Padre Jesús de la Fe en su Sagrada Cena” de Córdoba.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Nuestro Padre Jesús de la Redención” de Córdoba.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Santísimo Cristo de Gracia” de Córdoba.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical de Dos Torres", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical de El Carpio.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Nuestro Padre Jesús Nazareno” de Hinojosa del Duque.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Oración en el Huerto” de Hinojosa del Duque.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “SPQR” de Iznájar.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Carlos III” de La Carlota.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Cristo de la Expiración” de La Rambla.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Nuestro Padre Jesús Nazareno” de La Rambla.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical de La Victoria.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Santísimo Cristo de la Humillación” de Lucena.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “La Unión” de Montilla.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Jesús Caído” de Montoro.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “La Fe” de Posadas.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Nuestra Señora de la Soledad” de Pozoblanco.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Nuestro Padre Jesús de los Afligidos” de Puente Genil.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Santo Ángel Custodio” de Rute.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Nuestro Padre Jesús Nazareno” – La Madruga – de Villa del Río.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Nuestro Padre Jesús Cautivo” de Villa del Río.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Nuestro Padre Jesus Nazareno” de Villanueva del Duque.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Nuestra Señora de la Encarnación” de Almuñécar.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Nuestra Señora del Carmen” de Calahonda.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Nuestro Padre Jesús de la Salud” de Churriana de la Vega.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Virgen del Carmen” de Dúrcal.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “María Santísima de la Cabeza” de Exfiliana.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Dulce Nombre de Jesús” de Granada.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “María Santísima de la Estrella” de Granada.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Virgen de las Angustias” de Granada.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Cristo del Perdón” de Guadix.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Virgen de la Soledad” de Huéscar.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Virgen del Carmen” de Torrenueva.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Santísimo Cristo del Amor y de la Paz” de Guadalajara.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Cristo de la Buena Muerte” de Ayamonte.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Santísimo Cristo de la Misericordia” de Gibraleón.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Santa Cruz” de Huelva.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Santísimo Cristo del Amor”- La Cena – de Huelva.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Nuestro Padre Jesús Nazareno” de La Palma del Condado.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Cristo de la Misericordia” de Lepe.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Santa Águeda” de Villalba del Alcor.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Nuestro Padre Jesús Nazareno” de Zalamea la Real.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Nuestro Padre Jesús Cautivo” de Ibiza.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Santísimo Cristo de la Agonía” de Ibiza.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “La Paz” de Palma de Mallorca.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Nuestra Señora de la Esperanza” de Palma de Mallorca.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “La Redención” de Palma de Mallorca.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Santísimo Cristo de la Salud” de Alcalá la Real.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Nuestra Señora de las Angustias” de Alcalá la Real.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “San Juan” de Bailén.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Nuestra Señora de los Remedios” de Ibros", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Nuestro Padre Jesús de la Piedad en su Presentación al Pueblo” de ", "El Bonillo", 80, 2000, false);Jaén.
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Nuestro Padre Jesús Despojado” de Jaén.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Arroquia Martínez” de Jódar – Ver ficha", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “María Santísima de los Dolores” de Linares.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Nuestro Padre Jesús de la Pasión” de Linares.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Nuestra Señora de las Angustias y Soledad” de León – Ver ficha", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Santa Marta y Sagrada Cena” de León.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Santo Cristo de la Bienaventuranza” de León.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Jesús de Medinaceli” de Alcalá de Henares.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Virgen de Gracia” de Archidona.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Jesús Cautivo” de Estepona.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “San Lorenzo Mártir” de Málaga – Ver ficha", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “La Pollinica” de Marbella.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Resurrección” de Sierra de Yeguas.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Oración en el Huerto” de Yecla.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Santa María Magdalena” de Yecla.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Santísimo Cristo de la Bondad” de Alcalá de Guadaíra.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Nuestra Señora de la Victoria” de Arahal.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Santa María Magdalena” de Arahal.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Vera-Cruz y Caridad” de Brenes.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “María Inmaculada” de Castilleja de la Cuestra.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “San Lucas Evangelista” de Coria del Río.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Nuestra Señora de la Estrella” de Dos Hermanas", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Nuestra Señora de Valme” de Dos Hermanas", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Dulce Nombre de Jesús” de Estepa.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Paz y Caridad” de Estepa.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Santísimo Cristo de la Sagrada Columna y Azotes” de Écija.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Ntro. Padre Jesús Nazareno y Mª Stma. de los Dolores” de Gilena.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Nuestro Padre Jesús Nazareno” de La Algaba.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Santísimo Cristo de la Vera+Cruz” de la Puebla de Cazalla.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Nuestro Padre Jesús Nazareno” de La Roda de Andalucía.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Nuestro Padre Jesús de la Humildad” de Lebrija.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Virgen del Buensuceso” de Los Corrales.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Santa María la Blanca” de Los Palacios y Villafranca.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Nuestra Señora del Rosario” de Mairena del Aljarafe.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Dulce Nombre de Jesús” de Marchena.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Nuestro Padre Jesús de la Fuensanta” de Morón de la Frontera.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “María Santísima de la Encarnación” de Osuna.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Nuestro Padre Jesús Nazareno” de Peñaflor.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Aires de Triana” de Sevilla.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Nuestra Señora de la Encarnación” de Sevilla.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Nuestro Padre Jesús de la Redención” de Sevilla", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Nuestro Padre Jesús de la Salud” – Los Gitanos – de Sevilla.", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Santa Cecilia” de Sevilla", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Veterana” de Sevilla", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Virgen de los Reyes” de Sevilla", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “Muchachos de Consolación” de Utrera", "El Bonillo", 80, 2000, false);
        arrayAgrupaciones[9] = new Agrupaciones("AMusical “San Juan de Jerusalén” de Madridejos", "El Bonillo", 80, 2000, false);
        SON 149
        */
        
        arrayCCTT = new CCTT[20];        
        arrayCCTT[0] = new CCTT("Banda de CCTT “Flagelación y Gloria” de Elche", "Elche", 80, 2000, true);
        arrayCCTT[1] = new CCTT("Banda de CCTT “Nuestro Padre Jesús Medinaceli” de Elda", "Elda", 80, 2000, true);
        arrayCCTT[2] = new CCTT("Banda de CCTT “Amor y Esperanza” de Pilar de la Horadadaa", "Pilar de la Horadaa", 80, 2000, true);
        arrayCCTT[3] = new CCTT("Banda de CCTT “Ecce-Homo” de Novelda", "Novelda", 80, 2000, true);
        arrayCCTT[4] = new CCTT("Banda de CCTT “Santísimo Cristo Resucitado” de Badajoz", "Badajoz", 80, 2000, true);
        arrayCCTT[5] = new CCTT("Banda de CCTT “Ntra. Señora de la Estrella” de Los Santos de Maimona", "Los Santos de Maimona", 80, 2000, true);
        arrayCCTT[6] = new CCTT("Banda de CCTT “Santísimo Cristo de la Caridad” de Jerez de la Frontera", "Jerez de la Frontera", 80, 2000, true);
        arrayCCTT[7] = new CCTT("Banda de CCTT “Santa Ana” de Olvera", "Olvera", 80, 2000, true);
        arrayCCTT[8] = new CCTT("Banda de CCTT “Stmo. Xto. de los Milagros” de Sanlúcar de Barrameda", "Sanlúcar de Barrameda", 80, 2000, true);
        arrayCCTT[9] = new CCTT("Banda de CCTT “Los Siete Pasos” de Herencia", "Herencia", 80, 2000, true);
        arrayCCTT[10] = new CCTT("Banda de CCTT “Centuria Romana” de Pedro Abad", "Pedro Abad", 80, 2000, true);
        arrayCCTT[11] = new CCTT("Banda de CCTT “Nuestra Señora del Rosario” de Motril", "Motri", 80, 2000, true);
        arrayCCTT[12] = new CCTT("Banda de CCTT “Nuestro Padre Jesús Nazareno” de Huelva", "Huelva", 80, 2000, true);
        arrayCCTT[13] = new CCTT("Banda de CCTT “Virgen de la Salud” de Huelva", "Huelva", 80, 2000, true);
        arrayCCTT[14] = new CCTT("Banda de CCTT de Punta Umbría", "Punta Umbría", 80, 2000, true);
        arrayCCTT[15] = new CCTT("Banda de CCTT “Nuestro Padre Jesús Nazareno” de Huelma", "Huelma", 80, 2000, true);
        arrayCCTT[16] = new CCTT("Banda de CCTT “Santísimo Cristo de la Fe y Consuelo” de Martos", "Martos", 80, 2000, true);
        arrayCCTT[17] = new CCTT("Banda de CCTT “Nuestro Padre Jesús Nazareno” de Rus", "Rus", 80, 2000, true);
        arrayCCTT[18] = new CCTT("Banda de CCTT “INRI” de Torreperogil", "Torreperogil", 80, 2000, true);
        arrayCCTT[19] = new CCTT("Banda de CCTT “Nuestro Padre Jesús Nazareno” de Villacarrillo", "Villacarrillo", 80, 2000, true);
        /*
        Banda de Cornetas y Tambores de las Reales Cofradías Fusionadas de Málaga – Ver ficha
        Banda de Cornetas y Tambores “Santísimo Cristo del Mar” de Vélez-Málaga – Ver ficha
        Banda de Cornetas y Tambores “San Juan Evangelista” de Las Cabezas de San Juan – Ver ficha
        Banda de Cornetas y Tambores “Santísimo Cristo de la Vera-Cruz” de Los Palacios – Ver ficha
        Banda de Cornetas y Tambores “María Santísima de la Palma” de Marchena – Ver ficha
        Banda de Cornetas y Tambores “Nuestra Señora de los Ángeles” de Sevilla – Ver ficha
        Banda de Cornetas y Tambores “Pasión de Cristo” de Sevilla – Ver ficha
        Banda de Cornetas y Tambores “Sagrada Columna y Azotes” de Sevilla – Ver ficha
        Banda de Cornetas y Tambores “Santísimo Cristo de la Sed” de Sevilla – Ver ficha
        Banda de Cornetas y Tambores “Pasión y Esperanza” de Utrera – Ver ficha
        Banda de Cornetas y Tambores “Vera+Cruz” de Utrera – Ver ficha
        Banda de Cornetas y Tambores “Ntro. Padre Jesús de la Salud” de Talavera de la Reina – Ver ficha
        Banda de Cornetas y Tambores “Nuestro Padre Jesús Cautivo” de Oliva
        
        */
        
        //Inicializamos los iconos
        iconoDialogos = new ImageIcon(getClass().getResource("/misemanasanta01/Graficos/IconoTambor.png"));
        icono2Dialogos = new ImageIcon(getClass().getResource("/misemanasanta01/Graficos/Monedas.png"));
        
        //Inicializamos la ventana FinanzasGUI
        finanzas = new FinanzasGUI();
        //Establecemos el tamaño de la ventana
        finanzas.setSize(960, 580);
        finanzas.setUndecorated(true);//Le quitamos los bordes
        finanzas.setLocationRelativeTo(null); //La centramos
        finanzas.setAlwaysOnTop(true); //Indicamos que siempre sea visible
        finanzas.setResizable(false); //Evitamos que se pueda dimensionar
        
        //Inicializamos la ventana GuionGUI
        guion = new GuionGUI();
        //Establecemos el tamaño de la ventana
        guion.setSize(700, 460);
        guion.setUndecorated(true);//Le quitamos los bordes
        guion.setLocationRelativeTo(null); //La centramos
        guion.setAlwaysOnTop(true); //Indicamos que siempre sea visible
        guion.setResizable(false); //Evitamos que se pueda dimensionar
            
        
        //Inicializamos la ventana PasosGUI
        pasos = new PasosGUI();
        //Establecemos el tamaño de la ventana
        pasos.setSize(960, 580);
        pasos.setUndecorated(true);//Le quitamos los bordes
        pasos.setLocationRelativeTo(null); //La centramos
        pasos.setAlwaysOnTop(true); //Indicamos que siempre sea visible
        pasos.setResizable(false); //Evitamos que se pueda dimensionar
        
        //Inicializamos la ventana SedecanonicaGUI
        sedecanonica = new SedecanonicaGUI();
        //Establecemos el tamaño de la ventana
        sedecanonica.setSize(860, 480);
        sedecanonica.setUndecorated(true);//Le quitamos los bordes
        sedecanonica.setLocationRelativeTo(null); //La centramos
        sedecanonica.setAlwaysOnTop(true); //Indicamos que siempre sea visible
        sedecanonica.setResizable(false); //Evitamos que se pueda dimensionar
        
        //Inicializamos la ventana BandasGUI
        bandas = new BandasGUI();
        //Establecemos el tamaño de la ventana
        bandas.setSize(960, 580);
        bandas.setUndecorated(true);//Le quitamos los bordes
        bandas.setLocationRelativeTo(null); //La centramos
        bandas.setAlwaysOnTop(true); //Indicamos que siempre sea visible
        bandas.setResizable(false); //Evitamos que se pueda dimensionar
        
        //Inicializamos la ventana EnseresGUI
        enseres = new EnseresGUI();
        //Establecemos el tamaño de la ventana
        enseres.setSize(960, 580);
        enseres.setUndecorated(true);//Le quitamos los bordes
        enseres.setLocationRelativeTo(null); //La centramos
        enseres.setAlwaysOnTop(true); //Indicamos que siempre sea visible
        enseres.setResizable(false); //Evitamos que se pueda dimensionar
        
        //Inicializamos la ventana casaHermandad
        casaHermandad = new HermandadCasaGUI();
        //Establecemos el tamaño de la ventana
        casaHermandad.setSize(860, 480);
        casaHermandad.setUndecorated(true);//Le quitamos los bordes
        casaHermandad.setLocationRelativeTo(null); //La centramos
        casaHermandad.setAlwaysOnTop(true); //Indicamos que siempre sea visible
        casaHermandad.setResizable(false); //Evitamos que se pueda dimensionar
        
        
        //Inicializamos la ventana Estacion de Penitencia
        estacionPenitencia = new EstacionPenitencia();
        //Establecemos el tamaño de la ventana
        estacionPenitencia.setSize(960, 580);
        estacionPenitencia.setUndecorated(true);//Le quitamos los bordes
        estacionPenitencia.setLocationRelativeTo(null); //La centramos
        estacionPenitencia.setAlwaysOnTop(true); //Indicamos que siempre sea visible
        estacionPenitencia.setResizable(false); //Evitamos que se pueda dimensionar
        
        initComponents();
                        
        //Creamos una partida nueva
        
        
        //Inicializamos la fecha
        mes = 9; //Empezamos en septiembre
        anio = 2020; //Empezamos en el año 2020
        semana = 1; //Todavía no estamos en Cuaresma
        //Establecemos el texto en las etiquetas del calendario
        establecerFecha(mes, anio);
        //Inicializamos los datos de la Hermandad
        initHermandad();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonSalir = new javax.swing.JButton();
        labelDinero = new javax.swing.JLabel();
        jTextFieldDinero = new javax.swing.JTextField();
        labelHermanos = new javax.swing.JLabel();
        labelNazarenos = new javax.swing.JLabel();
        labelPopularidad = new javax.swing.JLabel();
        labelFervor = new javax.swing.JLabel();
        jTextFieldHermanos = new javax.swing.JTextField();
        jTextFieldNazarenos = new javax.swing.JTextField();
        jTextFieldPopularidad = new javax.swing.JTextField();
        jTextFieldFervor = new javax.swing.JTextField();
        jButtonSedeCanonica = new javax.swing.JButton();
        jButtonFinanzas = new javax.swing.JButton();
        jButtonGuion = new javax.swing.JButton();
        jButtonPasos = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jButtonBandas = new javax.swing.JButton();
        jButtonEnseres = new javax.swing.JButton();
        jButtonHermandad = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButtonEstacionPenitencia = new javax.swing.JButton();
        jButtonCultos = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabelFecha = new javax.swing.JLabel();
        jLabelFechaMes = new javax.swing.JLabel();
        jLabelFechaAnio = new javax.swing.JLabel();
        jButtonPasarMes = new javax.swing.JButton();
        jButtonPasarSemana = new javax.swing.JButton();
        jLabelSemanaCuaresma = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaHistorico = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuArchivo = new javax.swing.JMenu();
        jMenuItemNuevaPartida = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        jMenuItemCarPartida = new javax.swing.JMenuItem();
        jMenuItemGuardarPartida = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItemSalir = new javax.swing.JMenuItem();
        jOpciones = new javax.swing.JMenu();
        jMenuJuego = new javax.swing.JMenu();
        jMenuAyudaPrincipal = new javax.swing.JMenu();
        jMenuTutorial = new javax.swing.JMenu();
        jMenuVariables = new javax.swing.JMenu();
        jMenuItemDinero = new javax.swing.JMenuItem();
        jMenuItemHermanos = new javax.swing.JMenuItem();
        jMenuItemNazarenos = new javax.swing.JMenuItem();
        jMenuItemPopularidad = new javax.swing.JMenuItem();
        jMenuItemFervor = new javax.swing.JMenuItem();
        jMenuOpcionesJuego = new javax.swing.JMenu();
        jMenuAyudaFinanzas = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuAyuda = new javax.swing.JMenuItem();
        jMenuAcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Mi Semana Santa");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1284, 800));
        setPreferredSize(new java.awt.Dimension(1284, 768));

        jButtonSalir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonSalir.setText("SALIR");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        labelDinero.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelDinero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/misemanasanta01/Graficos/Monedas.png"))); // NOI18N
        labelDinero.setText("Dinero:");
        labelDinero.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jTextFieldDinero.setEditable(false);
        jTextFieldDinero.setBackground(new java.awt.Color(204, 255, 204));
        jTextFieldDinero.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldDinero.setText("100");
        jTextFieldDinero.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldDinero.setEnabled(false);

        labelHermanos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelHermanos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/misemanasanta01/Graficos/Gente2.png"))); // NOI18N
        labelHermanos.setText("Hermanos:");
        labelHermanos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        labelNazarenos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelNazarenos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/misemanasanta01/Graficos/Penitente.png"))); // NOI18N
        labelNazarenos.setText("Nazarenos:");
        labelNazarenos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        labelPopularidad.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelPopularidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/misemanasanta01/Graficos/Popularidad2.png"))); // NOI18N
        labelPopularidad.setText("Popularidad:");
        labelPopularidad.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        labelFervor.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelFervor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/misemanasanta01/Graficos/Cruz2.png"))); // NOI18N
        labelFervor.setText("Fervor:");
        labelFervor.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jTextFieldHermanos.setEditable(false);
        jTextFieldHermanos.setBackground(new java.awt.Color(204, 255, 204));
        jTextFieldHermanos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldHermanos.setText("100");
        jTextFieldHermanos.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldHermanos.setEnabled(false);

        jTextFieldNazarenos.setEditable(false);
        jTextFieldNazarenos.setBackground(new java.awt.Color(204, 255, 204));
        jTextFieldNazarenos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldNazarenos.setText("100");
        jTextFieldNazarenos.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldNazarenos.setEnabled(false);

        jTextFieldPopularidad.setEditable(false);
        jTextFieldPopularidad.setBackground(new java.awt.Color(204, 255, 204));
        jTextFieldPopularidad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldPopularidad.setText("100");
        jTextFieldPopularidad.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldPopularidad.setEnabled(false);

        jTextFieldFervor.setEditable(false);
        jTextFieldFervor.setBackground(new java.awt.Color(204, 255, 204));
        jTextFieldFervor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldFervor.setText("100");
        jTextFieldFervor.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jTextFieldFervor.setEnabled(false);

        jButtonSedeCanonica.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        jButtonSedeCanonica.setText("SEDE CANÓNICA");
        jButtonSedeCanonica.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonSedeCanonica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSedeCanonicaActionPerformed(evt);
            }
        });

        jButtonFinanzas.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        jButtonFinanzas.setText("FINANZAS");
        jButtonFinanzas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonFinanzas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinanzasActionPerformed(evt);
            }
        });

        jButtonGuion.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        jButtonGuion.setText("GUIÓN");
        jButtonGuion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonGuion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuionActionPerformed(evt);
            }
        });

        jButtonPasos.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        jButtonPasos.setText("PASOS");
        jButtonPasos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonPasos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPasosActionPerformed(evt);
            }
        });

        jButtonBandas.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        jButtonBandas.setText("BANDAS");
        jButtonBandas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonBandas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBandasActionPerformed(evt);
            }
        });

        jButtonEnseres.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        jButtonEnseres.setText("ENSERES");
        jButtonEnseres.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonEnseres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnseresActionPerformed(evt);
            }
        });

        jButtonHermandad.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        jButtonHermandad.setText("HERMANDAD");
        jButtonHermandad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButtonHermandad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHermandadActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Eventos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tempus Sans ITC", 1, 18), new java.awt.Color(51, 51, 255))); // NOI18N

        jButtonEstacionPenitencia.setFont(new java.awt.Font("Source Code Pro Semibold", 1, 12)); // NOI18N
        jButtonEstacionPenitencia.setText("Estación de Penitencia");
        jButtonEstacionPenitencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEstacionPenitenciaActionPerformed(evt);
            }
        });

        jButtonCultos.setFont(new java.awt.Font("Source Code Pro Semibold", 1, 12)); // NOI18N
        jButtonCultos.setText("Cultos");
        jButtonCultos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCultosActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Source Code Pro Semibold", 1, 12)); // NOI18N
        jButton3.setText("Festividad Cristo");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Source Code Pro Semibold", 1, 12)); // NOI18N
        jButton4.setText("Festividad Virgen");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonEstacionPenitencia, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCultos, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonEstacionPenitencia, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCultos, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Controlador de Tiempos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Open Sans Semibold", 1, 14), new java.awt.Color(51, 102, 255))); // NOI18N

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 0), 2, true));

        jLabelFecha.setFont(new java.awt.Font("Patrick Hand SC", 0, 24)); // NOI18N
        jLabelFecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/misemanasanta01/Graficos/calendario.png"))); // NOI18N
        jLabelFecha.setText("FECHA");

        jLabelFechaMes.setFont(new java.awt.Font("Papyrus", 0, 18)); // NOI18N
        jLabelFechaMes.setForeground(new java.awt.Color(153, 0, 0));
        jLabelFechaMes.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelFechaMes.setText("SEPTIEMBRE");

        jLabelFechaAnio.setFont(new java.awt.Font("Papyrus", 0, 24)); // NOI18N
        jLabelFechaAnio.setForeground(new java.awt.Color(153, 0, 0));
        jLabelFechaAnio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelFechaAnio.setText("2020");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelFechaMes, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelFechaAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelFecha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFechaMes)
                    .addComponent(jLabelFechaAnio)))
        );

        jButtonPasarMes.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jButtonPasarMes.setForeground(new java.awt.Color(51, 51, 255));
        jButtonPasarMes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/misemanasanta01/Graficos/Siguiente.png"))); // NOI18N
        jButtonPasarMes.setText("NUEVO MES");
        jButtonPasarMes.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButtonPasarMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPasarMesActionPerformed(evt);
            }
        });

        jButtonPasarSemana.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        jButtonPasarSemana.setForeground(new java.awt.Color(51, 51, 255));
        jButtonPasarSemana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/misemanasanta01/Graficos/Siguiente.png"))); // NOI18N
        jButtonPasarSemana.setText("NUEVA SEMANA");
        jButtonPasarSemana.setEnabled(false);
        jButtonPasarSemana.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButtonPasarSemana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPasarSemanaActionPerformed(evt);
            }
        });

        jLabelSemanaCuaresma.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        jLabelSemanaCuaresma.setForeground(new java.awt.Color(0, 102, 51));
        jLabelSemanaCuaresma.setText("PRIMERA SEMANA DE CUARESMA");
        jLabelSemanaCuaresma.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonPasarMes)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelSemanaCuaresma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonPasarSemana, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabelSemanaCuaresma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonPasarMes, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonPasarSemana, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "HISTÓRICO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("ZapfHumnst Ult BT", 1, 12), new java.awt.Color(51, 0, 255))); // NOI18N

        jTextAreaHistorico.setEditable(false);
        jTextAreaHistorico.setBackground(new java.awt.Color(51, 255, 204));
        jTextAreaHistorico.setColumns(20);
        jTextAreaHistorico.setFont(new java.awt.Font("Monotype Corsiva", 1, 18)); // NOI18N
        jTextAreaHistorico.setLineWrap(true);
        jTextAreaHistorico.setRows(5);
        jTextAreaHistorico.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jTextAreaHistorico);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenuArchivo.setText("Archivo");

        jMenuItemNuevaPartida.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemNuevaPartida.setText("Nueva Partida");
        jMenuItemNuevaPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNuevaPartidaActionPerformed(evt);
            }
        });
        jMenuArchivo.add(jMenuItemNuevaPartida);
        jMenuArchivo.add(jSeparator3);

        jMenuItemCarPartida.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemCarPartida.setText("Cargar Partida");
        jMenuItemCarPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCarPartidaActionPerformed(evt);
            }
        });
        jMenuArchivo.add(jMenuItemCarPartida);

        jMenuItemGuardarPartida.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemGuardarPartida.setText("Guardar Partida");
        jMenuItemGuardarPartida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemGuardarPartidaActionPerformed(evt);
            }
        });
        jMenuArchivo.add(jMenuItemGuardarPartida);
        jMenuArchivo.add(jSeparator4);

        jMenuItemSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemSalir.setText("Salir");
        jMenuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalirActionPerformed(evt);
            }
        });
        jMenuArchivo.add(jMenuItemSalir);

        jMenuBar1.add(jMenuArchivo);

        jOpciones.setText("Opciones");
        jMenuBar1.add(jOpciones);

        jMenuJuego.setText("Juego");
        jMenuBar1.add(jMenuJuego);

        jMenuAyudaPrincipal.setText("Ayuda");

        jMenuTutorial.setText("Tutorial");

        jMenuVariables.setText("Variables del Juego");

        jMenuItemDinero.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItemDinero.setText("Dinero");
        jMenuItemDinero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemDineroActionPerformed(evt);
            }
        });
        jMenuVariables.add(jMenuItemDinero);

        jMenuItemHermanos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItemHermanos.setText("Hermanos");
        jMenuItemHermanos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemHermanosActionPerformed(evt);
            }
        });
        jMenuVariables.add(jMenuItemHermanos);

        jMenuItemNazarenos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItemNazarenos.setText("Nazarenos");
        jMenuItemNazarenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemNazarenosActionPerformed(evt);
            }
        });
        jMenuVariables.add(jMenuItemNazarenos);

        jMenuItemPopularidad.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItemPopularidad.setText("Popularidad");
        jMenuVariables.add(jMenuItemPopularidad);

        jMenuItemFervor.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        jMenuItemFervor.setText("Fervor");
        jMenuVariables.add(jMenuItemFervor);

        jMenuTutorial.add(jMenuVariables);

        jMenuOpcionesJuego.setText("Opciones del Juego");

        jMenuAyudaFinanzas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMenuAyudaFinanzas.setText("Finanzas");
        jMenuOpcionesJuego.add(jMenuAyudaFinanzas);

        jMenuTutorial.add(jMenuOpcionesJuego);

        jMenuAyudaPrincipal.add(jMenuTutorial);
        jMenuAyudaPrincipal.add(jSeparator2);

        jMenuAyuda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMenuAyuda.setText("Ayuda");
        jMenuAyudaPrincipal.add(jMenuAyuda);

        jMenuAcercaDe.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F10, 0));
        jMenuAcercaDe.setText("Acerca de...");
        jMenuAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAcercaDeActionPerformed(evt);
            }
        });
        jMenuAyudaPrincipal.add(jMenuAcercaDe);

        jMenuBar1.add(jMenuAyudaPrincipal);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonHermandad, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonGuion, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonPasos, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonBandas, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonEnseres, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonFinanzas, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButtonSedeCanonica, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(54, 54, 54)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(163, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(labelDinero)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldDinero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelHermanos)
                        .addGap(4, 4, 4)
                        .addComponent(jTextFieldHermanos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(labelNazarenos)
                        .addGap(4, 4, 4)
                        .addComponent(jTextFieldNazarenos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(labelPopularidad)
                        .addGap(14, 14, 14)
                        .addComponent(jTextFieldPopularidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelFervor)
                        .addGap(10, 10, 10)
                        .addComponent(jTextFieldFervor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1076, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelDinero, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDinero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelHermanos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldHermanos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNazarenos, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNazarenos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelPopularidad, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPopularidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelFervor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldFervor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonFinanzas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonSedeCanonica, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonGuion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonPasos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonBandas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonEnseres, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButtonHermandad, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonSalir, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        MiSemanaSanta01.ventanaPrincipal.dispose(); //Salimos de la aplicación
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonFinanzasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFinanzasActionPerformed
        
        System.out.println("Ventana Finanzas");
        finanzas.jLabelNombreHermandad.setText(MiSemanaSanta01.nombreHermandad);
        finanzas.setVisible(true); //Mostramos la ventana
        this.setEnabled(false); //Desactivamos la Ventana Principal    
    }//GEN-LAST:event_jButtonFinanzasActionPerformed

    private void jButtonGuionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuionActionPerformed
        //System.out.println(miHermandad.getColorCapa());
        
        if(VentanaPrincipal.miHermandad.getColorCapa() == 100) {
            JOptionPane.showConfirmDialog(null, "Aún no has elegido el guión de tu hermandad. Selecciona los colores.", "GUIÓN", JOptionPane.DEFAULT_OPTION);
            guion.jButtonCambiarGuion.setEnabled(false);
        } else { //Si entra aquí, es porque ya ha escogido guion. Desactivamos opciones que no proceden
            guion.jComboElegirCapa.setEnabled(false);
            guion.jComboElegirCaperuz.setEnabled(false);
            guion.jComboElegirTunica.setEnabled(false);
            guion.jButtonEstablecer.setEnabled(false);
            guion.jButtonCambiarGuion.setEnabled(true);
        }
        
        
        System.out.println("Ventana Guion");
        guion.setVisible(true); //Mostramos la ventana
        this.setEnabled(false); //Desactivamos la Ventana Principal      
    }//GEN-LAST:event_jButtonGuionActionPerformed

    private void jButtonPasosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPasosActionPerformed
        System.out.println("Ventana Pasos");
        if(miHermandad.getCristo()<0) { //Esto indica que aún no tenemos Cristo
            JOptionPane.showConfirmDialog(null, "Aún no tienes una imagen titular de Cristo.", "IMAGEN CRISTO", JOptionPane.DEFAULT_OPTION);
        } 
        pasos.setVisible(true); //Mostramos la ventana
        this.setEnabled(false); //Desactivamos la Ventana Principal
        //Desactivamos los botones de escoger imagen
        pasos.jButtonAnteriorImagen.setEnabled(false);
        pasos.jButtonSiguienteImagen.setEnabled(false);
        pasos.jButtonComprarImagen.setEnabled(false);
    }//GEN-LAST:event_jButtonPasosActionPerformed

    private void jButtonBandasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBandasActionPerformed
        System.out.println("Ventana Bandas");
        bandas.setVisible(true); //Mostramos la ventana
        this.setEnabled(false); //Desactivamos la Ventana Principal
    }//GEN-LAST:event_jButtonBandasActionPerformed

    private void jButtonEnseresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnseresActionPerformed
        System.out.println("Ventana Enseres");
        enseres.setVisible(true); //Mostramos la ventana
        this.setEnabled(false); //Desactivamos la Ventana Principal
    }//GEN-LAST:event_jButtonEnseresActionPerformed

    private void jButtonPasarMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPasarMesActionPerformed
        //Pasamos un mes
        mes++;
        //Si es diciembre, pasamos a enero, sumando un año
        if(mes>12) {
            mes=1;
            anio++;
        }
        //Si llegamos a Marzo, empieza la Cuaresma. Activamos el botón de las Semanas y desactivamos el de los meses
        if(mes==3) {
            jButtonPasarMes.setEnabled(false);
            jButtonPasarSemana.setEnabled(true);
            jLabelSemanaCuaresma.setVisible(true);
            semana = 1;
        }
        
        //Establecemos el texto en las etiquetas del calendario
        establecerFecha(mes, anio);
        //Calculamos los ingresos
        calcularIngresosMes();
        //Mostramos el mensaje con el dinero recaudado al mes
        calcularHermanosMes();
        String textoHermanos = "";//Cadena que va a indicar si ganamos o perdemos hermanos
        //Mostramos el mensaje
        if(hermanosNuevos > 0) textoHermanos = "La hermandad tiene " + hermanosNuevos + " nuevos hermanos gracias a las bajas cuotas";
        if(hermanosNuevos == 0) textoHermanos = "Este mes la hermandad no tiene altas ni bajas de hermanos";
        if(hermanosNuevos < 0) textoHermanos = "Se han dado de baja " + hermanosNuevos*(-1) + " hermanos porque las cuotas son altas";
        
        JOptionPane.showMessageDialog(null, "Por cuota mensual, la Hermandad recauda: " + dineroCuotas + " €.\n\n" + textoHermanos, "Resumen Mes", JOptionPane.OK_OPTION, icono2Dialogos);
        System.out.println("Por cuota mensual, la Hermandad recauda: " + dineroCuotas + " €.");// Desactivamos de momento el JOptionPane para las pruebas, lo vemos en consola
        
        //Mensaje para el histórico
        MiSemanaSanta01.ventanaPrincipal.escribirHistorico("Has pasado un mes. Ya estás en el mes de " + jLabelFechaMes.getText() + ".\n\n");
        
        //GAME OVER
        
    }//GEN-LAST:event_jButtonPasarMesActionPerformed

    private void jButtonSedeCanonicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSedeCanonicaActionPerformed
        //Si la hermandad no tiene Sede Canónica, hay que elegir una
        if(VentanaPrincipal.miHermandad.getSedeCanonica().isEmpty()) {
            JOptionPane.showConfirmDialog(null, "Aún no has elegido la Sede Canónica de tu hermandad. Escoge una iglesia de las disponibles.", "SEDE CANÓNICA", JOptionPane.DEFAULT_OPTION);
        } else { //Si entra aquí, es porque ya ha escogido sede canónica. Desactivamos opciones que no proceden
            sedecanonica.jComboBoxEligeIglesiia.setEnabled(false);
            sedecanonica.jButtonEstablecer.setEnabled(false);
        }
        
        System.out.println("Ventana Sede Canonica");
        sedecanonica.setVisible(true); //Mostramos la ventana
        this.setEnabled(false); //Desactivamos la Ventana Principal
    }//GEN-LAST:event_jButtonSedeCanonicaActionPerformed

    private void jButtonHermandadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHermandadActionPerformed
        //Si la hermandad no tiene nombre, hay que ponerle uno
        if(MiSemanaSanta01.nombreHermandad.isEmpty()) {
            JOptionPane.showConfirmDialog(null, "Aún no has pusto un nombre a tu hermandad. Escoge Advocación Cristífera y Advocación Mariana para establecer un nombre.", "CASA DE HERMANDAD", JOptionPane.DEFAULT_OPTION);
        } else { //Si entra aquí, es porque la hermandad ya tiene nombre
            casaHermandad.jComboCristo.setEnabled(false);
            casaHermandad.jComboVirgen.setEnabled(false);
            casaHermandad.jButtonAceptar.setEnabled(false);
        }
        System.out.println("Ventana de Casa de Hermandad");
        casaHermandad.setVisible(true); //Mostramos la ventana
        this.setEnabled(false); //Desactivamos la Ventana Principal
    }//GEN-LAST:event_jButtonHermandadActionPerformed

    private void jMenuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalirActionPerformed
        MiSemanaSanta01.ventanaPrincipal.dispose(); //Salimos de la aplicación
    }//GEN-LAST:event_jMenuItemSalirActionPerformed

    private void jMenuAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAcercaDeActionPerformed
        JOptionPane.showConfirmDialog(null, Textos.TEXTO_ACERCA_DE, "ACERCA DE...",
                JOptionPane.CLOSED_OPTION, JOptionPane.INFORMATION_MESSAGE, iconoDialogos);
    }//GEN-LAST:event_jMenuAcercaDeActionPerformed

    private void jButtonEstacionPenitenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEstacionPenitenciaActionPerformed
        Graphics g = this.getGraphics();
        //Graphics g = estacionPenitencia.botonSalir.getGraphics(); //No funciona
        //g.drawLine(10, 10, 30, 30);
        estacionPenitencia.paint(g);
        //jLabelFechaMes.paint(g);
        System.out.println("Ventana Estacion de Penitencia");
        //estacionPenitencia.setVisible(true); //Mostramos la ventana
        //this.setEnabled(false); //Desactivamos la Ventana Principal
        
        
    }//GEN-LAST:event_jButtonEstacionPenitenciaActionPerformed

    private void jMenuItemDineroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemDineroActionPerformed
        iconoDialogos = new ImageIcon(getClass().getResource("/misemanasanta01/Graficos/Monedas.png"));//Cambiamos el icono
        JOptionPane.showConfirmDialog(null, Textos.TEXTO_AYUDA_DINERO, "DINERO", //Mostramos el mensaje
                JOptionPane.CLOSED_OPTION, JOptionPane.INFORMATION_MESSAGE, iconoDialogos);
    }//GEN-LAST:event_jMenuItemDineroActionPerformed

    private void jMenuItemHermanosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemHermanosActionPerformed
        iconoDialogos = new ImageIcon(getClass().getResource("/misemanasanta01/Graficos/Gente2.png"));//Cambiamos el icono
        JOptionPane.showConfirmDialog(null, Textos.TEXTO_AYUDA_HERMANOS, "HERMANOS", //Mostramos el mensaje
                JOptionPane.CLOSED_OPTION, JOptionPane.INFORMATION_MESSAGE, iconoDialogos);
    }//GEN-LAST:event_jMenuItemHermanosActionPerformed

    private void jMenuItemNazarenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNazarenosActionPerformed
        iconoDialogos = new ImageIcon(getClass().getResource("/misemanasanta01/Graficos/Penitente.png"));//Cambiamos el icono
        JOptionPane.showConfirmDialog(null, Textos.TEXTO_AYUDA_NAZARENOS, "NAZARENOS", //Mostramos el mensaje
                JOptionPane.CLOSED_OPTION, JOptionPane.INFORMATION_MESSAGE, iconoDialogos);
    }//GEN-LAST:event_jMenuItemNazarenosActionPerformed

    private void jMenuItemNuevaPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemNuevaPartidaActionPerformed
        System.out.println("Partida Nueva");
        
    }//GEN-LAST:event_jMenuItemNuevaPartidaActionPerformed

    private void jMenuItemGuardarPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemGuardarPartidaActionPerformed
        try {
            System.out.println("Guardar Partida");
            //Creamos la instancia de la Ventana para guardar archivo
            jFileChooserGuardar = new JFileChooser();
            //Abrimos la ventana diálogo de guardar partida como tipo guardar SAVEDIALOG
            this.jFileChooserGuardar.showSaveDialog(this);
            //Creamos instancia de el archivo, que será el texto que le daremos al nombre de nuestra partida
            archivo = jFileChooserGuardar.getSelectedFile();
            if(archivo != null) //Si el nombre no está vacío...
            {
                //Creamos un objeto de Stream de Salida (OutputStream)
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo + ".mss")); //La extensión es lo de menos, elegimos esta mismo
                oos.writeObject(miHermandad); //Guardamos el objeto instanciado de la clase
                oos.close(); //Cerramos la conexión del Stream de Salida
                //Mostramos un mensaje indicando que todo ha ido bien
                JOptionPane.showMessageDialog(null, "El archivo se ha guardado correctamente", "PARTIDA GUARDADA",JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (IOException ex) { //Si entramos aquí, ha habido algún error
            JOptionPane.showMessageDialog(null, "No se ha podido guardar la partida", "Advertencia",JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_jMenuItemGuardarPartidaActionPerformed

    private void jMenuItemCarPartidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCarPartidaActionPerformed
        System.out.println("Cargar Partida");
        try {
            //Creamos la instancia de la Ventana para vargar la partida
            jFileChooserGuardar = new JFileChooser();
            //Abrimos la ventana diálogo de abrir partida como tipo OPEN SAVEDIALOG
            this.jFileChooserGuardar.showOpenDialog(this);
            this.jFileChooserGuardar.setAcceptAllFileFilterUsed(false);
            archivo = jFileChooserGuardar.getSelectedFile(); //Esta es la instancia del archivo que vamos a abrir
            Object aux; //Objeto auxiliar donde se va a almacenar la clase almacenada en el archivo
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo))) {
                aux = ois.readObject(); //Guardamos en el objeto auxiliar el objeto leído del archivo
            }
            miHermandad = (Hermandad) aux; //El objeto auxiliar lo guardamos en el objeto de miHermandad, donde tenemos los datos del juego
            System.out.println("" + miHermandad.getDinero());
            //Indicamos la partida se ha cargado correctamente
            JOptionPane.showMessageDialog(null, "La Partida ha sido cargada", "PARTIDA CARGADA", JOptionPane.INFORMATION_MESSAGE);
            //Actualizamos las etiquetas que se ven en la pantalla principal...
            initHermandad();
           
            //Cargamos los datos de la clase en la Ventana del Guion de la Hermandad
            guion.ponerColorCapa(miHermandad.getColorCapa());
            guion.ponerColorCaperuz(miHermandad.getColorCaperuz());
            guion.ponerColorTunica(miHermandad.getColorTunica());
            //También cambiamos los datos de las finanzas que se guardaron en la clase
            finanzas.jSliderCuotaHermano.setValue(miHermandad.getPrecioCuotaHermano());
            finanzas.jSliderPapeletaSitio.setValue(miHermandad.getPrecioPapeletaSitio());
            finanzas.jSliderLoteriaNavidad.setValue(miHermandad.getPrecioLoteriaNavidad());
            //Cambiamos el nombre de la Hermandad
            MiSemanaSanta01.nombreHermandad = miHermandad.getTituloHermandad();
            //finanzas.jLabelNombreHermandad.setText(miHermandad.getTituloHermandad()); //No funciona, revisar
            //Vamos con los datos de la sede Canónica. Comprobamos primero la iglesia elegida
            if(miHermandad.getSedeCanonica().startsWith("Bas"))
                sedecanonica.jComboBoxEligeIglesiia.setSelectedIndex(0);
            if(miHermandad.getSedeCanonica().contains("Fran"))
                sedecanonica.jComboBoxEligeIglesiia.setSelectedIndex(1);
            if(miHermandad.getSedeCanonica().contains("Agus"))
                sedecanonica.jComboBoxEligeIglesiia.setSelectedIndex(2);
            if(miHermandad.getSedeCanonica().contains("Santa"))
                sedecanonica.jComboBoxEligeIglesiia.setSelectedIndex(3);
            if(miHermandad.getSedeCanonica().contains("Jos"))
                sedecanonica.jComboBoxEligeIglesiia.setSelectedIndex(4);
            //Si la sede canónica no está vacía es porque ya se ha elegido... se activa el botón de poder cambiarla.
            if(!miHermandad.getSedeCanonica().isEmpty())
                sedecanonica.jButtonCambiarSede.setEnabled(true); //Activamos el botón para cambiar de sede canónica
            //Vamos con los cultos y festividades
            sedecanonica.jComboBoxSemanaCultos.setSelectedIndex(miHermandad.getSemanaCultos());
            sedecanonica.jComboBoxMesFCristo.setSelectedIndex(miHermandad.getFestividadCristo());
            sedecanonica.jComboBoxMesFVirgen.setSelectedIndex(miHermandad.getFestividadVirgen());
            //Escribimos el histórico, con el método sobrecargado sin parámetros
            escribirHistorico();
            
            
        } catch (FileNotFoundException ex) { //Si entramos aquí, ha habido algún error
            JOptionPane.showMessageDialog(null, "No se ha podido guardar la partida", "Advertencia",JOptionPane.WARNING_MESSAGE);
        } catch (IOException | ClassNotFoundException ex) { //Si entramos aquí, ha habido algún error
            JOptionPane.showMessageDialog(null, "No se ha podido guardar la partida", "Advertencia",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItemCarPartidaActionPerformed

    private void jButtonCultosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCultosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCultosActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButtonPasarSemanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPasarSemanaActionPerformed
        if(semana < 5) {
            semana++;
        } else {
            semana = 0;
            jButtonPasarSemana.setEnabled(false);
            jButtonPasarMes.setEnabled(true);
            jLabelSemanaCuaresma.setVisible(false);
            jLabelSemanaCuaresma.setText("PRIMERA SEMANA DE CUARESMA");
        }
        //if(semana==1) jLabelSemanaCuaresma.setText("PRIMERA SEMANA DE CUARESMA");
        if(semana==2) jLabelSemanaCuaresma.setText("SEGUNDA SEMANA DE CUARESMA");
        if(semana==3) jLabelSemanaCuaresma.setText("TERCERA SEMANA DE CUARESMA");
        if(semana==4) { //A mitad de Cuaresma más o menos pasamos de mes
            jLabelSemanaCuaresma.setText("CUARTA SEMANA DE CUARESMA");
            mes++;
            establecerFecha(mes, anio);
            calcularIngresosMes();
            //Mostramos el mensaje con el dinero recaudado al mes
            JOptionPane.showMessageDialog(null, "Por cuota mensual, la Hermandad recauda: " + dineroCuotas + " €.", "Resumen Mes", JOptionPane.OK_OPTION, icono2Dialogos);
            System.out.println("Por cuota mensual, la Hermandad recauda: " + dineroCuotas + " €.");// Desactivamos de momento el JOptionPane para las pruebas, lo vemos en consola
        }
        if(semana==5) jLabelSemanaCuaresma.setText("QUINTA SEMANA DE CUARESMA");
    }//GEN-LAST:event_jButtonPasarSemanaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonBandas;
    private javax.swing.JButton jButtonCultos;
    private javax.swing.JButton jButtonEnseres;
    private javax.swing.JButton jButtonEstacionPenitencia;
    private javax.swing.JButton jButtonFinanzas;
    private javax.swing.JButton jButtonGuion;
    private javax.swing.JButton jButtonHermandad;
    private javax.swing.JButton jButtonPasarMes;
    private javax.swing.JButton jButtonPasarSemana;
    private javax.swing.JButton jButtonPasos;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JButton jButtonSedeCanonica;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelFechaAnio;
    private javax.swing.JLabel jLabelFechaMes;
    private javax.swing.JLabel jLabelSemanaCuaresma;
    private javax.swing.JMenuItem jMenuAcercaDe;
    private javax.swing.JMenu jMenuArchivo;
    private javax.swing.JMenuItem jMenuAyuda;
    private javax.swing.JMenuItem jMenuAyudaFinanzas;
    private javax.swing.JMenu jMenuAyudaPrincipal;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemCarPartida;
    private javax.swing.JMenuItem jMenuItemDinero;
    private javax.swing.JMenuItem jMenuItemFervor;
    private javax.swing.JMenuItem jMenuItemGuardarPartida;
    private javax.swing.JMenuItem jMenuItemHermanos;
    private javax.swing.JMenuItem jMenuItemNazarenos;
    private javax.swing.JMenuItem jMenuItemNuevaPartida;
    private javax.swing.JMenuItem jMenuItemPopularidad;
    private javax.swing.JMenuItem jMenuItemSalir;
    private javax.swing.JMenu jMenuJuego;
    private javax.swing.JMenu jMenuOpcionesJuego;
    private javax.swing.JMenu jMenuTutorial;
    private javax.swing.JMenu jMenuVariables;
    private javax.swing.JMenu jOpciones;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JTextArea jTextAreaHistorico;
    public javax.swing.JTextField jTextFieldDinero;
    public javax.swing.JTextField jTextFieldFervor;
    public javax.swing.JTextField jTextFieldHermanos;
    public javax.swing.JTextField jTextFieldNazarenos;
    public javax.swing.JTextField jTextFieldPopularidad;
    private javax.swing.JLabel labelDinero;
    private javax.swing.JLabel labelFervor;
    private javax.swing.JLabel labelHermanos;
    private javax.swing.JLabel labelNazarenos;
    private javax.swing.JLabel labelPopularidad;
    // End of variables declaration//GEN-END:variables

    private void initHermandad() {
        jTextFieldDinero.setText("" + miHermandad.getDinero()); //Asignamos los valores a sus respectivos campos
        jTextFieldHermanos.setText("" + miHermandad.getHermanos()); //Asignamos los valores a sus respectivos campos
        jTextFieldFervor.setText("" + miHermandad.getFervor()); //Asignamos los valores a sus respectivos campos
        jTextFieldNazarenos.setText("" + miHermandad.getNazarenos()); //Asignamos los valores a sus respectivos campos
        jTextFieldPopularidad.setText("" + miHermandad.getPopularidad()); //Asignamos los valores a sus respectivos campos
        //Escondemos el Label de las semanas de Cuaresma
        jLabelSemanaCuaresma.setVisible(false);
    }
    
    private void establecerFecha(int mes, int anio) {
        //Ponemos el texto en la etiqueta del mes
        switch(mes) {
            case 1:
                jLabelFechaMes.setText("Enero"); break;
            case 2:
                jLabelFechaMes.setText("Febrero"); break;
            case 3:
                jLabelFechaMes.setText("Marzo"); break;
            case 4:
                jLabelFechaMes.setText("Abril"); break;
            case 5:
                jLabelFechaMes.setText("Mayo"); break;
            case 6:
                jLabelFechaMes.setText("Junio"); break;
            case 7:
                jLabelFechaMes.setText("Julio"); break;
            case 8:
                jLabelFechaMes.setText("Agosto"); break;
            case 9:
                jLabelFechaMes.setText("Septiembre"); break;
            case 10:
                jLabelFechaMes.setText("Octubre"); break;
            case 11:
                jLabelFechaMes.setText("Noviembre"); break;
            case 12:
                jLabelFechaMes.setText("Diciembre"); break;
        }
        //Ponemos el texco en la etiqueta del año
        jLabelFechaAnio.setText(""+anio);
    }

    private void calcularIngresosMes() {
        //Calculamos el dinero recaudado según el precio de cuota y el número de hermanos
        dineroCuotas = finanzas.jSliderCuotaHermano.getValue() * miHermandad.getHermanos();
        //Sumamos el dinero y lo guardamos en la clase de los datos de la hermandad
        miHermandad.setDinero(miHermandad.getDinero() + dineroCuotas);
        //Cambiamos el valor de la etiqueta que muestra el dinero
        jTextFieldDinero.setText("" + miHermandad.getDinero());
    }

    private void calcularHermanosMes() {
        //Vamos a calcular la subida o bajada de hermanos en función de la cuota
        hermanosNuevos = miHermandad.calcularNuevosHermanosSegunCuota(miHermandad.getPrecioCuotaHermano());
        //Modificamos la variable en la clase
        miHermandad.setHermanos(miHermandad.getHermanos() + hermanosNuevos);
        //Vamos a comprobar los hermanos de la Hermandad. Si es menor que 0, se queda en 0
        if(miHermandad.getHermanos()<0) miHermandad.setHermanos(0);
        //Cambiamos el texto del jLabel correspondiente
        jTextFieldHermanos.setText("" + miHermandad.getHermanos());
    }
    
    public void escribirHistorico(String cadenaNueva) {
        miHermandad.historico1 = miHermandad.historico2;
        miHermandad.historico2 = miHermandad.historico3;
        miHermandad.historico3 = miHermandad.historico4;
        miHermandad.historico4 = cadenaNueva;
        jTextAreaHistorico.setText(miHermandad.historico1 + miHermandad.historico2 +miHermandad.historico3 +miHermandad.historico4);
    }
    
    //Método sobrecargado
    
    public void escribirHistorico() {
        jTextAreaHistorico.setText(miHermandad.historico1 + miHermandad.historico2 +miHermandad.historico3 +miHermandad.historico4);
    }
    
}
