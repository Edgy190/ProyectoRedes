/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Renzo
 */
public class Packet {
    private String cadena;
    private int numConf;
    private int numInfo;

    public Packet(String cadena, int numConf, int numInfo) {
        this.cadena = cadena;
        this.numConf = numConf;
        this.numInfo = numInfo;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
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
        return "Packet{" + "cadena=" + cadena + ", numConf=" + numConf + ", numInfo=" + numInfo + '}';
    }

}
