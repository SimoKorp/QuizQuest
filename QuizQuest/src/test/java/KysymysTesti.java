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
public class KysymysTesti {
    
    private Kysymys kysymys;
    
    public KysymysTesti() {
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
    
    
    
    
    @Test
    public void OnkoKysymysOikein(){
        String oikeakyssari = "1+2";
        assertEquals(oikeakyssari,kysymys.getKysymys());
    }
    
    @Test
    public void OnkoVastausOikein(){
        String oikeavastaus = "3";
        assertEquals(oikeavastaus,kysymys.getVastaus());
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
