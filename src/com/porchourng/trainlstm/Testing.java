package com.porchourng.trainlstm;

import java.util.List;

public class Testing {
    public static void main(String[] args)  {

        String str = "/Users/Ket/Downloads/testpdf2.pdf";

        //System.out.println(PdfToJava.readPdf(str));
//        PdfToJava.readPdf(str);
//
//        try {
//            System.out.println(PdfToJava.extractTextFromPDF(str).toString());
//        } catch (Exception e) {
//
//        }


    //    PdfBoxToFile.readPdf(str);

        String unicode = "";
      //  System.out.println(Unicode.cleanKhmerStr(unicode));

//        String formatted = String.format("%08d", 10);
//
//        System.out.println("Number with leading zeros: " + formatted);
      //  System.out.println(MakeGroundTruth.getRandomHexString(6));

        String word = "/Users/Ket/Downloads/page41.txt";
        SingleTon.getInstance().directory = "/Users/Ket/Downloads/ocropy-master/scan/Battambang/nrm-seg/0041/";
        List<String> strList = MakeGroundTruth.readFileLineByLine(word);
        List<String> nameFile = MakeGroundTruth.listFilesForFolder(SingleTon.getInstance().directory);
       // List<String> strList = CreateDocument.readDocxFile(word);
        MakeGroundTruth.writeGroundTruth(strList, nameFile);

    }
}
