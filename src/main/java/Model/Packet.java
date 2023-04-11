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
    private char[] cadenaChar;
    private int numConf;
    private int numInfo;

    public Packet(char[] cadenaChar, int numConf, int numInfo) {
        this.cadenaChar = cadenaChar;
        this.numConf = numConf;
        this.numInfo = numInfo;
    }

    public char[] getCadenaChar() {
        return cadenaChar;
    }

    public void setCadenaChar(char[] cadenaChar) {
        this.cadenaChar = cadenaChar;
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
        return "Packet{" + "cadenaChar=" + cadenaChar + ", numConf=" + numConf + ", numInfo=" + numInfo + '}';
    }
}
