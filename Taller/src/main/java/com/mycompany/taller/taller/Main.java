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
        remitente.setTelefono("123-456-7890");

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
        guia.setDhl("123456789"); // Si es internacional
        guia.setPaquete(servicioSobre);
        guia.setDestinatario(destinatario);
        guia.setRemitente(remitente);

        // Registrar guía en el sistema de envíos
        sistemaDeEnvios.registrarGuia(guia);

        // Imprimir la guía
        guia.imprimirInformacion();

        // Registrar entrega de la guía
        sistemaDeEnvios.registrarEntrega(1);

        // Consultar guías por estado FINALIZADA
        //System.out.println("Guias en estado FINALIZADA:");
        //for (Guia g : sistemaDeEnvios.consultarGuiasPorEstado(EstadoGuia.FINALIZADA)) {
        //    g.imprimirInformacion();
        //}

        // Consultar guías por destinatario
        //System.out.println("Guias para el destinatario Jane Smith:");
        //for (Guia g : sistemaDeEnvios.consultarGuiasPorDestinatario("Jane Smith")) {
        //    g.imprimirInformacion();
        //}
    }
}
