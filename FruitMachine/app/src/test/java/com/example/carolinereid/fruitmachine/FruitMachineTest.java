package com.example.carolinereid.fruitmachine;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

import static com.example.carolinereid.fruitmachine.Symbol.CHERRY;
import static com.example.carolinereid.fruitmachine.Symbol.LEMON;
import static com.example.carolinereid.fruitmachine.Symbol.PIE;
import static org.junit.Assert.assertEquals;

/**
 * Created by carolinereid on 03/11/2017.
 */

public class FruitMachineTest {

    FruitMachine fruitMachine;
    ArrayList<String> testSymbols;


    @Before
    public void before() {
        fruitMachine = new FruitMachine("Eyes on the pies", 500);
        testSymbols = new ArrayList<>();
    }

    @Test
    public void testHasName() {
        assertEquals("Eyes on the pies", fruitMachine.getName());
    }

    @Test
    public void testCheckAmountInBank() {
        assertEquals(500, fruitMachine.getBank());
    }

    @Test
    public void testGetRandomSymbol() {
        Symbol testSymbol = CHERRY;
        fruitMachine.getRandomSymbol();
        FruitMachine spy = Mockito.spy(new FruitMachine("Eyes on the pies", 500));
        Mockito.when(spy.getRandomSymbol()).thenReturn(testSymbol);
        assertEquals(CHERRY, spy.getRandomSymbol());
    }

    @Test
    public void testReturnsJackpot() {
        Symbol testSymbol = PIE;
        fruitMachine.getRandomSymbol();
        FruitMachine spy = Mockito.spy(new FruitMachine("Eyes on the pies", 500));
        Mockito.when(spy.getRandomSymbol()).thenReturn(testSymbol);
        assertEquals("You've hit the jackpot!", spy.resultJackpot());
    }

    @Test
    public void testNoJackpot() {
        Symbol testSymbol = LEMON;
        fruitMachine.getRandomSymbol();
        FruitMachine spy = Mockito.spy(new FruitMachine("Eyes on the pies", 500));
        Mockito.when(spy.getRandomSymbol()).thenReturn(testSymbol);
        assertEquals("Keep your eyes on the pies!", spy.resultJackpot());
    }
}