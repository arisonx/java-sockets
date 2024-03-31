package com.arison;

import java.io.*;
import java.net.*;

public class GreetClient {
    private Socket clientSocket; // Socket Client
    private PrintWriter out; //Socket Writer
    private BufferedReader in; //Socket Input


    public void StartConnection(String ip, int port) throws IOException {
        Socket clientSocket = new Socket(ip, port);
        ThreadClient threadClient = new ThreadClient(clientSocket);
        threadClient.start();
        out = new PrintWriter(clientSocket.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

    }

    public String SendMessage(String msg) throws IOException {

        out.println(msg);
        String resp;
        resp = in.readLine();
        System.out.println(resp);
        return resp;
    }

    public void stopConnection() throws IOException {
        in.close();
        out.close();
        clientSocket.close();
    }

}
