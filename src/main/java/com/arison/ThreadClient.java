package com.arison;

import java.io.*;
import java.net.Socket;


public class ThreadClient extends Thread {


    private PrintWriter out; //Socket Writer
    private BufferedReader in; //Socket Input

    public Socket clientSocket;

    public ThreadClient(Socket socket) {
       this.clientSocket  =  socket;
    }

    @Override
    public void run() {

        try {
            clientSocket.connect(clientSocket.getLocalSocketAddress());
        } catch (IOException e) {

        }


    }


}
