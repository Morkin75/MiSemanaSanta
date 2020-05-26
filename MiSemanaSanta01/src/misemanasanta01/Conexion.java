package misemanasanta01;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ManuPortatil
 */
public class Conexion {
    
    public static Connection conexion;
    
    public static void conectar(){
        //Creamos la cadena de conexión
        //String url = "jdbc:mysql://localhost:3306/semanasanta?useSSL=false&serverTimezone=UTC";
        String url = "jdbc:mysql://localhost:3306/semanasanta?serverTimezone=UTC";
        try {
            //Creamos el objeto de conexion
            conexion = (Connection) DriverManager.getConnection(url, "root", "Cray%3126");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void leerIglesias(){
        try {
            //Creamos el objeto Statement
            Statement instruccion = conexion.createStatement();
            //Creamos la consulta
            String sql = "select * from iglesias";
            ResultSet result = instruccion.executeQuery(sql);
            while(result.next()) {
                System.out.print("ID: " + result.getInt(1));
                System.out.print("Nombre: " + result.getString(2));
                System.out.print("Direccion: " + result.getString(3));
                System.out.print("Capacidad: " + result.getInt(4));
            }
            //Cerramos el resultset
            result.close();
            //Cerramos la instrucción
            instruccion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void desconectar(){
        try {
            //desconectamos
            conexion.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
