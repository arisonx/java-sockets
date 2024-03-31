package com.arison;


import org.junit.Test;
import java.io.IOException;



import static org.junit.Assert.assertEquals;

public class GreetServerTest {

    @Test
    public void GreetServerTestConnection () throws IOException {
        GreetClient client =  new GreetClient();

        client.StartConnection("127.0.0.1", 5000);
        String response  = client.SendMessage("Hello server");
        assertEquals("hello client", response);

    }
}
