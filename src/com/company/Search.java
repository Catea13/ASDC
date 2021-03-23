package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Search {


    public static void main(String[] args) throws IOException {



        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        BufferedReader buff = new BufferedReader(new FileReader(fileName));

        while (buff.ready()) {
            String s = buff.readLine();

            if (s.startsWith(args[0] + " ")) {
                System.out.println(s.substring(args[0].length() + 1));
            }
        }

        reader.close();
        buff.close();
    }
}
