package com.arison;

import java.io.*;
import java.net.*;
import java.util.Scanner;
import java.util.logging.SocketHandler;

public class GreetClient {
    private Socket clientSocket; // Socket Client
    private PrintWriter out; //Socket Writer
    private BufferedReader in; //Socket Input


    public void StartConnection() throws IOException {


        ThreadClient threadClient = new ThreadClient();
        threadClient.start();
//        out = new PrintWriter(clientSocket.getOutputStream(), true);
//        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
//
//
//        while (true) {
//
//            String clientMessage;
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("enter: ");
//            clientMessage = scanner.nextLine();
//            SendMessage(clientMessage);
//            System.out.println(clientSocket.getChannel());
//
//        }
    }

    public String SendMessage(String msg, PrintWriter out, BufferedReader in) throws IOException {
        out.println(msg);
        String resp;
        resp = in.readLine();
        System.out.println("Server Response:   "+resp);
        return resp;
    }

    public void stopConnection() throws IOException {
        in.close();
        out.close();
        clientSocket.close();
    }

}
