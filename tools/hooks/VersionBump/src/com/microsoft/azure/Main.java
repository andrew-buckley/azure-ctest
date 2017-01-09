package com.microsoft.azure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void main(String[] args) throws IOException {
        String input;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(ANSI_RED + "Checking versions..." + ANSI_RESET);

        System.out.print(ANSI_CYAN + "[M]ajor, [m]inor, [p]atch, or [n]one: " + ANSI_RESET);
        input = reader.readLine();
        System.out.println("Read: " + input);
    }

    public boolean updateVersionFile(String type)
    {

    }
}
