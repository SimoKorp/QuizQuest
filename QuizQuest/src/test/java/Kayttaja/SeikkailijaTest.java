package Kayttaja;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import Kayttaja.Seikkailija;

/**
 *
 * @author Simo
 */
public class SeikkailijaTest {

    private Seikkailija kayttaja;

    public SeikkailijaTest() {

    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        kayttaja = new Seikkailija("Ukko", "vihainen");
    }

    @After
    public void tearDown() {
    }
    
    /**
     * testaa luettiinko nimi adjektiiveineen oikein
     */

    @Test
    public void luettiinkoNimiOikein() {
        Seikkailija sankari = new Seikkailija("Raimo", "Raivokas");
        String nimi = "Raivokas Raimo";
        assertEquals(nimi, sankari.getNimi());
    }

    /**
     * Testaa onko kayttajalla oikea määrä pisteet
     */
    
    @Test
    public void onkoPisteetOikein() {
        this.kayttaja.vastausOikein();
        int pisteet = this.kayttaja.getPisteet();
        assertEquals(pisteet, 200);
    }
    
    /**
     * Testaa muuttuiko nimi pisteiden mukaan oikein
     */

    @Test
    public void muuttuikoNimiOikein() {
        kayttaja.asetaPisteet(20000);
        this.kayttaja.VaihdaEeppinenNimi(kayttaja.getPisteet());
        String nimi = kayttaja.getNimi();
        assertEquals(nimi, kayttaja.getNimi());
    }
    
    /**
     * Testaa muuttuiko nimi pisteiden mukaan oikein
     */
    
    @Test
    public void muuttuikoNimiOikein2() {
        kayttaja.asetaPisteet(500);
        this.kayttaja.VaihdaEeppinenNimi(kayttaja.getPisteet());
        String nimi = kayttaja.getNimi();
        assertEquals(nimi, kayttaja.getNimi());
    }
    
    /**
     * Testaa muuttuiko nimi pisteiden mukaan oikein
     */
    
    @Test
    public void muuttuikoNimiOikein3() {
        kayttaja.asetaPisteet(-300);
        this.kayttaja.VaihdaParjaavaNimi(kayttaja.getPisteet());
        String nimi = kayttaja.getNimi();
        assertEquals(nimi, kayttaja.getNimi());
    }

    
}
