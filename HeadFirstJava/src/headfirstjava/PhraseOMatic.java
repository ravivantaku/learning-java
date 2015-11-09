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
public class PhraseOMatic {

    public static void main(String[] args) {
        String[] wordListOne = {"24/7 multiTiar", "30,OOOfoot", "B-to-B", "win-win", "frontend", "web- based", "pervasive", "smart", "sixsigma", "cri tical-path", "dynamic"};
        String[] wordListTwo = {"empowered", "sticky", "value-added.", "oriented", "centric", "distributed", "clustered", "branded", "outaide-the-box", "positioned", "networked", " focused", "leveraged", "aligned", "targeted", "shared", "cooperative", "accelerated"};
        String[] wordListThree = {"process", "tippingpoint",
            "solution", "architecture", "core competency",
            "strategy", "mindshare", "portal", "apace", "vision",
            "adigm", "ssion"};
        // find out how many words  In each list.
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;
        //generate 3 random numbers
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);
        //now build a phrase
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
        System.out.println("What we need is " + phrase);
    }
}
