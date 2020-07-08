package com.sda.io;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Paths;

public class FileOperationsApp {


    public static void main(String[] args) throws IOException {





        // ReadFileTryCatchFinnaly

        FileInputStream fileInputStream = null;

        try {
            fileInputStream = new FileInputStream("io/test1");
            int read = fileInputStream.read();

            while (read != -1) {
                char character = (char) read;
                System.out.print(character);

                read = fileInputStream.read();
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } finally {
            if (fileInputStream != null) {
                fileInputStream.close();
            }
        }
        System.out.println();


        //try with resources
        System.out.println("try with resources");
        try (FileInputStream fileInputStream1 = new FileInputStream("io/test1")) {
            int read = fileInputStream1.read();

            while (read != -1) {
                char character = (char) read;
                System.out.print(character);

                read = fileInputStream1.read();
            }
        }

        System.out.println();
        System.out.println();

        try (FileInputStream fileInputStream1 = new FileInputStream("io/test1")){
            byte[] bytes = fileInputStream1.readAllBytes();

            String text = new String(bytes, StandardCharsets.UTF_8);
            System.out.println(text);
        }


    }

    private static void ReadFileTryCatchFinnaly() throws IOException {
        FileInputStream fileInputStream = null;

        try {
            fileInputStream = new FileInputStream("io/test1");
            int read = fileInputStream.read();

            while (read != -1) {
                char character = (char) read;
                System.out.print(character);

                read = fileInputStream.read();
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } finally {
            if (fileInputStream != null) {
                fileInputStream.close();
            }
        }
    }
}
