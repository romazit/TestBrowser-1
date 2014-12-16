/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author romanm
 */
import java.io.*;
import java.util.*;

public class ReadStocks {

    /**
     * @param args the command line arguments
     */
    ArrayList<String[]> stockList = new ArrayList<String[]>();

    //File file = new File("stocks.txt");
    public ReadStocks() {

        try {
            File file = new File("stocks.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            try {
                String s;
                while ((s = br.readLine()) != null) {
                    stockList.add(s.split("[|]"));
                }
            } finally {
                br.close();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        for (String[] s : stockList) {
            if (s[0].equals("1")) {
                System.out.print(s[0] + " ");//isActive
                System.out.format("  %-4s" ,s[1]);//Symbol
                System.out.format("  %-10s",s[2]);//idGoogle
                System.out.format("  %-50s",s[3]);//companyName
                System.out.format("  %-6s" ,s[4]);//priceBuy
                System.out.format("  %-1s\n" ,s[5]);//isBuy
            }
        }

    }//END CONSTRUCTOR

    

    public static void main(String[] args) {
        // TODO code application logic here
        ReadStocks rs = new ReadStocks();
    //System.out.println(rs.file.isFile());
    }
}
