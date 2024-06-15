/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.taller.taller;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        SistemaDeEnvios sistemaDeEnvios = new SistemaDeEnvios();

        // Crear remitente
        Remitente remitente = new Remitente();
        remitente.setNombre("Cristian Contreras");
        remitente.setDepartamento("Cesar");
        remitente.setTelefono("999999");

        // Crear destinatario
        Destinatario destinatario = new Destinatario();
        destinatario.setCompania("Tech Corp");
        destinatario.setNombre("Jane Smith");
        destinatario.setDireccion("Calle 25 #10-40");
        destinatario.setTelefono("310-0000000");

        // Crear servicio
        Servicio servicioSobre = new ServicioSobre();

        // Crear guía
        Guia guia = new Guia();
        guia.setNumero(1);
        guia.setFecha(new Date());
        guia.setPeso(1.0f);
        guia.setCantidad(1);
        guia.setEstado(EstadoGuia.DESPACHO);
        guia.setValorDeclarado(100.0f);
        guia.setDhl("123456789");
        guia.setPaquete(servicioSobre);
        guia.setDestinatario(destinatario); // Añadido
        guia.setRemitente(remitente); // Añadido

        // Registrar guía en el sistema de envíos
        sistemaDeEnvios.registrarGuia(guia);

        // Consultar guías por estado
        System.out.println("Guias en estado DESPACHO:");
        for (Guia g : sistemaDeEnvios.consultarGuiasPorEstado(EstadoGuia.DESPACHO)) {
            System.out.println("Guia número: " + g.getNumero());
        }

        // Registrar entrega de la guía
        sistemaDeEnvios.registrarEntrega(1);

        // Consultar guías por estado FINALIZADA
        System.out.println("Guias en estado FINALIZADA:");
        for (Guia g : sistemaDeEnvios.consultarGuiasPorEstado(EstadoGuia.FINALIZADA)) {
            System.out.println("Guia número: " + g.getNumero());
        }
    }
}
