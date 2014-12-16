/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

/**
 *
 * @author romanm
 */
public class Web implements Runnable {

    /**
     * @param args the command line arguments
     */
    String str;

    public Web(String str){
        //System.out.println(str);
        this.str = str;
    }

    public void run(){
        //System.out.println(Thread.currentThread().getId());
        System.out.println(str);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Thread t = new Thread(new Web("test"));
        t.start();
    }

}
