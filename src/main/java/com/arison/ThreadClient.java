package com.arison;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;


public class ThreadClient extends Thread {


    private PrintWriter out; //Socket Writer
    private BufferedReader in; //Socket Input

    public Socket clientSocket;

    @Override
    public void run() {
        GreetClient greetClient = new GreetClient();
        String ip = "127.0.0.1";
        int port = 5000;


        while (true) {
            try {
                clientSocket = new Socket(ip, port);
//                System.out.println("Cliente conectado?" + clientSocket.isConnected());
                out = new PrintWriter(clientSocket.getOutputStream(), true);
                in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                String clientMessage;
                Scanner scanner = new Scanner(System.in);
                System.out.println("enter: ");
                clientMessage = scanner.nextLine();
                greetClient.SendMessage(clientMessage, out, in);
                scanner.reset();
                out.close();
                in.close();

//                System.out.println("conectado após a mensagem?" + clientSocket.isConnected());
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }


    }


}
