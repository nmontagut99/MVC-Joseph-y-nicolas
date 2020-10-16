/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicundi.mvc;

/**
 *
 * @author MontagutN
 */
public class Validacion {

    //Parámetros desde la vista
    String username ;
    String password ;

    //Datos para reemplazar la base de datos del modelo
    String nombre1 = "nicolas";
    String contraseña1 = "leandro";

    /**
     * Constructor que recibe un usuario y contraseña para validar existencia
     * @param username
     * @param password 
     */
    public Validacion(String username, String password) {
        this.username = username;
        this.password = password;
    } 
    
    /**
     * Método para validar existencia del usuario
     */
    public boolean Existencia(){
        
        //Variable para saber si el usuario existe o no
        boolean existe;
        
        //Comparando cadenas
        existe = this.username.equals(nombre1) && this.password.equals(contraseña1);
        return existe;
    }
    
    
}
