package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {

        Card card = new Card( 10.0, "Mastercard");

        assertNotNull( card.type );
        assertEquals( "Mastercard", card.type );


//        assertNull( card.type );

//        assertEquals( 0.0, card.amount  );

//        assertNull( null );
//        assertNotNull( 1 );

    }



}
