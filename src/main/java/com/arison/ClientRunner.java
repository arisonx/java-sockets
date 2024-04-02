package com.arison;

import java.io.IOException;
import java.util.Scanner;

public class ClientRunner {

    public static void main(String[] args) throws IOException, InterruptedException {


        while (true) {
            GreetClient greetClient = new GreetClient();
            greetClient.StartConnection("127.0.0.1", 5000);
            String clientMessage;
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter: ");
            clientMessage = scanner.nextLine();
            greetClient.SendMessage(clientMessage);
            greetClient.stopConnection();
        }

    }

}
