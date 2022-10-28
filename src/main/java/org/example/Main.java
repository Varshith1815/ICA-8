package org.example;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Urinals obj= new Urinals();
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a Input File Name:");
        String inputFileName=s.nextLine();
        obj.writeOutput(inputFileName);

    }
}