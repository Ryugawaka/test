package main.calculations;

import com.google.gson.Gson;
import main.tickets.Tickets;

import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class GParser {


    public Tickets parse()throws IOException {
        Gson gson = new Gson();
        Reader reader = new FileReader("src/main/resources/tickets.json");
        Tickets tickets = gson.fromJson(reader,Tickets.class);
        return tickets;
    }

}

