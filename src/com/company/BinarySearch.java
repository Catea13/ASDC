package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BinarySearch {


    /**
     * Plan:
     * 1) Read file
     * 2) Save data from file into list
     * 3) Sort the list
     * 4) Search a value in the list, once found print in the console the value found.
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        // Read file, Save data from file into list, Sort the list
        List<String> list = readAFile("D:\\BazaDeDate\\src\\com\\company\\BazaDeDate");
        System.out.println("1) Read from file, store into list, print values:");
        System.out.println(list);
        System.out.println("================================");

        // ===============> В
        // Search a value in the list, once found print in the console the value found.
        int start = 0;
        int end = list.size() - 1;
        int searchedValue = 4;

        for (int i = 0; i <= list.size(); i++) {
            int mid = (start + end) / 2;

            if (searchedValue == mid) {
                System.out.println(mid);
            }

            if (searchedValue < mid) {
                end = mid - 1;
                System.out.println(end);
            } else {
                start = mid + 1;
                System.out.println(start);
            }
        }
    }

    public static List<String> readAFile(String databaseFilePath) throws FileNotFoundException {
        // Save data from file into list
        List<String> list = new ArrayList<String>();
        try (BufferedReader br = Files.newBufferedReader(Paths.get(databaseFilePath))) {
            list = br.lines().collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Sort the list
        Arrays.sort(list.toArray());

        return list;
    }
}