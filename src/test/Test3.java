/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

import java.util.Calendar;

/**
 *
 * @author romanm
 */
public class Test3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calendar c = Calendar.getInstance();
        c.set(c.get(c.YEAR), c.get(c.MONTH), c.get(c.DAY_OF_MONTH), 9, 30);
        System.out.println(c.getTime());
    }

}
