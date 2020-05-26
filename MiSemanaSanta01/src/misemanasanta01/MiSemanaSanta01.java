/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misemanasanta01;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author ManuSobremesa
 */
public class MiSemanaSanta01 {

    //Instancia para guardar el nombre de la Hermandad
    static public String nombreHermandad;
    //Instancias para guardar las advocaciones de los combobox, la posició del combo
    static public int advocacionC, advocacionV;
    
    static public VentanaPrincipal ventanaPrincipal;
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        //Inicializamos el nombre de la Hermandad
        nombreHermandad = "";
        //Inicializamos las Advocaciones
        advocacionC = 0;
        advocacionV = 0;
        
        //Centramos la pantalla
        //Vemos las dimensiones de la pantalla
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        int height = pantalla.height;
        int width = pantalla.width;
        
        //Creamos instancia de la Ventana Principal
        ventanaPrincipal = new VentanaPrincipal();
        ventanaPrincipal.setSize(1284, 800);	//Indicamos el tamaño de la ventana	

        ventanaPrincipal.setLocationRelativeTo(null);	//Centramos la ventana a la pantalla	
        //ventanaPrincipal.setExtendedState(JFrame.MAXIMIZED_BOTH); //Eliminar esta línea cuando creemos la distribución
        ventanaPrincipal.setVisible(true); //Mostramos la ventana
        
        //Vamos a ver si funciona la conexion
        //Conexion.conectar();
        //Conexion.leerIglesias();
        //Conexion.desconectar();
       
        
        
    }
    
}
