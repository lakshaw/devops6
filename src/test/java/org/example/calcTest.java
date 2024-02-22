package org.example;

import org.junit.jupiter.api.Test;

        import static org.junit.jupiter.api.Assertions.*;

class helloTest
{
    @Test
    void twoPlusTwoShouldEqualFour()
    {
        calc calc = new calc();
        assertEquals(4,calc.add(2,2));
    }

    @Test
    void threePlusThreeShouldEqualSix()
    {
        calc calc = new calc();
        assertEquals(6,calc.add(3,3));
    }
}