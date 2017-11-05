package com.example.carolinereid.fruitmachine;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by carolinereid on 05/11/2017.
 */

public class PlayerTest {

    Player player;

    @Before
    public void before() {
        player = new Player("Liberty Bell", 25);
    }

    @Test
    public void testHasName() {
        assertEquals("Liberty Bell", player.getName());
    }

    @Test
    public void testCheckFunds() {
        assertEquals(25, player.getFunds());
    }
}
