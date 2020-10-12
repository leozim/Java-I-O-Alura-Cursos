package com.alura.java.io;
import java.io.*;

public class TesteCopiarArquivo {

    public static void main(String[] args) throws IOException {

        //Fluxo de Entrada com Arquivo
//        FileInputStream fileInputStream = new FileInputStream("lorem.txt");
        InputStream fileInputStream = System.in;
        //classe que transforma os caracteres de byte to text
        Reader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        OutputStream fileOutputStream = new FileOutputStream("lorem2.txt");
        //OutputStream fileOutputStream = System.out;
        Writer outputStream = new OutputStreamWriter(fileOutputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStream);

        String s = bufferedReader.readLine();
        while (s != null && !s.isBlank()){
            //System.out.println(s);
            bufferedWriter.write(s);
            bufferedWriter.newLine();
            s = bufferedReader.readLine();
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}
