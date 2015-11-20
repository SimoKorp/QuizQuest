package Kysymykset;

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
import Kysymykset.Kysymys;

/**
 *
 * @author Simo
 */
public class KysymysTest {
    
    private Kysymys kysymys;
    
    public KysymysTest() {
        this.kysymys = new Kysymys("1+2", "3");
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    
    /**
     * Testaa onko kysymys luettu oikein
     */
    
    @Test
    public void OnkoKysymysOikein(){
        String oikeakyssari = "1+2";
        assertEquals(oikeakyssari,kysymys.getKysymys());
    }
    
    /**
     * Testaa onko vastaus luettu oikein
     */
    
    @Test
    public void OnkoVastausOikein(){
        String oikeavastaus = "3";
        assertEquals(oikeavastaus,kysymys.getVastaus());
    }
    
    /**
     * Testaa toimiiko kysymyksen kysytty-statuksen muutos ja lukeminen oikein
     */
    
    @Test
    public void ToimiikoKysytty() {
        kysymys.Kysytty();
        assertEquals(true, kysymys.onkoKysytty());
        
        
    }

 
}
