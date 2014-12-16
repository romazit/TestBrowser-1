/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import testbrowser3.WebFile;

/**
 *
 * @author romanm
 */
public class TestDiv {


 
    public static void main(String[] args) {
        try {
             int s  = 0;
             int s1 = 0;
             int s2 = 0;
            WebFile file = new WebFile("http://www.google.com/finance?q=gs");
            String MIME = file.getMIMEType();
            Object content = file.getContent();
            if (MIME.equals("text/html") && content instanceof String) {
                String str = (String) content;
                //System.out.println(str);
                str = str.replaceAll(",", "");

                //Pattern p = Pattern.compile("<span class=\"pr\" id=\"ref_663137_l\">");
                //Pattern p = Pattern.compile("ref_663137_l\">\\d*[.]\\d*[</]");
                
                Pattern p = Pattern.compile("latest_dividend-dividend_yield");
                Matcher m = p.matcher(str);
                boolean b = false;
                while (b = m.find()) {
                    System.out.println("s = " + m.start());
                    s = m.start();
                }

                String str1 = str.substring(s+70, s + 100);
                System.out.println("str1 = " + str1);

                //find start for div
                Pattern p1 = Pattern.compile("\\d/");
                Matcher m1 = p1.matcher(str1);
                boolean b1 = false;
                while (b1 = m1.find()) {
                    System.out.println("s1= " + m1.start());
                    s1 = m1.start();              
                }
                
                //find end for div
                Pattern p2 = Pattern.compile("<");
                Matcher m2 = p2.matcher(str1);
                boolean b2 = false;
                while (b2 = m2.find()) {
                    System.out.println("s2= " + m2.start());
                    s2 = m2.start();              
                }
                
                String str2 = str1.substring(s1+2, s2);
                System.out.println("str2 = " + str2);
                
                
                System.out.println("end");
            }//end if

        } catch (Exception e) {
            System.out.println("exception= " + e);
        }

    }
}
