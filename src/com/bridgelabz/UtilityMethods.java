package com.bridgelabz;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class UtilityMethods {
    public static void main(String[] args) {
        writeToFile();
        readFromFile();
        checkForSameFile();
    }

    /***
     * Write content to the file using writeString() method
     */
    public static void writeToFile() {
        String writeContent = "This method is used to write the contents to a file.\nCharacters are encoded into bytes using the " +
                "specified charset,\nand the default value is a UTF-8 charset.";
        try {
            Files.writeString(Path.of(System.getProperty("user.dir") + "/files/writeContent.txt"), writeContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /***
     * Read content from file using readString method
     */
    public static void readFromFile() {
        String readContent = null;
        try {
            readContent = Files.readString(Path.of(System.getProperty("user.dir") + "/files/readContent.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(readContent);
    }

    /***
     * check the two file are same or not
     */
    public static void checkForSameFile() {
        boolean result = false;
        try {
            result = Files.isSameFile(Path.of(System.getProperty("user.dir") + "/files/writeContent.txt"), Path.of(System.getProperty("user.dir") + "/files/writeContent.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(result);
    }
}