/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.educastur.fuc29945.biblioteca2025;

/**
 *
 * @author 1dawd27
 */
public class UsuarioNoExistente extends Exception{
    public UsuarioNoExistente(String cadena){
        super(cadena);//llamo al constructor de la clase excepcion y le pasa el contenido
    }
}
