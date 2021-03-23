package com.company;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {


/***Afiseaza toate datele din fisier BazaDeDate**/

            String str;

            FileReader fin = new FileReader("src\\com\\company\\BazaDeDate");

            Scanner src = new Scanner(fin);
            while (src.hasNextLine()) {
                str = src.nextLine();
                StringTokenizer s = new StringTokenizer(str, "");
                while (s.hasMoreTokens()) {
                    System.out.println(s.nextToken());
                }
                fin.close();

            }
        }
    }


