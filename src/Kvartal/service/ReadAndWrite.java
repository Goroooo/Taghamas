package Kvartal.service;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ReadAndWrite {

    public static void write(String url, String apartment) throws Exception {
        Files.write(Path.of(url), apartment.getBytes(), StandardOpenOption.APPEND);
    }
    public static String[] read(String url) throws Exception {
        return Files.readAllLines(Paths.get(url)).toArray(new String[0]);
    }
}
