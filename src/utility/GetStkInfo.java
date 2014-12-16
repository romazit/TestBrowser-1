package utility;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import testbrowser3.WebFile;

/**
 *
 * @author romanm
 */
public class GetStkInfo {

public static String stkSymbol = "GTAT";
public static int stkGoogleNum;
public static String stkGoogleDes;

    public static void main(String[] args) {
        System.out.println(stkSymbol);
        try {
            int beginStr = 0;
            int endStr   = 0;
            boolean b;
            String str1 = "";
            Pattern p;
            Matcher m;
            
            WebFile file = new WebFile("http://www.google.com/finance?q=" + stkSymbol);
            String MIME = file.getMIMEType();
            Object content = file.getContent();
            if (MIME.equals("text/html") && content instanceof String) {
                String str = (String) content;

                /*Get stkGoogleNum*/
                p = Pattern.compile("http://www.google.com/finance\\?cid=");
                m = p.matcher(str);
                b = false;

                while (b = m.find()) {
                    beginStr = m.start();
                    break;
                }

                str1 = str.substring(beginStr, beginStr + 100);

                p = Pattern.compile(">");
                m = p.matcher(str1);
                b = false;
                while (b = m.find()) {
                    endStr = m.start();
                    break;
                }
                stkGoogleNum = Integer.valueOf(str1.substring(34, endStr - 1));
                System.out.println("" + stkGoogleNum);
                /*End Get stkGoogleNum*/
                
                
                /*Get stkGoogleDes*/
                p = Pattern.compile("</script><title>");
                m = p.matcher(str);
                b = false;

                while (b = m.find()) {
                    beginStr = m.start();
                    break;
                }

                str1 = str.substring(beginStr, beginStr + 100);
                
                p = Pattern.compile(": ");
                m = p.matcher(str1);
                b = false;
                while (b = m.find()) {
                    endStr = m.start();
                    break;
                }
                stkGoogleDes = str1.substring(16,endStr);
                System.out.println(stkGoogleDes); 
                /*End Get stkGoogleDes*/
                
                
                

            }//end if

        } catch (Exception e) {
            System.err.print("Exception = " + e);
        }
    }

}
