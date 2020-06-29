package com.sda.io;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class OperationsApp {
    public static void main(String[] args) {

           Path absolutPath = Paths.get("C:\\Users\\Artur\\Dysk Google (aurbanski.jd@gmail.com)\\Programowanie\\IdeaProjects\\java_zaawansoana\\input.txt");
           Path relativePath = Paths.get("input.txt");

        System.out.println(Files.exists(absolutPath));
        System.out.println(Files.exists(relativePath));

//        Files.createDirectories((Paths.get("nowy_folder")));

    }
}
