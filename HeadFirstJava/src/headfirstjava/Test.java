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
public class Test {

    public static void main(String[] args) {
        int x = 0;
        int y = 0;
//        while (x < 5) {
//            y = x - y;
//            System.out.print(x + "" + y + " ");
//            x = x + 1;
//        }  // output : 00 11 21 32 42
        //test 2
//        while (x < 5) {
//            y = y + x;
//            System.out.print(x + "" + y + " ");
//            x = x + 1;
//        }  //output: 00 11 23 36 410
//        //test 3
//        while (x < 5) {
//            y = y + 2;
//            if (y > 4) {
//                y = y - 1;
//            }
//            System.out.print(x + "" + y + " ");
//            x = x + 1;
//        } //output: 02 14 25 36 47
//        //test 4
//        while (x < 5) {
//            x = x + 1;
//            y = y + x;
//
//            System.out.print(x + "" + y + " ");
//            x = x + 1;
//        } //output: 11 34 59
//        //test 5
        while (x < 5) {
            if (y < 5) {
                x = x + 1;
                if (y < 3) {
                    x = x - 1;
                }
            }
            y = y + 2;
            System.out.print(x + "" + y + " ");
            x = x + 1;
        } //output: 02 14 36 48
    }
}
