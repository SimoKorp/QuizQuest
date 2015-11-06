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
public class SeikkailijaTesti {

    private Seikkailija kayttaja;

    public SeikkailijaTesti() {

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

    @Test
    public void luettiinkoNimiOikein() {
        Seikkailija sankari = new Seikkailija("Raimo", "Raivokas");
        String nimi = "Raivokas Raimo";
        assertEquals(nimi, sankari.getNimi());
    }

    @Test
    public void onkoPisteetOikein() {
        this.kayttaja.vastausOikein();
        int pisteet = this.kayttaja.getPisteet();
        assertEquals(pisteet, 100);
    }

    @Test
    public void muuttuikoNimiOikein() {
        kayttaja.asetaPisteet(20000);
        this.kayttaja.VaihdaEeppinenNimi(kayttaja.getPisteet());
        String nimi = kayttaja.getNimi();
        assertEquals(nimi, kayttaja.getNimi());
    }
    
    @Test
    public void muuttuikoNimiOikein2() {
        kayttaja.asetaPisteet(500);
        this.kayttaja.VaihdaEeppinenNimi(kayttaja.getPisteet());
        String nimi = kayttaja.getNimi();
        assertEquals(nimi, kayttaja.getNimi());
    }
    
    @Test
    public void muuttuikoNimiOikein3() {
        kayttaja.asetaPisteet(-300);
        this.kayttaja.VaihdaParjaavaNimi(kayttaja.getPisteet());
        String nimi = kayttaja.getNimi();
        assertEquals(nimi, kayttaja.getNimi());
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
