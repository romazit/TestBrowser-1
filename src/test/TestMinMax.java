/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

/**
 *
 * @author romanm
 */
public class TestMinMax {

    /**
     * @param args the command line arguments
     */
     private static Double current= 10.00;
     
     private static Double lastMin = 0.00;
     private static Double lastMax = 0.00;

    public static void main(String[] args) {
        // TODO code application logic here

        if(current > lastMax){
            lastMax = current;
        }
        if(current < lastMin){
            lastMin = current;
        }

        System.out.println("lastMax= " + lastMax );
        System.out.println("lastMin= " + lastMin);

    }


}
