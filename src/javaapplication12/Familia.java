/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

/**
 *
 * @author Estudiante
 */
public class Familia {
    private String apellido;
    private Persona madre;
    private Persona padre;
    private Persona[] hijos;

    public Familia(String apellido){
        this.apellido = apellido;
        this.hijos = new Persona[2];
    }
    public Persona[] listarMiembros(){
        return null;
    }
    public Persona buscarMiembro(String nombre){
        return null;
    }
}
