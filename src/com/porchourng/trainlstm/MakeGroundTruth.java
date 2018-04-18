package com.porchourng.trainlstm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class MakeGroundTruth {
    public static void writeGroundTruth(List<String> listStr, List<String> nameFileList) {

        try {
            for (int i=0; i<listStr.size(); i++) {
                PrintWriter writer = new PrintWriter(SingleTon.getInstance().directory+nameFileList.get(i)+SingleTon.getInstance().extensionFile, "UTF-8");
                writer.print(listStr.get(i));
                writer.close();
            }

        } catch (Exception e) {

        }
    }


    public static ArrayList<String> listFilesForFolder(String url) {
        ArrayList<String> nameFileList = new ArrayList<>();

        File folder = new File(url);
        for (final File fileEntry : folder.listFiles()) {
            if (fileEntry.isDirectory()) {
                listFilesForFolder(fileEntry.getAbsolutePath());
            } else {
                if (!fileEntry.isHidden()) {
                 //   System.out.println(fileEntry.getName());
                    String [] modifyName = fileEntry.getName().split(".bin.");
                    String name = modifyName[0];
                    //   System.out.println(name);
                    nameFileList.add(name);
                }

            }
        }
        return nameFileList;
    }

    public static ArrayList<String> listFilesForFolderJava8(String url) {
        ArrayList<String> list = new ArrayList<>();
        try (Stream<Path> paths = Files.walk(Paths.get(url))) {
            Object[] p = paths
                    .filter(Files::isRegularFile)
                   // .forEach(System.out::println);
                    .toArray();

            System.out.println(p[0]);


        } catch (Exception e) {

        }
        return list;
    }

    public static ArrayList<String> readFileLineByLine (String fileName) {
        ArrayList<String> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                //System.out.println(line);
                list.add(line);
            }
        } catch (Exception e) {

        }
        return list;
    }
}