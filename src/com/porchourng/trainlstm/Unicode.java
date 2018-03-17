package com.porchourng.trainlstm;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

public class Unicode {

    public static boolean isPureAscii(char v) {
        // or "ISO-8859-1" for ISO Latin 1
        CharsetEncoder asciiEncoder = Charset.forName("US-ASCII").newEncoder();
        return asciiEncoder.canEncode(v);
    }

    /*
        This function use for clean zero space in Khmer Unicode and ASCII code
        from Khmer sentence Unicode.
     */
    public static String cleanKhmerStr(String str) {
        char zerospace = '\u8203';
        char zerowidth = '\u200B';
        char zerowidthJoiner = '\u200D';
        StringBuilder sb = new StringBuilder(str);
        StringBuilder sbNew = new StringBuilder();
        for(int i=0; i<sb.length(); i++) {
            if (sb.charAt(i) != zerospace && sb.charAt(i) != zerowidth && sb.charAt(i) != zerowidthJoiner && !Unicode.isPureAscii(sb.charAt(i))) {
                sbNew.append(sb.charAt(i));
            }
        }
        return sbNew.toString();
    }

    public static void validateStr(String str) {
        char zerospace = '\u8203';
        StringBuilder sb = new StringBuilder(str);
        StringBuilder sbNew = new StringBuilder();
        for(int i=0; i<sb.length(); i++) {
            if (sb.charAt(i) == zerospace || Unicode.isPureAscii(sb.charAt(i))) {
                System.out.println(sb.charAt(i));
            }
        }
    }

    public static int convertUnicodeToInt(char c) {
        return (int)c;
    }
}