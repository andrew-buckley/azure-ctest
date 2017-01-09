package com.microsoft.azure;

import org.json.JSONObject;

import java.io.*;
import java.net.URL;
import java.util.Scanner;

/**
 * Created by Andrew on 1/7/2017.
 */
public class SemVer {

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

        SemVer sv = new SemVer();
        Class c = sv.getClass();
        URL s1 = ClassLoader.getSystemClassLoader().getResource("com/microsoft/azure/SemVer.class");
        URL s2 = ClassLoader.getSystemResource("com/microsoft/azure/SemVer.class");
        System.out.println("Class Location: " + c.getClassLoader().getResource("classname"));

        String fileLocation = getVersionFileLocation();
        System.out.println("File Location: " + fileLocation);

        String input;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(ANSI_RED + "Checking versions..." + ANSI_RESET);

        System.out.print(ANSI_CYAN + "[M]ajor, [m]inor, [p]atch, or [n]one: " + ANSI_RESET);
        input = reader.readLine();
        System.exit(updateVersionFile(input));
    }

    public static int updateVersionFile(String type)
    {
        return 1;
    }

    public static String getVersionFileLocation() throws IOException {
        File file = new File("..\\..\\SemVerConfig.json");
        FileInputStream fis = new FileInputStream(file);
        byte[] data = new byte[(int)file.length()];
        fis.read(data);
        fis.close();
        String str = new String(data, "UTF-8");

        JSONObject obj = new JSONObject(str);

        return obj.getString("versionFile");
    }

}

