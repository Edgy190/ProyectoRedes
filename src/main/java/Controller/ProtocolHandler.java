/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Event;
import Model.Protocolos.GoBackn;
import Model.Protocolos.PAR;
import Model.Protocolos.SelectiveRepeat;
import Model.Protocolos.SlideWindow1;
import Model.Protocolos.StopWait;
import Model.Protocolos.Utopia;

/**
 *
 * @author Renzo
 */
public class ProtocolHandler {
    public static Event event;
    public static Utopia utopia = new Utopia();
    public static StopWait StopWait = new StopWait();
    public static PAR PAR = new PAR();
    public static SlideWindow1 slideWindow1 = new SlideWindow1();
    public static GoBackn goBackn = new GoBackn();
    public static SelectiveRepeat selectiveRepeat = new SelectiveRepeat();
}
