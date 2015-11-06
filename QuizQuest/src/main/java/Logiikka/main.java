/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logiikka;

import java.awt.*;
import javax.swing.*;
import Kayttaja.Seikkailija;

public class main {

    public static void main(String[] args) {

        Seikkailija raimo = new Seikkailija("Raimo", "Raivokas");
        
        raimo.vastausOikein();
        int bongot = raimo.getPisteet();
        System.out.println(bongot);
    }

}
