package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiamondTest {

    @Test
    public void testPrintSingleChar(){
       assertEquals("A", Diamond.print('A'));
    }

}
