/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Protocolos;

import static Controller.ProtocolHandler.*;
import Model.Event;
import Model.Frame;
import Model.Packet;
import Model.Tipo;
import static View.SimView.inputPacketList;
import static View.SimView.outputFrameList;

/**
 *
 * @author Renzo
 */
public class StopWait {

    public StopWait() {
    }
    
    public void waitEvent(Event event, Frame dummyFrame) {
        if (event.equals(Event.Wait)) {
            machineBReceiver(dummyFrame , event);
        }
    }
    
    public Frame MachineASender(Packet packet, int Seq) {
        packet.setNumConf(outputFrameList.size());
        packet.setNumInfo(packet.getCadena().length());
        Frame frame = new Frame(Tipo.Dynamic, Seq, null);
        while (true) {
            frame.setPacket(packet);
            outputFrameList.add(frame);
            waitEvent(event, frame);
            return frame;
        }
    }
    
    public Packet machineBReceiver(Frame frame, Event eve) {
        while (eve.equals(Event.Frame_Arrival)) {
            event = Event.Frame_Arrival;
        }
        frame.getPacket().setNumConf(inputPacketList.size());
        frame.getPacket().setNumInfo(frame.getPacket().getCadena().length());
        inputPacketList.add(frame.getPacket());
        return frame.getPacket();
    }

}
