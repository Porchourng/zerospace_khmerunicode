package com.porchourng.trainlstm;

public class Testing {
    public static void main(String[] args)  {

        String str = "/Users/Ket/Downloads/testpdf2.pdf";
        String word = "/Users/Ket/Downloads/Document for training DataV1.docx";
        //System.out.println(PdfToJava.readPdf(str));
//        PdfToJava.readPdf(str);
//
//        try {
//            System.out.println(PdfToJava.extractTextFromPDF(str).toString());
//        } catch (Exception e) {
//
//        }

      //  CreateDocument.readDocxFile(word);
    //    PdfBoxToFile.readPdf(str);

        String unicode = "បានត្រៀមផ្ដល់ទុនដើម្បីចាប់ផ្ដើមការធ្វើជំនួញខាងបច្ចេកវិទ្យានេះ។លោកអះអាងថាការប្រឈមខ្លាំងនោះគឺចំណេះដឹងផ្នែកកម្មវិធីខាងឌីជីថលសម្រាប់បង្កើតដែលជាកម្មវិធីក្នុងប្រព័ន្ធទូរស័ព្ទនិងកុំព្យូទ័រឬគេហ";
        System.out.println(Unicode.cleanKhmerStr(unicode));
    }
}
