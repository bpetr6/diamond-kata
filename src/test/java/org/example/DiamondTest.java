package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiamondTest {

    @Test
    public void testReturnADiamond(){
       assertEquals("A\n", Diamond.create('A'));
    }

    @Test
    public void testReturnBDiamond(){
        assertEquals("""
                 A
                B B
                 A
                """, Diamond.create('B'));
    }

    @Test
    public void testReturnCDiamond(){
        assertEquals("""
                          A
                         B B
                        C   C
                         B B
                          A
                        """, Diamond.create('C'));
    }

    @Test
    public void testReturnEDiamond(){
        assertEquals("""
                         A
                        B B
                       C   C
                      D     D
                     E       E
                      D     D
                       C   C
                        B B
                         A
                     """, Diamond.create('E'));

    }
}
