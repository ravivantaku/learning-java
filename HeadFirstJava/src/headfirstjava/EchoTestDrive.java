/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package headfirstjava;

/**
 *
 * @author vantakr
 */
public class EchoTestDrive {

    public static void main(String[] args) {
        Echo e1 = new Echo();
        Echo e2 = e1; // Echo e2 = new Echo();
        int x = 0;
        while (x < 4) {
            e1.hello();
            e1.count = e1.count + 1;
            if( x == 3){
                e2.count = e2.count + 1;
            }
            if(x > 0) {
              e2.count = e1.count + e2.count;
            }
            x = x + 1;
        }
        System.out.println(e2.count);
    }
}
