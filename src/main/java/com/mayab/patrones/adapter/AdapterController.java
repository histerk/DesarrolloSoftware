/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.adapter;

/**
 *
 * @author migue
 */
public class AdapterController {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       personaEquis viejo = new personaEquis("juan","perez","01/03/2015");
       Alan nuevo = new Alan("miguel Mendoza",22);
       personaVieja adaptar = new PersonaAdapter(nuevo);
       System.out.println("Persona vieja: "+viejo.getNombre()+" "+viejo.getApellido()+" "+viejo.getFecha());
       System.out.println("Persona nueva: "+nuevo.getNombre()+" "+nuevo.getEdad());
       System.out.println("Persona adaptada: "+adaptar.getNombre()+" "+adaptar.getApellido()+" "+adaptar.getFecha());
    }
    
}
