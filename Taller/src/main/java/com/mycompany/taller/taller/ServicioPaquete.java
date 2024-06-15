/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller.taller;

/**
 *
 * @author Cristian
 */
public class ServicioPaquete extends Servicio {

    public ServicioPaquete() {
        this.tipo = "Paquete";
    }

    @Override
    public float calcularCosto(float peso, float valorDeclarado, boolean internacional) {
        // Implementación del cálculo del costo para paquetes
        // Ejemplo de implementación (ajustar según la lógica de negocio):
        float costo = peso * 20 + valorDeclarado * 0.1f;
        if (internacional) {
            costo += 25;
        }
        return costo;
    }
}

