package com.alura.java.io;
import java.io.*;

public class OutPutMain {

    public static void main(String[] args) throws IOException {

        //Fluxo de Saida com Arquivo
        FileOutputStream fileOutputStream = new FileOutputStream("lorem2.txt");
        Writer writer = new OutputStreamWriter(fileOutputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        bufferedWriter.write("eh isso aee pessoal.");
        bufferedWriter.newLine();
        bufferedWriter.newLine();
        bufferedWriter.write("rere");

        bufferedWriter.close();
    }
}
