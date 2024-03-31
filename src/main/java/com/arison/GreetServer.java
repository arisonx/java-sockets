package com.arison;

import java.io.*;
import java.net.*;

public class GreetServer {
    private ServerSocket serverSocket;
    private Socket clientSocket; // Socket Client
    private PrintWriter out; //Socket Writer
    private BufferedReader in; //Socket Input

    public void start(int port) throws IOException {
        serverSocket = new ServerSocket(port); // Server initialization
        if (serverSocket.isBound()) {
            System.out.println("Server accept connections");
            System.out.println("send messages with client");
        }
        clientSocket = serverSocket.accept(); // Accept connections
        out = new PrintWriter(clientSocket.getOutputStream(), true); // socket output
        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream())); // socket input
        String greeting = in.readLine(); // message read
        if ("Hello server".equals(greeting)) {
            out.println("hello client");
        } else if ("stop server".equals(greeting)) {
            out.println("Stopping server....");
            stop();
        } else {
            out.println("unrecognised greeting");
        }
    }

    public void stop() throws IOException {
        // server, input, output and client server stop
        in.close();
        out.close();
        clientSocket.close();
        serverSocket.close();
        if (serverSocket.isClosed()) {
            System.out.println("Server closed!");
        }
    }

}
