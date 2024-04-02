package com.arison;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Starting server...");
        GreetServer server;

        server = new GreetServer();
        server.start(5000);
    }


}