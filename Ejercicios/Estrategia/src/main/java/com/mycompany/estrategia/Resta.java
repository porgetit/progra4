/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.estrategia;

/**
 *
 * @author Kevin Esguerra Cardona
 */
public class Resta implements ICalculadora{

    @Override
    public double operacion(double a, double b) {
        return a - b;
    }
    
}
