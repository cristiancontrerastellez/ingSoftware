/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller.taller;

/**
 *
 * @author Cristian
 */
import java.text.SimpleDateFormat;
import java.util.Date;

public class Guia {
    private int numero;
    private Date fecha;
    private float peso;
    private int cantidad;
    private EstadoGuia estado;
    private float valorDeclarado;
    private String dhl;
    private Servicio paquete;
    private Destinatario destinatario;
    private Remitente remitente;

    // Getters y Setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public EstadoGuia getEstado() {
        return estado;
    }

    public void setEstado(EstadoGuia estado) {
        this.estado = estado;
    }

    public float getValorDeclarado() {
        return valorDeclarado;
    }

    public void setValorDeclarado(float valorDeclarado) {
        this.valorDeclarado = valorDeclarado;
    }

    public String getDhl() {
        return dhl;
    }

    public void setDhl(String dhl) {
        this.dhl = dhl;
    }

    public Servicio getPaquete() {
        return paquete;
    }

    public void setPaquete(Servicio paquete) {
        this.paquete = paquete;
    }

    public Destinatario getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(Destinatario destinatario) {
        this.destinatario = destinatario;
    }

    public Remitente getRemitente() {
        return remitente;
    }

    public void setRemitente(Remitente remitente) {
        this.remitente = remitente;
    }

    // Métodos
    public float calcularCosto() {
        return paquete.calcularCosto(peso, valorDeclarado, dhl != null && !dhl.isEmpty());
    }

    public void cambiarEstado(EstadoGuia nuevoEstado) {
        this.estado = nuevoEstado;
    }

    public void imprimirInformacion() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("FORMATO PARA ENVIOS POR MENSAJERIA");
        System.out.println("No ENVIO: " + numero + "      FECHA: " + sdf.format(fecha));
        System.out.println("DATOS DEL DESTINATARIO");
        System.out.println("COMPANIA: " + destinatario.getCompania());
        System.out.println("CONTACTO (NOMBRE COMPLETO): " + destinatario.getNombre());
        System.out.println("DIRECCION: " + destinatario.getDireccion());
        System.out.println("TELEFONOS: " + destinatario.getTelefono());
        System.out.println("DATOS DEL REMITENTE");
        System.out.println("NOMBRE: " + remitente.getNombre());
        System.out.println("DEPARTAMENTO: " + remitente.getDepartamento());
        System.out.println("TELEFONO O EXTENSION: " + remitente.getTelefono());
        System.out.println("DATOS DEL PAQUETE");
        System.out.println("SOBRE: " + (paquete instanceof ServicioSobre ? "X" : ""));
        System.out.println("CAJA: " + (paquete instanceof ServicioCaja ? "X" : ""));
        System.out.println("PAQUETE: " + (paquete instanceof ServicioPaquete ? "X" : ""));
        System.out.println("CANTIDAD: " + cantidad);
        System.out.println("PESO APROX.: " + peso);
        System.out.println("MENSAJERIA: " + (dhl != null && !dhl.isEmpty() ? "DHL: X" : ""));
        System.out.println("DESCRIPCION BREVE DE LA MERCANCIA: ");
        System.out.println("Estado: " + estado);
        System.out.println("Valor Declarado: " + valorDeclarado);
        System.out.println("Costo Total: " + calcularCosto());
        System.out.println("-----------------------------------------");
    }
}