package org.example;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiamondTest {

    @Test
    public void testReturnADiamond(){
       assertEquals("A\n", Diamond.create('A'));
    }

    @Test
    public void testReturnBDiamond(){
        assertEquals(" A\nB B\n A\n", Diamond.create('B'));
    }

    @Ignore
    public void testReturnCDiamond(){
        assertEquals("  A\nB B\nC C\nB B\nA\n", Diamond.create('B'));
    }

}
