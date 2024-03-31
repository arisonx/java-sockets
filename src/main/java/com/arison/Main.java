package com.arison;
public class Main {
    public static void main(String[] args) {
        System.out.println("Starting server...");
        GreetServer server;
        server = new GreetServer();
        server.start(5000);
    }


}