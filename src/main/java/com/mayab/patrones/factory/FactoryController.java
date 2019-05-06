/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.factory;

/**
 *
 * @author migue
 */
public class FactoryController {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TrianguloCreate isos = new CreadorTriangulos();
        Triangulo equi = isos.calculos("Escaleno",5,3,7);
        equi = isos.calculos("Equilatero",5,5,5);
        equi = isos.calculos("Isosceles",6,6,3);
        
    }
    
}
