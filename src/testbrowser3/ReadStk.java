package testbrowser3;

/**
 *
 * @author romanm
 */
import java.io.*;
import java.util.*;

public class ReadStk {

    private ArrayList<String[]> stockList = new ArrayList<String[]>();
    private ArrayList<String[]> stockListTmp = new ArrayList<String[]>();

    //File file = new File("stocks.txt");
    public ReadStk() {

        getData();
        /*
        try {
        File file = new File("stocks.txt");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        try {
        String s;
        while ((s = br.readLine()) != null) {
        stockListTmp.add(s.split("[|]"));
        }
        } finally {
        br.close();
        }
        } catch (IOException ex) {
        ex.printStackTrace();
        }

        for (String[] s : stockListTmp) {
        if (s[0].equals("1")) {

        //System.out.print(s[0] + " ");//isActive
        //System.out.format("  %-4s" ,s[1]);//Symbol
        //System.out.format("  %-10s",s[2]);//idGoogle
        //System.out.format("  %-50s",s[3]);//companyName
        //System.out.format("  %-6s" ,s[4]);//priceBuy
        //System.out.format("  %-1s\n" ,s[5]);//isBuy

        //System.out.println(s);
        stockList.add(s);
        //stockList.add(new String[]{s[0],s[1],s[2],s[3],s[4]});
        }
        }
         */

    }//END CONSTRUCTOR

    public void getData() {

        try {
            File file = new File("stk.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            try {
                String s;
                while ((s = br.readLine()) != null) {
                    stockListTmp.add(s.split("[|]"));
                }
            } finally {
                br.close();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        for (String[] s : stockListTmp) {
            if (s[0].equals("1")) {
                /*
                System.out.print(s[0] + " ");//isActive
                System.out.format("  %-4s" ,s[1]);//Symbol
                System.out.format("  %-10s",s[2]);//idGoogle
                System.out.format("  %-50s",s[3]);//companyName
                System.out.format("  %-6s" ,s[4]);//priceBuy
                System.out.format("  %-1s\n" ,s[5]);//isBuy
                 */
                //System.out.println(s);
                stockList.add(s);
                //stockList.add(new String[]{s[0],s[1],s[2],s[3],s[4]});
            }
        }

    }//END getData

    public ArrayList<String[]> getStockList() {
        return stockList;
    }

    public String stockIsBuy(String symbol) {

        getData();//reload from file

        String isBuy = "0";


        //System.out.println("Size=" + stockListTmp.size());

        for (String[] s : stockListTmp) {
            if (s[0].length() > 0) {
                //System.out.println("s[0]= " + s[0]);
                //System.out.println("s[1]= " + s[1]);

                if (symbol.equals(s[1])) {
                    isBuy = s[5];
                }

            }
        }

        return isBuy;
    }

    public static void main(String[] args) {
        ReadStk rs = new ReadStk();
        //System.out.println(rs.stockIsBuy("AA"));

        
        for (String[] s : rs.getStockList()) {
            System.out.print(s[0] + " ");//isActive
            System.out.format("  %-4s", s[1]);//Symbol
            System.out.format("  %-10s", s[2]);//idGoogle
            System.out.format("  %-50s", s[3]);//companyName
            System.out.format("  %-6s", s[4]);//priceBuy
            System.out.format("  %-1s\n", s[5]);//isBuy
        }
        
    }
}
