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
    Symbol symbol;
    ArrayList<String> testSymbols;

    @Before
    public void before() {
        fruitMachine = new FruitMachine("Eyes on the pies", 500, "pie");
        testSymbols = new ArrayList<>();
        testSymbols.add("Lime");
        testSymbols.add("Chocolate");
    }

    @Test
    public void testCheckAmountInBank(){
        assertEquals(500, fruitMachine.getBank());
    }

    @Test
    public void testGetSymbols(){
        assertEquals("pie", fruitMachine.getSymbol());
    }

    @Test
    public void getSymbolAtIndex(){
        Symbol symbols = new Symbol(testSymbols);
        String result = symbols.getSymbolAtIndex(1);
        assertEquals("Chocolate", result);
    }

    @Test
    public void getRandomSymbol(){
        Symbol spy = Mockito.spy(new Symbol(testSymbols));
        Mockito.when(spy.getRandomSymbol()).thenReturn(1);
        String symbol = spy.getSymbol();
        assertEquals("Chocolate", symbol);
    }
}













