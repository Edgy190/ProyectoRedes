package Model;

import java.io.IOException;
import java.net.Socket;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Renzo
 */
public class Machine {
    private Socket socket;
    //private BufferedReader reader;
    //private BufferedWriter writer;
    private String machineName;

    public Machine(Socket socket, String machineName) {
        try {
            this.socket = socket;
            //this.reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            //this.writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            this.machineName = machineName;
        } catch (/*IO*/Exception e) {
            closeAll(socket/*, reader, writer*/);
        }
    }

    public Socket getSocket() {
        return socket;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }

    public String getMachineName() {
        return machineName;
    }

    public void setMachineName(String machineName) {
        this.machineName = machineName;
    }

    @Override
    public String toString() {
        return "Machine{" + "socket=" + socket + ", machineName=" + machineName + '}';
    }
    
    /*public void sendMsg() {
        try {
            writer.write(machineName);
            writer.newLine();
            writer.flush();
            
            Scanner scanner = new Scanner(System.in);
            while (socket.isConnected()) {
                String msg = scanner.nextLine();
                writer.write(machineName + ": " + msg);
                writer.newLine();
                writer.flush();
            }
        } catch (IOException e) {
            closeAll(socket, reader, writer);
        }
    }
    
    public void lookForMsg() {
        new Thread(new Runnable(){
            @Override
            public void run() {
                String msgGeneral;
                while (socket.isConnected()) {
                    try {
                        msgGeneral = reader.readLine();
                        System.out.println(msgGeneral);
                    } catch (IOException e) {
                        closeAll(socket, reader, writer);
                    }
                }
            }
            
        }).start();
    }*/

    public void closeAll(Socket socket/*, BufferedReader reader, BufferedWriter writer*/) {
        try {
            if (socket != null) {
                socket.close();
            }
            /*if (reader != null) {
                reader.close();
            }
            if (writer != null) {
                writer.close();
            }*/
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String args[]) throws IOException {
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Machine names: ");
        //String machineName = scanner.nextLine();
        //Socket socketA = new Socket("localhost", 1234);
        //Socket socketB = new Socket("localhost", 1234);
        //Machine machineA = new Machine(socketA, "A"/*machineName*/);
        //Machine machineB = new Machine(socketB, "B"/*machineName*/);
        //machine.lookForMsg();
        //machine.sendMsg();
    }
}
