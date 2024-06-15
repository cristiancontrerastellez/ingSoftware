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
        // Implementación del cálculo del costo para sobres
        // Ejemplo de implementación (ajustar según la lógica de negocio):
        float costo = peso * 10 + valorDeclarado * 0.05f;
        if (internacional) {
            costo += 15;
        }
        return costo;
    }
}
