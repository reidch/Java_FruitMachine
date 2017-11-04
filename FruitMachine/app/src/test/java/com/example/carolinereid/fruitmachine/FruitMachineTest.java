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
//        Symbol symbol = new Symbol("cherry");
//        spySymbol = Mockito.spy(Symbol);
//        fruitMachine = new FruitMachine(spySymbol);
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

//    @Test
//    public void testGetRandomSymbol(){
//        Mockito.when(spySymbol.spinWheels()).thenReturn("lemon");
//        boolean result = fruitMachine.spinWheels();
//        assertEquals(false, result);
//    }

//    @Test
//    public void testReturnsJackpot(){
//        assertEquals("You've hit the jackpot!", fruitMachine.resultJackpot());
//    }
}













