package main;



import main.calculations.Calculation;
import main.calculations.GParser;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException  {

        GParser gParser = new GParser();
        Calculation calculation = new Calculation();

        System.out.println( calculation.avgTime(gParser.parse()));

        System.out.println(calculation.percentile(gParser.parse()));


    }
}
