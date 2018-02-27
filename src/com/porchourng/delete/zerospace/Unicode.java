package com.porchourng.delete.zerospace;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

public class Unicode {
    // or "ISO-8859-1" for ISO Latin 1
    static CharsetEncoder asciiEncoder = Charset.forName("US-ASCII").newEncoder();

    public static boolean isPureAscii(char v) {
        return asciiEncoder.canEncode(v);
    }

    public static void main(String[] args) {
        // increment character
        //char ch = 'a';
        //System.out.println(++ch);

        // Khmer Unicode zero space
        char zerospace = '​';
        System.out.println((int)zerospace); // convert char to Unicode

        char unicodeToChar = '\u0041';
        System.out.println(unicodeToChar);



        String str = "រាប់ចាប់​ពី​ការងារ​កាត់ស្មៅ ​និង ​ជូតកញ្ចក់​ ដល់​ការងារ​នាំ​ឥវ៉ាន់​ចែក​ចាយ​នៅ​ឯ​មន្ទីរពេទ្យ​និងសណ្ឋាគារ ​ឬ​ក៏មើល​ថែ​កូន​ក្មេង ​ហើយនឹង​មនុស្ស​ចាស់ ​មនុស្ស យន្ត​គ្រប់​ទំហំ​និង​បែប​សណ្ឋាន​អាចធ្វើ​កិច្ចការ​ដែល​មនុស្ស​ធ្វើ​ជា​ច្រើន​ឆ្នាំ​ទាំង នោះ​បាន។​ ម៉ាស៊ីន​ទាំង​នេះ​អាចធ្វើ​កិច្ចការ​ដែល​មនុស្ស​មិន​អាច​ធ្វើ​បាន​ផង​ក៏​មាន។\n" +
                "\n" +
                "លោក ​ស៊ីម៉ូន វ៉ាង ​(Simon Wang) ​នៃ​ក្រុមហ៊ុន ​Beijing Canny ​Unisboro Technology ​Co. Ltd បាន​ថ្លែងថា៖\n" +
                "\n" +
                "«មនុស្សយន្ត​អាច​ធ្វើ​ការ​ពេញ​មួយ​ថ្ងៃ​ ២៤ម៉ោង​ក្នុង​មួយ​ថ្ងៃ​ ហើយ​គ្មាន​អារម្មណ៍ ធុញទ្រាន់​ទេ។​ ជានិច្ច​ជា​កាល ​វា​ស្វាគមន៍​ដោយ​ភាព​ញញឹម‍»។";
        StringBuilder sb = new StringBuilder(str);

        for(int i=0; i<sb.length(); i++) {
            if (sb.charAt(i) == zerospace) {
                //System.out.println("True");
                sb.deleteCharAt(i);
            }
            if (Unicode.isPureAscii(sb.charAt(i))) {
                //System.out.println("ASCII");
                sb.deleteCharAt(i);
            }
        }

        System.out.print(sb.toString());



    }

}
