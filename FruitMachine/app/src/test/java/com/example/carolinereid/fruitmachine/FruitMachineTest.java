package com.example.carolinereid.fruitmachine;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

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
    public void testCheckAmountInBank(){
        assertEquals(500, fruitMachine.getBank());
    }

    @Test
    public void testGetRandomSymbol(){
        ArrayList<Symbol> testSymbols = new ArrayList<>();
        testSymbols.add(Symbol.CHERRY);
        testSymbols.add(Symbol.CHERRY);
        testSymbols.add(Symbol.CHERRY);
        FruitMachine spy = Mockito.spy(new FruitMachine("Eyes on the pies", 500));
        Mockito.when(spy.spinWheels()).thenReturn(testSymbols);
        assertEquals(Symbol.CHERRY, fruitMachine.spinWheels());
    }

//    returning
//    Expected :CHERRY
//    Actual   :[CHERRY, APPLE, APPLE]
//    need to return an array, rather than just the one Symbol I feed in

    @Test
    public void testReturnsJackpot(){
        ArrayList<Symbol> results = new ArrayList<Symbol>();
        results.add(Symbol.PIE);
        results.add(Symbol.PIE);
        results.add(Symbol.PIE);
        assertEquals("You've hit the jackpot!", fruitMachine.resultJackpot());
    }

//    sometimes returns a match, sometimes doesn't. also, I'm only feeding one PIE into the function in FruitMachine.
}













