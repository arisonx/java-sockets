package com.arison;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ThreadServer extends Thread {


    public int port;

    @Override
    public void run() {

        try {
            ServerSocket serverSocket = new ServerSocket(port); // Server initialization

            if (serverSocket.isBound()) {
                System.out.println("waiting messages...");
            }

            while (true) {
                // Socket Client
                Socket clientSocket = serverSocket.accept(); // Accept connections
//                System.out.println("Alguém conectou?" + clientSocket.isConnected());
//                System.out.println("cliente desconectado?  " + clientSocket.isClosed());
                //Socket Writer
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true); // socket output
                //Socket Input
                BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream())); // socket input
                String greeting = in.readLine(); // message read
                System.out.println("Message Received: "+greeting);
                out.println("você é foda negão");
            }

        } catch (IOException err) {
            System.out.println(STR."Socket Server Binding Error error\{err}");

        }
    }

}
