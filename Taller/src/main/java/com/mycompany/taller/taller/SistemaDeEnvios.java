/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller.taller;

/**
 *
 * @author Cristian
 */
import java.util.ArrayList;
import java.util.List;

public class SistemaDeEnvios {
    private List<Guia> guias = new ArrayList<>();

    // Métodos
    public void registrarGuia(Guia guia) {
        guias.add(guia);
    }

    public void registrarEntrega(int numeroGuia) {
        for (Guia guia : guias) {
            if (guia.getNumero() == numeroGuia) {
                guia.cambiarEstado(EstadoGuia.FINALIZADA);
                break;
            }
        }
    }

    public List<Guia> consultarGuiasPorEstado(EstadoGuia estado) {
        List<Guia> resultado = new ArrayList<>();
        for (Guia guia : guias) {
            if (guia.getEstado() == estado) {
                resultado.add(guia);
            }
        }
        return resultado;
    }

    public List<Guia> consultarGuiasPorDestinatario(String nombre) {
        List<Guia> resultado = new ArrayList<>();
        for (Guia guia : guias) {
            if (guia.getDestinatario().getNombre().equals(nombre)) {
                resultado.add(guia);
            }
        }
        return resultado;
    }
}

