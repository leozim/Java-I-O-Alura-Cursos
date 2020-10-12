package com.alura.java.io;
import java.io.*;

public class PrintStreamWriterMain {

    public static void main(String[] args) throws IOException {

        PrintStream printStream = new PrintStream("lorem2.txt");
        printStream.println("escrevendo uma mensagem de amor");
        printStream.println();
        printStream.println("mensagem de amor");

        printStream.close();
    }
}
