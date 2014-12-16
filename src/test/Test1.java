/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

import java.util.ArrayList;

/**
 *
 * @author romanm
 */
public class Test1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList al = new ArrayList();
        al.add("Tola");
        al.add("Srola");
        al.add("ala");
        al.add("bela");
        
        for(Object s:al){
            //System.out.println(s);
            new Thread(new Web((String)s)).start();
        }

        /*
        Web w[] = {new Web("Ala"),new Web("Bela")};
        for(Web s:w){
        new Thread(s).start();
            //System.out.println(s);
        }*/

        //GS
        //WebStock ws = new WebStock();
        //ws.stock = "GS";
        //ws.stockId="663137";
        //Thread t = new Thread(ws);
        //t.setName("0");
        //.start();
    }

}
