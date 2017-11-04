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
//    Symbol symbol;
    ArrayList<String> testSymbols;
//    Symbol spySymbol;

    @Before
    public void before() {
        fruitMachine = new FruitMachine("Eyes on the pies", 500);
        testSymbols = new ArrayList<>();
//        testSymbols.add("Cherry");
//        testSymbols.add("Cherry");
//        testSymbols.add("Cherry");
//        Symbol symbol = new Symbol("cherry");
//        spySymbol = Mockito.spy(Symbol);
//        fruitMachine = new FruitMachine(spySymbol);
    }

    @Test
    public void testCheckAmountInBank(){
        assertEquals(500, fruitMachine.getBank());
    }

    @Test
    public void getRandomSymbol(){
        ArrayList<Symbol> row = new ArrayList<>();
        row.add(Symbol.CHERRY);
        row.add(Symbol.CHERRY);
        row.add(Symbol.CHERRY);
        FruitMachine spy = Mockito.spy(new FruitMachine(3));
        Mockito.when(spy.spinWheels()).thenReturn();
        assertEquals(ArrayList<"Cherry, Cherry, Cherry">, fruitMachine.spinWheels());
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













