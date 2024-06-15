/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller.taller;

/**
 *
 * @author Cristian
 */
public class ServicioSobre extends Servicio {

    public ServicioSobre() {
        this.tipo = "Sobre";
    }

    @Override
    public float calcularCosto(float peso, float valorDeclarado, boolean internacional) {
        float costo = 5000 + 10000;
        if (internacional) {
            costo *= 1.25;
        }
        return costo;
    }
}