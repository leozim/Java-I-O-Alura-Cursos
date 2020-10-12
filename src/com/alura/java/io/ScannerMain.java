package com.alura.java.io;
import java.io.*;
import java.util.*;

public class ScannerMain {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        Boolean tem = scanner.hasNextLine();

        String linha = scanner.nextLine();
        System.out.println(linha);

        String[] valores = linha.split(",");


        scanner.close();
    }
}
