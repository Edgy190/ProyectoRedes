/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Renzo
 */
public class Protocolo {
    private Frame[] frames;

    public Protocolo(Frame[] frames) {
        this.frames = frames;
    }

    public Frame[] getFrames() {
        return frames;
    }

    public void setFrames(Frame[] frames) {
        this.frames = frames;
    }

    @Override
    public String toString() {
        return "Protocolo{" + "frames=" + frames + '}';
    }
    
}
