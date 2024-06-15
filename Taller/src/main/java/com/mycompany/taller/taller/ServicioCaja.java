/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller.taller;

/**
 *
 * @author Cristian
 */
public class ServicioCaja extends Servicio {

    public ServicioCaja() {
        this.tipo = "Caja";
    }

    @Override
    public float calcularCosto(float peso, float valorDeclarado, boolean internacional) {
        // Implementación del cálculo del costo para cajas
        // Ejemplo de implementación (ajustar según la lógica de negocio):
        float costo = peso * 15 + valorDeclarado * 0.08f;
        if (internacional) {
            costo += 20;
        }
        return costo;
    }
}

