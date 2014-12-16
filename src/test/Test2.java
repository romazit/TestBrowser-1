/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author romanm
 */
public class Test2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Calendar cal = Calendar.getInstance();
        Calendar cal1 = Calendar.getInstance();
        cal1.set(cal1.get(cal1.YEAR), cal1.get(cal1.MONTH), cal1.get(cal1.DAY_OF_MONTH), 9, 30);

        //cal1.set(cal.get(cal.YEAR), cal.get(cal.MONTH), cal.get(cal.d), 9, 30);
        //cal1.set(cal1.HOUR, 8);
        //cal1.set(cal1.MINUTE, 30);

        System.out.println(cal.getTime());
        System.out.println(cal1.getTime());

        if (cal.after(cal1)){

            System.out.println("After");
        }

    }
}
