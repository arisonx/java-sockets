package com.arison;

import java.io.IOException;
import java.util.Scanner;

public class ClientRunner {

    public static void main(String[] args) throws IOException, InterruptedException {
        GreetClient greetClient = new GreetClient();
        greetClient.StartConnection();

    }

}
