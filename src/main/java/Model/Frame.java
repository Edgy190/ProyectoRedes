/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Renzo
 */
public class Frame {
    private Tipo tipo;
    private int numSecuencia;
    private Packet packet;

    public Frame(Tipo tipo, int numSecuencia, Packet packet) {
        this.tipo = tipo;
        this.numSecuencia = numSecuencia;
        this.packet = packet;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public int getNumSecuencia() {
        return numSecuencia;
    }

    public void setNumSecuencia(int numSecuencia) {
        this.numSecuencia = numSecuencia;
    }

    public Packet getPacket() {
        return packet;
    }

    public void setPacket(Packet packet) {
        this.packet = packet;
    }

    @Override
    public String toString() {
        return "Frame{" + "tipo=" + tipo + ", numSecuencia=" + numSecuencia + ", packet=" + packet + '}';
    }

}