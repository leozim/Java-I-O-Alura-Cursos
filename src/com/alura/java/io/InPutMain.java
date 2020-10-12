package com.alura.java.io;
import java.io.*;

public class InPutMain {

    public static void main(String[] args) throws IOException {

        //Fluxo de Entrada com Arquivo

        InputStream fileInputStream = new FileInputStream("lorem.txt");
        //classe que transforma os caracteres de byte to text
        Reader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String s = bufferedReader.readLine();
        while (s != null){
            System.out.println(s);
            s = bufferedReader.readLine();
        }
        bufferedReader.close();
    }
}
