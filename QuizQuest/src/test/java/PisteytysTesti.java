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
import Kayttaja.Pisteytys;

/**
 *
 * @author Simo
 */
public class PisteytysTesti {

    private Pisteytys pisteet;

    public PisteytysTesti() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        pisteet = new Pisteytys();
    }

    @After
    public void tearDown() {
    }

    @Test
    public void alkavatkoPisteetNollasta() {
        assertEquals(this.pisteet.getPisteet(), 0);
    }

    @Test
    public void onkoPisteetOikein() {
        for (int i = 0; i < 4; i++) {
            this.pisteet.vastausOikein();
        }
        assertEquals(this.pisteet.getPisteet(), 400);
    }

    @Test
    public void onkoPisteetOikein2() {
        for (int i = 0; i < 4; i++) {
            this.pisteet.vastausVaarin();
        }
        assertEquals(this.pisteet.getPisteet(), -100);
    }

    @Test
    public void onkoPisteetOikein3() {
        for (int i = 0; i < 4; i++) {
            this.pisteet.vastausOikein();
            this.pisteet.vastausVaarin();
        }
        assertEquals(this.pisteet.getPisteet(), 300);
    }

    @Test
    public void nollautuukoPisteet() {
        for (int i = 0; i < 4; i++) {
            this.pisteet.vastausOikein();
        }
        this.pisteet.nollaaPisteet();
        assertEquals(this.pisteet.getPisteet(), 0);
    }

        // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
