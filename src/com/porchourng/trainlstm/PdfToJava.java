package com.porchourng.trainlstm;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;

public class PdfToJava {

    public static void readPdf(String str) {
        try{
            PDDocument document;
            document = PDDocument.load(new File(str));
            document.getClass();
            if( !document.isEncrypted() ){
                PDFTextStripperByArea stripper = new PDFTextStripperByArea();
                stripper.setSortByPosition( true );
                PDFTextStripper Tstripper = new PDFTextStripper();
                String st = Tstripper.getText(document);
                System.out.println("Text:"+st);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static StringBuffer extractTextFromPDF(String file_name) throws IOException
    {
        StringWriter sw = new StringWriter();
        PDDocument doc  = null;

        try
        {
            doc = PDDocument.load(new File(file_name));

            PDFTextStripper stripper = new PDFTextStripper();
            stripper.setStartPage(1);
            stripper.setEndPage(Integer.MAX_VALUE);
            stripper.writeText(doc, sw);
        }
        finally
        {
            if (doc != null) doc.close();
        }

        StringBuffer sbuf = new StringBuffer();
        sbuf.append(sw.toString());

        int i = sbuf.length() - 1;
        while (i > 0)
        {
            if (sbuf.charAt(i) == '\r' || sbuf.charAt(i) == '\n')
            {
                if (sbuf.charAt(i-1) == '-')
                {
                    sbuf.deleteCharAt(i--);   // --- delete '\n' or '\r'
                    sbuf.deleteCharAt(i);     // --- delete '-'
                }
            }
            i--;
        }

        return sbuf;
    }
}
