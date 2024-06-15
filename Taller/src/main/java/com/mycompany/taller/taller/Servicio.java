/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller.taller;

/**
 *
 * @author Cristian
 */
public abstract class Servicio {
    protected String tipo;

    public abstract float calcularCosto(float peso, float valorDeclarado, boolean internacional);
}
