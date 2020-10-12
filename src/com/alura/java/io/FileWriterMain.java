package com.alura.java.io;
import java.io.*;

public class FileWriterMain {

    public static void main(String[] args) throws IOException {

        //Fluxo de Saida com Arquivo
//        FileOutputStream fileOutputStream = new FileOutputStream("lorem2.txt");
//        Writer writer = new OutputStreamWriter(fileOutputStream);
//        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        FileWriter fileWriter = new FileWriter("lorem2.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        fileWriter.write("escrevendo uma mensagem de amor");
        fileWriter.write(System.lineSeparator());
        fileWriter.write("mensagem de amor");

        fileWriter.close();
    }
}
