package com.porchourng.trainlstm;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import java.io.FileInputStream;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;


public class CreateDocument {

    public static List<String> readDocxFile(String url) {
        ArrayList<String> list = new ArrayList<>();
        try {
            File file = new File(url);
            FileInputStream fis = new FileInputStream(file.getAbsolutePath());
            XWPFDocument document = new XWPFDocument(fis);

            List<XWPFParagraph> paragraphs = document.getParagraphs();
            System.out.println(paragraphs.size());
            for (XWPFParagraph para : paragraphs) {
           //     System.out.println(para.getText());
                list.add(para.getText());
            }
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void readDocxFile2(String fileName) {

        try {
            File file = new File(fileName);
            FileInputStream fis = new FileInputStream(file.getAbsolutePath());

            XWPFDocument document = new XWPFDocument(fis);

            List<XWPFParagraph> paragraphs = document.getParagraphs();

            System.out.println("Total no of paragraph "+paragraphs.size());
            for (XWPFParagraph para : paragraphs) {
                System.out.println(para.getText());
            }
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void readDocFile(String fileName) {

        try {
            File file = new File(fileName);

            FileInputStream fis = new FileInputStream(file);

            XWPFDocument xdoc = new XWPFDocument(fis);

            List<XWPFParagraph>  paragraphList = xdoc.getParagraphs();

            for (XWPFParagraph paragraph : paragraphList) {

                System.out.println("text: "+paragraph.getText());

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }


}
