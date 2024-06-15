/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.taller.taller;

/**
 *
 * @author Cristian
 */
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
    private Destinatario destinatario; // Añadido
    private Remitente remitente; // Añadido

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

    public Destinatario getDestinatario() { // Añadido
        return destinatario;
    }

    public void setDestinatario(Destinatario destinatario) { // Añadido
        this.destinatario = destinatario;
    }

    public Remitente getRemitente() { // Añadido
        return remitente;
    }

    public void setRemitente(Remitente remitente) { // Añadido
        this.remitente = remitente;
    }

    // Métodos
    public float calcularCosto() {
        return paquete.calcularCosto(peso, valorDeclarado, false);
    }

    public void cambiarEstado(EstadoGuia nuevoEstado) {
        this.estado = nuevoEstado;
    }
}
