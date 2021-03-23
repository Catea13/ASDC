package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Sort {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = null;
        PrintWriter outputStream = null;
        ArrayList<String> rows = new ArrayList<String>();

        try {
            reader = new BufferedReader(new FileReader("src\\com\\company\\BazaDeDate"));
            outputStream = new PrintWriter(new FileWriter("Sort.txt"));

            String file;
            while ((file = reader.readLine()) != null) {
                rows.add(file);
            }
            Collections.sort(rows);
            String[] strArr = rows.toArray(new String[0]);
            for (String cur : strArr)
                outputStream.println(cur);
        } finally {

        }
        if (outputStream != null) {
            outputStream.close();
        }

    }
}



