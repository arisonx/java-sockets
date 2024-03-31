package com.arison;

import java.io.*;
import java.net.*;

public class GreetServer {
    private ServerSocket serverSocket;
    private Socket clientSocket; // Socket Client
    private PrintWriter out; //Socket Writer
    private BufferedReader in; //Socket Input

    ThreadServer threadServer;

    public void start(int port) {

        threadServer = new ThreadServer();
        threadServer.port = port;
        threadServer.start();

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
