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
    private int tipo;
    private int numSecuencia;
    private int numConf;
    private int numInfo;

    public Frame(int tipo, int numSecuencia, int numConf, int numInfo) {
        this.tipo = tipo;
        this.numSecuencia = numSecuencia;
        this.numConf = numConf;
        this.numInfo = numInfo;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getNumSecuencia() {
        return numSecuencia;
    }

    public void setNumSecuencia(int numSecuencia) {
        this.numSecuencia = numSecuencia;
    }

    public int getNumConf() {
        return numConf;
    }

    public void setNumConf(int numConf) {
        this.numConf = numConf;
    }

    public int getNumInfo() {
        return numInfo;
    }

    public void setNumInfo(int numInfo) {
        this.numInfo = numInfo;
    }

    @Override
    public String toString() {
        return "Frame{" + "tipo=" + tipo + ", numSecuencia=" + numSecuencia + ", numConf=" + numConf + ", numInfo=" + numInfo + '}';
    }
}
